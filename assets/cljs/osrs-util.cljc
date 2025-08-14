(ns neeasade.util
  (:require [clojure.string :as string]
            [clojure.walk :as walk]
            [neeasade.util :refer [format]]
            [osrs.data :refer [quest-data optimal-quest-list]]))

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
