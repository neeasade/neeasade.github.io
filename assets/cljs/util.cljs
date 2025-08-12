(ns neeasade.util
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]
            [clojure.string :as string]
            [clojure.walk :as walk]
            [osrs.data :refer [quest-data optimal-quest-list]]))

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

(defn save-to-url [save-state]
  (let [
        ;; save-state state
        url (str (.. js/window -location -protocol) "//" (.. js/window -location -host) (.. js/window -location -pathname)
                 "?"
                 (.  (js/URLSearchParams. (clj->js save-state)) toString))]
    (. (. js/window -history) pushState
       (clj->js {:path url})
       "" url)))

(defn debounce [f ms]
  (let [timeout (atom nil)]
    (fn [& args]
      (when @timeout (js/clearTimeout @timeout))
      (reset! timeout
              (js/setTimeout
               #(apply f args)
               ms)))))

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
