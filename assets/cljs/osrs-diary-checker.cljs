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

(defn tier-anchor-id [region-name tier]
  (-> (str region-name "-" (name tier))
      string/lower-case
      (string/replace " " "-")))

(defn wiki-diary-url [region-name tier]
  (str "https://oldschool.runescape.wiki/w/"
       (string/replace region-name " " "_")
       "_Diary#"
       (string/capitalize (name tier))))

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

(defn combat-level [levels]
  (let [{:keys [Defence Hitpoints Prayer Attack Strength Ranged Magic]} levels
        base   (* 1/4 (+ Defence Hitpoints (js/Math.floor (* Prayer 1/2))))
        melee  (* 13/40 (+ Attack Strength))
        ranged (* 13/40 (js/Math.floor (* Ranged 3/2)))
        mage   (* 13/40 (js/Math.floor (* Magic 3/2)))]
    (js/Math.floor (+ base (max melee ranged mage)))))

(defn handler [response]
  (println "found player")
  (let [data (walk/keywordize-keys response)
        data (update-in data [:levels] #(assoc % :Combat (combat-level (:levels data))) )]
    (swap! state assoc :player-data data)
    )
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

(defn sentence-start? [text idx]
  (or (zero? idx)
      (some? (re-find #"[\].!?:\"]\s*$" (subs text 0 idx)))))

(defn wiki-link [text]
  [:a {:href (str "https://oldschool.runescape.wiki/w/"
                  (-> text (string/replace " " "_") (js/encodeURI)))
       :target "_blank"}
   text])

(defn linkify-text [text]
  (let [text (-> text
                 (string/replace #"([a-zA-Z]) Note" "$1. Note")
                 (string/replace #" , " ", "))
        pattern (js/RegExp. "[A-Z][a-zA-Z\\-]+(?:'[a-z]+)?(?:\\s+(?:[A-Z][a-zA-Z\\-]*(?:'[a-z]+)?|[0-9][a-zA-Z0-9\\-]*))*" "g")
        parts (loop [parts [] last-idx 0]
                (let [m (.exec pattern text)]
                  (if m
                    (let [match-text (aget m 0)
                          idx (.-index m)
                          end (+ idx (count match-text))
                          before (subs text last-idx idx)]
                      (if (sentence-start? text idx)
                        (let [first-word (re-find #"[A-Z][a-zA-Z\-]+" match-text)
                              skip-end (+ idx (count first-word))]
                          (set! (.-lastIndex pattern) skip-end)
                          (recur (conj parts (str before first-word)) skip-end))
                        (recur (conj parts before (wiki-link match-text)) end)))
                    (conj parts (subs text last-idx)))))]
    (if (= 1 (count parts))
      (first parts)
      (into [:span] parts))))

(defn task-component [region tier task-data task-idx player-data]
  (let [done? (task-status player-data region tier task-idx)]
    [:li {:class (str "task-item " (if done? "task-done" "task-pending"))}
     [:div {:class "task-content"}
      [:span {:class "task-status"} (if done? "✅" "")]
      [:span {:class "task-text"} (linkify-text (:task task-data))]]
     (let [{:keys [skills quests other]} (:requirements task-data)
           has-reqs? (or (seq skills) (seq quests) (seq other))]
       (when has-reqs?
         [:ul {:class "task-requirements"}
          (for [{:keys [skill level boostable]} skills]
            (let [player-level (get-in player-data [:levels (keyword skill)] 0)
                  met? (>= player-level level)]
              ^{:key (str skill level)}
              [:li {:class (str "req-skill " (if met? "req-met" "req-unmet"))}
               (if met?
                 [:span "✅ " (str level " " skill)]
                 [:span "❌ " (str level " " skill) (str " (current: " player-level ")")
                  (when boostable
                    [:span " ("
                     [:a {:href (str "https://oldschool.runescape.wiki/w/Temporary_skill_boost/"
                                     (string/replace skill " " "_"))
                          :target "_blank"}
                      "boostable"]
                     ")"])])]))
          (for [quest quests]
            (let [quest-status (get-in player-data [:quests (keyword quest)])
                  done? (= 2 quest-status)
                  wiki-url (str "https://oldschool.runescape.wiki/w/"
                                (-> quest (string/replace " " "_") (js/encodeURI)))]
              ^{:key quest}
              [:li {:class (str "req-quest " (if done? "req-met" "req-unmet"))}
               [:span (if done? "✅ " "❌ ") "Quest: "
                [:a {:href wiki-url :target "_blank"} quest]]]))
          (for [o other]
            ^{:key o}
            [:li {:class "req-other"}
             (linkify-text o)
             ])]))]))

(defn tier-progress [player-data region tier diary-tier-data]
  (let [tasks (:tasks diary-tier-data)
        done-count (count (filter #(task-status player-data region tier %) (range (count tasks))))]
    {:done done-count :total (count tasks)}))

(defn tier-component [region tier diary-tier-data player-data show-completed]
  (let [complete? (tier-complete? player-data region tier)
        tasks (:tasks diary-tier-data)
        {:keys [done total]} (tier-progress player-data region tier diary-tier-data)
        tasks-to-show (if show-completed
                        (map-indexed vector tasks)
                        (keep-indexed
                         (fn [idx task]
                           (when-not (task-status player-data region tier idx)
                             [idx task]))
                         tasks))]
    (when (or show-completed (seq tasks-to-show))
      [:details {:class (str "tier tier-" (name tier))
                 :id (tier-anchor-id region tier)
                 :open (not complete?)}
       [:summary {:class (if complete? "tier-complete" "tier-incomplete")}
        (str (string/capitalize (name tier)) " (" (- total done) " left)")
        (when complete? " ✅") " "
        [:a {:href (wiki-diary-url region tier) :target "_blank"
             :style {:font-size "0.85em"}
             :on-click (fn [e] (.stopPropagation e))}
         "📖"]]
       (when (seq tasks-to-show)
         [:ul {:class "task-list"}
          (for [[idx task] tasks-to-show]
            ^{:key idx}
            [task-component region tier task idx player-data])])])))

(defn region-name-from-key [region-key]
  (-> (name region-key)
      (string/replace "-" " ")
      (string/replace " Diary" "")))

(defn region-component [region-key diary-data player-data show-completed]
  (let [region-name (region-name-from-key region-key)]
    [:div {:class "diary-region"}
     [:h3 region-name]
     (for [tier tier-order]
       (when-let [tier-data (get diary-data tier)]
         ^{:key tier}
         [tier-component region-name tier tier-data player-data show-completed]))]))

(defn progress-bar [region-key diary-data player-data]
  (let [region-name (region-name-from-key region-key)
        segments (for [tier tier-order]
                   (when-let [tier-data (get diary-data tier)]
                     (let [{:keys [done total]} (tier-progress player-data region-name tier tier-data)
                           pct (if (zero? total) 0 (/ done total))]
                       {:tier tier :done done :total total :pct pct})))
        segments (remove nil? segments)]
    [:div {:class "progress-bar-container"
           :style {
                   :margin-left "5rem"
                   :margin-right "5rem"
                   }
           }
     [:div {:class "progress-bar-label"} region-name]
     [:div {:class "progress-bar"}
      (for [{:keys [tier done total pct]} segments]
        ^{:key tier}
        [:a {:href (str "#" (tier-anchor-id region-name tier))
             :class (str "progress-segment segment-" (name tier))
             :style {:width "25%"
                     :border "1px solid #555"
                     :text-align "center"
                     :text-decoration "none"
                     :color "inherit"
                     :background
                     (str "linear-gradient(to right, "
                          "#bbbbbb"
                          " " (* pct 100) "%, "
                          "var(--background_weak) "
                          (* pct 100) "%)")}}
         [:span {:class "segment-tooltip"} (str  done "/" total)]])]]))

(defn progress-overview [player-data]
  [:div {:class "progress-overview"}
   [:h3 "Progress Overview"]
   (for [[region-key diary-data] (sort-by (comp name first) all-diaries)]
     ^{:key region-key}
     [progress-bar region-key diary-data player-data])])

(defn my-component []
  (let [{:keys [player-string error player-data show-completed]} @state]
    [:div {:class "diary-checker"
           }
     [:div {:style {:text-align "center"}}
      [:input {:type "text"
               :placeholder "RSN"
               :value player-string
               :on-change (fn [e]
                            (let [v (-> e .-target .-value)]
                              (swap! state assoc :player-string v)
                              (update-player-stats-debounce! v)))}]
      [:br]
      [:label {:class "show-completed-toggle"}
       [:input {:type "checkbox"
                :checked show-completed
                :on-change #(swap! state update :show-completed not)}]
       " Show completed tasks"]]
     (when-not (empty? error) [:h2 {:class "error"} error])
     (when player-data
       [:div
        [progress-overview player-data]
        [:div {:class "diary-list"}
         (for [[region-key diary-data] (sort-by (comp name first) all-diaries)]
           ^{:key region-key}
           [region-component region-key diary-data player-data show-completed])]])]))

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
