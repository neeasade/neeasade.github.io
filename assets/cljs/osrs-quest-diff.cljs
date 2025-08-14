(ns osrs.quest-diff
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]
            [clojure.string :as string]
            [clojure.walk :as walk]
            [osrs.data :refer [quest-data all-quests]]
            [neeasade.util :refer [format parse-url save-to-url search-box debounce]]
            [ajax.core :as ajax]))

(def state (r/atom {:player-string ""
                    :error ""
                    :players {}
                    :blockers {}}))

(defn blockers [player-data quest-name]
  (let [player-data (assoc-in player-data [:levels :questpoints] 400) ; faking/not handling for now
        want (first (filter #(= (:title %) quest-name) quest-data))

        ;; ---
        missing-quests (keep (fn [dep-name]
                               ;; 0 not started, 1 started, 2 done
                               (when (not (= 2 ((keyword dep-name) (:quests player-data))))
                                 ;; (str "Quest: " dep-name)
                                 [:span "Quest: "
                                  [:a {:href "javascript:;"
                                       ;; :on-click #(do (swap! state assoc :quest dep-name) (update-blockers!))
                                       }
                                   (if (empty? (blockers player-data dep-name))
                                     (str dep-name " ✅")
                                     dep-name)]]))
                             ;; bad data
                             (->> (:quests want)
                                  distinct
                                  (remove (partial = "Kudos"))))

        missing-skills (->> (:skills want)
                            (remove (fn [[skill level]]
                                      (>= (skill (:levels player-data))
                                          level)))
                            (map (fn [[s l]]
                                   [:span
                                    (str (-> player-data :levels s) "/")
                                    [:b (str l " " (name s))]])))]

    (concat missing-skills missing-quests)))

(defn handler [player response]
  (println "found player" player)
  (swap! state assoc-in [:players player] (walk/keywordize-keys response))
  (update-blockers!))

(defn error-handler [player e]
  (swap! state assoc :error
         (format "error finding player '%s': %s" player (get-in e [:response "error"]))))

(defn player-finished-quests [player-data]
  ;; player-data is from wikisync plugin json
  (concat
   (keep (fn [[quest status]]
           (when (= status 2)
             quest))
         (get player-data "quests"))
   (->> (get player-data "achievement_diaries")
        (mapcat
         (fn [[place diary-data]]
           (keep (fn [difficulty]
                   (when (get-in player-data ["achievement_diaries" place difficulty "complete"])
                     (format "%s %s Diary" place difficulty)))
                 (keys diary-data)))))))

(defn player-table []
  (let [players (keys (:blockers @state))]
    ;; form url jump like:

    )
  [:table
   []
   ]
  )

(defn my-component []
  [:div
   [:input {:type "text"
            :placeholder "RSNs"
            :value (:player-string @state)
            :on-change (fn [e]
                         (let [v (-> e .-target .-value)]
                           (swap! state assoc :player-string v)
                           (update-player-stats-debounce! v)))}]
   (when-let [e (:error @state)] [:h2 e])

   (for [player (keys (:blockers @state))]
     #_(if (= 2 (get-in @state [:players player :quests (keyword (:quest @state))]))
         [:h2 (str player " has already done this quest!😲")]
         (let [blockers (get-in @state [:blockers player])]
           [:div [:h2 (if (empty? blockers)
                        (str player " is ready! ✅")
                        (str player " is missing:"))]
            (when-not (empty? blockers)
              [:ul (for [line blockers]
                     [:li line])])]))
     )])
