(ns osrs.quest-checker
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]
            [clojure.string :as string]
            [clojure.walk :as walk]
            [osrs.data :refer [quest-data]]))


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
;;     ;; (set! (. js/document -title) (string/join " - " (list (:title @state) "SleepyCypress")))
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
  (let [
        ;; player-data (json/parse-string (slurp "/home/neeasade/osrs_wiki.txt") true)
        player-data (assoc-in player-data [:levels :questpoints] 400) ; faking
        ;; quest-name "Dragon Slayer II"
        want (first (filter #(= (:title %) quest-name) quest-data))
        ;; quest-name (string/replace quest-name "Recipe for Disaster - " "Recipe for Disaster/")


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

(def state (r/atom {
                    :players "neeasade"
                    :player-stats {}
                    :player-missing {}
                    :blockers {}
                    :selected "placeholder"
                    }))


(require '[ajax.core :refer [GET]])
;;curl | jq . > ~/osrs_wiki.txt

(defn handler [player response]
  (swap! state assoc-in [:player-stats player] (walk/keywordize-keys response))

  (swap! state assoc-in [:player-missing player]
         (blockers (walk/keywordize-keys response) (:selected @state))) (prn @state)
  )

(defn make-request []
  (->> (map string/trim (string/split (:players @state) #","))
       (run! (fn [player]
               (GET (str "https://sync.runescape.wiki/runelite/player/" player "/STANDARD")
                    {:handler (partial handler player)})))))

(defn my-component []
  [:div
   [:input {:type "text"
            :placeholder "RSNs"
            :value (:players @state)
            :on-change #(swap! state assoc :players (-> % .-target .-value))
            }]
   [(search-box (map :title quest-data) #(swap! state assoc :selected %))]
   [:p (str "players: " (:players @state))]
   [:p (str "selected state: " (:selected @state))]

   (for [player (keys (:player-missing @state))]
     [:div [:h2 (str player " is missing:")]
      [:ul
       (prn "ul for " player)
       (for [line (get-in @state [:player-missing player])]
         [:li line])]])
   [:button {:on-click make-request} "check!"]
   ])
;; export function to use from JavaScript:
;; (set! (.-make_request js/window) make-request)

(rdom/render [my-component] (.getElementById js/document "app"))
