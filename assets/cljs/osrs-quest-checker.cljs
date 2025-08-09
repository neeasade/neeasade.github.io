(ns osrs.quest-checker
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]
            [clojure.string :as string]
            [clojure.walk :as walk]
            [osrs.data :refer [quest-data]]))

(require '[ajax.core :refer [GET]])

(defn format [s & replacers]
  (reduce (fn [acc new] (string/replace-first acc "%s" (str new)))
          s replacers))


#_(defn parse-url
    ([] (parse-url (.. js/window -location -href)))
    ([url]
     (let [result (-> url
                      js/URL.
                      .-searchParams
                      js/Object.fromEntries
                      (js->clj :keywordize-keys true))]

       (-> result
           ;; (update :players (fn [s] (when s (into [] (map #(js/parseInt % 10) (string/split s #","))))))
           (update :ui (fn [s] (if (or (not s) (string/blank? s))
                                 #{:st}
                                 (into #{} (map keyword (string/split s #","))))))))))



;; (defn load-search-url []
;;   (when (:search (parse-url))
;;     (swap! searchpage-state update :search (constantly (:search (parse-url))))))

;; (defn save-search-url []
;;   (let [save-state (select-keys @searchpage-state [:search])
;;         url (str (.. js/window -location -protocol) "//" (.. js/window -location -host) (.. js/window -location -pathname)
;;                  "?"
;;                  (.  (js/URLSearchParams. (clj->js save-state)) toString))]
;;     (. (. js/window -history) replaceState
;;        (clj->js {:path url})
;;        "" url)
;;     ;; (set! (. js/document -title) (string/join " - " (list (:title @state) )))
;;     ))

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
                  :placeholder "Search..."
                  :value @search-term
                  :on-change #(reset! search-term (-> % .-target .-value))}]
         (when filtered-items
           [:ul.search-results
            (for [item filtered-items]
              ^{:key item}
              [:li {:on-click #(do (on-select item)
                                   (reset! search-term ""))}
               item])])]))))

(defn blockers [player-data quest-name]
  (let [player-data (assoc-in player-data [:levels :questpoints] 400) ; faking/not handling for now
        ;; quest-name "Dragon Slayer II"
        want (first (filter #(= (:title %) quest-name) quest-data))

        ;; ---
        missing-quests (keep (fn [dep-name]
                               ;; 0 not started, 1 started, 2 done
                               (when (not (= 2 ((keyword dep-name) (:quests player-data))))
                                 (str "Quest: " dep-name)))
                             ;; bad data
                             (->> (:quests want)
                                  distinct
                                  (remove (partial = "Kudos"))))

        missing-skills (->> (:skills want)
                            (remove (fn [[skill level]]
                                      (>= (skill (:levels player-data))
                                          level)))
                            (map (fn [[s l]] (str l " " (name s)))))]
    (concat missing-skills missing-quests)))

(def state (r/atom {:players-input "neeasade"
                    :error ""
                    :players {}
                    :blockers {}
                    :quest "None"}))

(defn update-blockers! []
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

(def update-player-stats!
  (debounce
   (fn [players]
     (swap! state assoc :players {})
     (let [players (map string/trim (string/split players #","))]
       ;; (swap! state assoc :players players)
       (run! (fn [player]
               (println "looking up" player)
               (GET (str "https://sync.runescape.wiki/runelite/player/" player "/STANDARD")
                    {:handler (partial handler player)
                     :error-handler (partial error-handler player)
                     })) players)))
   1000))

(defn my-component []
  [:div
   [:input {:type "text"
            :placeholder "RSNs"
            :value (:player-string @state)
            :on-change (fn [e]
                         (let [v (-> e .-target .-value)]
                           (swap! state assoc :player-string v)
                           (update-player-stats! v)))}]
   (when-let [e (:error @state)] [:p e])
   [:p "Selected Quest: " [:b (:quest @state)]]
   [(search-box (map :title quest-data)
                #(do (swap! state assoc :quest %)
                     (update-blockers!)))]

   (for [player (keys (:blockers @state))]
     (let [blockers (get-in @state [:blockers player])]
       [:div [:h2 (if (empty? blockers)
                    (str player " is good! ✅")
                    (str player " is missing:"))]
        (when-not (empty? blockers)
          [:ul (for [line blockers] [:li line])])])
     )])
;; export function to use from JavaScript:
;; (set! (.-make_request js/window) make-request)

(rdom/render [my-component] (.getElementById js/document "app"))
