(ns wordle
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]
            [clojure.string :as string]
            [clojure.walk :as walk]
            ;; [osrs.data :refer [quest-data optimal-quest-list]]
            ;; [neeasade.util :refer [format parse-url save-to-url search-box debounce]]
            [wordle.data :as wordle]
            ))

(defn format [s & replacers]
  (reduce (fn [acc new] (string/replace-first acc "%s" (str new)))
          s replacers))

(def state (r/atom {:greens ["" "" "" "" ""]
                    :yellows ["" "" "" "" ""]
                    :pattern ""
                    :grays ""
                    :suggestions []}))

(defn letters [s]
  (apply str (re-seq #"[a-z]" s)))

(defn update-suggestions []
  (let [greens (:greens @state)
        yellows (:yellows @state)
        in (->> (range 5)
                (map (fn [i]
                       (cond
                         (not (string/blank? (nth greens i))) (nth greens i)

                         (and (string/blank? (nth greens i))
                              (string/blank? (nth yellows i)))
                         "-"

                         (string/blank? (nth greens i))
                         (format "{%s}?" (nth yellows i) yellows)
                         )))
                (apply str))
        wrong (:grays @state)

        pattern (->> (re-seq #"[a-z]\??|-|\{[a-z]+\}\?" in)
                     (map (fn [m] (cond (= m "-") (format "[^%s]" (or wrong "."))
                                        (string/ends-with? m "?") (format "[^%s]" (str (letters m) wrong))
                                        :else m)))
                     (apply str))]

    (swap! state assoc :pattern in)

    (swap! state assoc :suggestions
           (->> wordle/words
                (filter (partial re-matches (re-pattern pattern)))
                (filter (fn [word] (every? (set word) (letters in))))
                (shuffle)))))

(defn my-component []
  [:div {:class "wordle"}
   [:br]
   [:div "greens: "
    [:br]
    (for [i (range 5)]
      (let [v (nth (:greens @state) i)]
        [:input {:class "letter"
                 :type "text"
                 :value v
                 :on-change (fn [e]
                              (let [new (-> e .-target .-value)]
                                (swap! state update
                                       :greens (fn [current]
                                                 (assoc current i new)))
                                (update-suggestions)
                                ))}]))]

   [:div "yellows: "
    [:br]
    (for [i (range 5)]
      (let [v (nth (:yellows @state) i)]
        [:input {:class "letter"
                 :type "text"
                 :value v
                 :on-change (fn [e]
                              (let [new (-> e .-target .-value)]
                                (swap! state update
                                       :yellows (fn [current]
                                                  (assoc current i new)))

                                (update-suggestions)
                                ))}]))]
   [:div "grays: "
    [:input {:type "text"
             :value (:grays @state)
             :on-change (fn [e]
                          (let [new (-> e .-target .-value)]
                            (swap! state assoc :grays new)

                            (update-suggestions)
                            ))}]]
   ;; [:div (pr-str @state)]
   [:ul (for [w (:suggestions @state)]
          [:li w])]])

(rdom/render [my-component] (.getElementById js/document "app"))
