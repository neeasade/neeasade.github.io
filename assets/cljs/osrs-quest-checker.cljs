(ns osrs.quest-checker
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]
            [clojure.string :as string]
            [clojure.walk :as walk]
            [osrs.data :refer [quest-data optimal-quest-list]]))

(require '[ajax.core :refer [GET]])

(def state (r/atom {:player-string ""
                    :error ""
                    :players {}
                    :blockers {}
                    :quest "None"}))

(defn format [s & replacers]
  (reduce (fn [acc new] (string/replace-first acc "%s" (str new)))
          s replacers))

(defn parse-url
  ([] (parse-url (.. js/window -location -href)))
  ([url]
   (let [result (-> url
                    js/URL.
                    .-searchParams
                    js/Object.fromEntries
                    (js->clj :keywordize-keys true))]
     (when-not (empty? result)
       result))))

(defn save-to-url []
  (let [save-state (select-keys @state [:quest :player-string])
        url (str (.. js/window -location -protocol) "//" (.. js/window -location -host) (.. js/window -location -pathname)
                 "?"
                 (.  (js/URLSearchParams. (clj->js save-state)) toString))]
    (. (. js/window -history) pushState
       (clj->js {:path url})
       "" url)
    (set! (. js/document -title) (str (:quest @state) "- osrs quest checker"))))

(defn search-box [items on-select]
  (let [search-term (r/atom "")]
    (fn []
      (let [filtered-items (when-not (empty? @search-term)
                             (filter #(clojure.string/includes?
                                       (clojure.string/lower-case %)
                                       (clojure.string/lower-case @search-term))
                                     items))]
        [:div.search-box
         [:input {:type "text"
                  :placeholder "Quest Search..."
                  :value @search-term
                  :on-change #(reset! search-term (-> % .-target .-value))}]
         (when filtered-items
           [:ul.search-results
            (for [item filtered-items]
              ^{:key item}
              [:li {:on-click #(do (on-select item)
                                   (reset! search-term ""))}
               item])])]))))

(declare update-blockers!)
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
                                       :on-click #(do (swap! state assoc :quest dep-name)
                                                      (update-blockers!)
                                                      )}
                                   (if (empty? (blockers player-data
                                                         dep-name))
                                     (str dep-name " ✅")
                                     dep-name)]]))
                             ;; bad data
                             (->> (:quests want)
                                  distinct
                                  (remove (partial = "Kudos")))
                             )
        missing-skills (->> (:skills want)
                            (remove (fn [[skill level]]
                                      (>= (skill (:levels player-data))
                                          level)))
                            (map (fn [[s l]]
                                   [:span
                                    (str (-> player-data :levels s) "/")
                                    [:b (str l " " (name s))]]
                                   )))]
    (concat missing-skills missing-quests)))


(defn update-blockers! []
  (save-to-url)
  (swap! state assoc :blockers {})
  (run! (fn [player]
          (when-not (= "None" (:quest @state))
            (println "update blockers " player)
            (swap! state assoc-in [:blockers player]
                   (blockers (get-in @state [:players player])
                             (:quest @state)))))
        (keys (:players @state))))

(defn debounce [f ms]
  (let [timeout (atom nil)]
    (fn [& args]
      (when @timeout (js/clearTimeout @timeout))
      (reset! timeout
              (js/setTimeout
               #(apply f args)
               ms)))))

(defn handler [player response]
  (println "found player" player)
  (swap! state assoc-in [:players player] (walk/keywordize-keys response))
  (update-blockers!))

(defn error-handler [player e]
  (swap! state assoc :error
         (format "error finding player '%s': %s"
                 player
                 (get-in e [:response "error"]))))

(defn update-player-stats! [players]
  (swap! state assoc :players {})
  (swap! state assoc :error "")
  (let [players (map string/trim (string/split players #","))]
    ;; (swap! state assoc :players players)
    (run! (fn [player]
            (println "looking up" player)
            (GET (str "https://sync.runescape.wiki/runelite/player/" player "/STANDARD")
                 {:handler (partial handler player)
                  :error-handler (partial error-handler player)
                  })) players)))

(def update-player-stats-debounce!
  (debounce update-player-stats! 600))

(defn update-quest-optimal []
  (let [players (keys (:players @state))]
    (swap! state assoc :quest
           (or (->> optimal-quest-list
                    (some
                     (fn [quest]
                       (some
                        (fn [player]
                          (when (not (= 2 (or (get-in @state [:players player :quests (keyword quest)]) 2)))
                            quest)) ; comp for extra stuff we don't have in quest data
                        players))))
               "None")))
  (update-blockers!))

(defn update-quest-doable []
  (let [players (keys (:players @state))]
    (swap! state assoc :quest
           (or
            (->> optimal-quest-list
                 (some
                  (fn [quest]
                    (and
                     (every?
                      (fn [player]
                        (when (and
                               (not (= 2 (or (get-in @state [:players player :quests (keyword quest)]) 2)))
                               (empty? (blockers (get-in @state [:players player])
                                                 quest)))
                          quest)) ; comp for extra stuff we don't have in quest data
                      players)
                     quest))))
            "None")))
  (update-blockers!))


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
   [:p "Selected Quest: " [:b
                           [:a {:href (str "https://oldschool.runescape.wiki/w/" (string/replace (:quest @state) " " "_"))}
                            (:quest @state)]]]
   [(search-box (map :title quest-data)
                #(do (swap! state assoc :quest %)
                     (update-blockers!)))]
   [:button {:on-click update-quest-optimal} "auto pick quest (next optimal)" ]
   [:button {:on-click update-quest-doable} "auto pick quest (next doable)" ]

   (for [player (keys (:blockers @state))]
     (if (= 2 (get-in @state [:players player :quests (keyword (:quest @state))]))
       [:h2 (str player " has already done this quest!😲")]
       (let [blockers (get-in @state [:blockers player])]
         [:div [:h2 (if (empty? blockers)
                      (str player " is ready! ✅")
                      (str player " is missing:"))]
          (when-not (empty? blockers)
            [:ul (for [line blockers]
                   [:li line])])])))])

(when-let [url-state (parse-url)]
  (swap! state merge url-state)
  (update-player-stats! (:player-string url-state))
  (update-blockers!))

(.addEventListener
 js/window "popstate"
 (fn [e]
   (when-let [url-state (parse-url)]
     (swap! state merge url-state)
     ;; (update-player-stats! (:player-string url-state))
     (update-blockers!))))

(rdom/render [my-component] (.getElementById js/document "app"))
