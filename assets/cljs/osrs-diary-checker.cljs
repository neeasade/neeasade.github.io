(ns osrs.diary-checker
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]
            [clojure.string :as string]
            [clojure.walk :as walk]
            [osrs.diary.data :refer [all-diaries]]
            [neeasade.util :refer [format parse-url save-to-url debounce]]
            [ajax.core :as ajax]))

(def state (r/atom {:player-string ""
                    :error ""
                    :player-data nil
                    :show-completed false}))

(def tier-order [:easy :medium :hard :elite])

(defn normalize-diary-key [k]
  (-> (name k)
      (string/replace " Diary" "")
      keyword))

(defn diary-data-key [region-name]
  (keyword (str region-name " Diary")))

(defn get-player-diary [player-data region tier]
  (let [k1 (keyword region)
        k2 (keyword (string/capitalize (name tier)))
        result (get-in player-data [:achievement_diaries k1 k2])]
    result))

(defn task-status [player-data region tier task-idx]
  (let [diary (get-player-diary player-data region tier)]
    (get-in diary [:tasks task-idx])))

(defn tier-complete? [player-data region tier]
  (let [diary (get-player-diary player-data region tier)]
    (:complete diary)))

(defn handler [response]
  (println "found player")
  (let [data (walk/keywordize-keys response)]
    (swap! state assoc :player-data data))
  (save-to-url (select-keys @state [:player-string])))

(defn error-handler [e]
  (swap! state assoc :error
         (format "error finding player: %s"
                 (get-in e [:response "error"]))))

(defn update-player-stats! [player]
  (swap! state assoc :player-data nil)
  (swap! state assoc :error "")
  (let [player (string/trim player)]
    (when-not (empty? player)
      (ajax/GET (str "https://sync.runescape.wiki/runelite/player/" player "/STANDARD")
                {:handler handler
                 :error-handler error-handler}))))

(def update-player-stats-debounce!
  (debounce update-player-stats! 600))

(defn task-component [region tier task-data task-idx player-data]
  (let [done? (task-status player-data region tier task-idx)]
    [:li {:class (if done? "task-done" "task-pending")}
     [:span {:class "task-status"} (if done? "✅" "❌")]
     [:span {:class "task-text"} (:task task-data)]
     (let [{:keys [skills quests other]} (:requirements task-data)
           has-reqs? (or (seq skills) (seq quests) (seq other))]
       (when has-reqs?
         [:ul {:class "task-requirements"}
          (for [{:keys [skill level]} skills]
            ^{:key (str skill level)}
            [:li {:class "req-skill"} (str level " " skill)])
          (for [quest quests]
            ^{:key quest}
            [:li {:class "req-quest"} (str "Quest: " quest)])
          (for [o other]
            ^{:key o}
            [:li {:class "req-other"} o])]))]))

(defn tier-component [region tier diary-tier-data player-data show-completed]
  (let [complete? (tier-complete? player-data region tier)
        tasks (:tasks diary-tier-data)
        incomplete-indices (keep-indexed
                            (fn [idx _]
                              (when-not (task-status player-data region tier idx)
                                idx))
                            tasks)
        tasks-to-show (if show-completed
                        (map-indexed vector tasks)
                        (keep-indexed
                         (fn [idx task]
                           (when-not (task-status player-data region tier idx)
                             [idx task]))
                         tasks))]
    (when (or show-completed (seq incomplete-indices))
      [:div {:class (str "tier tier-" (name tier))}
       [:h4 {:class (if complete? "tier-complete" "tier-incomplete")}
        (str (string/capitalize (name tier))
             " (" (- (count tasks) (count incomplete-indices)) "/" (count tasks) ")")
        (when complete? " ✅")]
       (when (seq tasks-to-show)
         [:ul {:class "task-list"}
          (for [[idx task] tasks-to-show]
            ^{:key idx}
            [task-component region tier task idx player-data])])])))

(defn region-component [region-key diary-data player-data show-completed]
  (let [region-name (-> (name region-key)
                        (string/replace "-" " ")
                        (string/replace " Diary" ""))]
    [:div {:class "diary-region"}
     [:h3 region-name]
     (for [tier tier-order]
       (when-let [tier-data (get diary-data tier)]
         ^{:key tier}
         [tier-component region-name tier tier-data player-data show-completed]))]))

(defn my-component []
  (let [{:keys [player-string error player-data show-completed]} @state]
    [:div {:class "diary-checker"}
     [:input {:type "text"
              :placeholder "RSN"
              :value player-string
              :on-change (fn [e]
                           (let [v (-> e .-target .-value)]
                             (swap! state assoc :player-string v)
                             (update-player-stats-debounce! v)))}]
     [:label {:class "show-completed-toggle"}
      [:input {:type "checkbox"
               :checked show-completed
               :on-change #(swap! state update :show-completed not)}]
      " Show completed tasks"]
     (when-not (empty? error) [:h2 {:class "error"} error])
     (when player-data
       [:div {:class "diary-list"}
        (for [[region-key diary-data] (sort-by (comp name first) all-diaries)]
          ^{:key region-key}
          [region-component region-key diary-data player-data show-completed])])]))

;; on load
(when-let [url-state (parse-url)]
  (swap! state merge url-state)
  (when (:player-string url-state)
    (update-player-stats! (:player-string url-state))))

;; ongoing...
(.addEventListener
 js/window "popstate"
 (fn [e]
   (when-let [url-state (parse-url)]
     (swap! state merge url-state))))

(rdom/render [my-component] (.getElementById js/document "app"))
