(require '[reagent.core :as r]
         '[reagent.dom :as rdom]
         '[clojure.string :as string])

(def levels [0
             83
             174
             276
             388
             512
             650
             801
             969
             1154
             1358
             1584
             1833
             2107
             2411
             2746
             3115
             3523
             3973
             4470
             5018
             5624
             6291
             7028
             7842
             8740
             9730
             10824
             12031
             13363
             14833
             16456
             18247
             20224
             22406
             24815
             27473
             30408
             33648
             37224
             41171
             45529
             50339
             55649
             61512
             67983
             75127
             83014
             91721
             101333
             111945
             123660
             136594
             150872
             166636
             184040
             203254
             224466
             247886
             273742
             302288
             333804
             368599
             407015
             449428
             496254
             547953
             605032
             668051
             737627
             814445
             899257
             992895
             1096278
             1210421
             1336443
             1475581
             1629200
             1798808
             1986068
             2192818
             2421087
             2673114
             2951373
             3258594
             3597792
             3972294
             4385776
             4842295
             5346332
             5902831
             6517253
             7195629
             7944614
             8771558
             9684577
             10692629
             11805606
             13034431])

(defn parse-xp [s]
  (if-let [[_ n] (re-matches #"([0-9.]+)k" s)]
    (* 1000 (read-string n))
    (if-let [[_ n] (re-matches #"([0-9.]+)m" s)]
      (* 1000000 (read-string n))
      (if-let [_ (re-matches #"[0-9]+" s)]
        (read-string s)))))

(defn hours-left [xp xp-per-hour level]
  (let [goal (nth levels (dec level))]
    (Math/round
     (/ (- goal xp) xp-per-hour))))

(def state (r/atom {:hours 0
                    :level ""
                    :current-xp ""
                    :xp-per-hour  ""
                    :error nil
                    }))

(defn error [s]
  (swap! state update :error (constantly s)))

(defn update-state [& args]
  (apply swap! state update args)
  (prn @state)

  (let [{:keys [current-xp xp-per-hour level hours]} @state
        xp-per-hour (-> xp-per-hour (string/trim) (string/replace "," "") parse-xp)
        current-xp (-> current-xp (string/trim) (string/replace "," "") parse-xp)
        level (int (read-string level))]

    (error nil)
    (cond
      (nil? xp-per-hour) (error "error parsing XP per hour")
      (nil? current-xp) (error "error parsing current XP")
      :else (do
              (swap! state update :hours (constantly (hours-left current-xp xp-per-hour level)))))))

;; todo: input box for current level -> current xp sync (later)

(defn my-component []
  (let [{:keys [current-xp xp-per-hour level hours error]} @state]
    [:div
     [:p "Current XP: " [:input {:type "text"
                                 :value current-xp
                                 :on-change #(update-state :current-xp (fn [] (-> % .-target .-value)))}]]
     [:p "Target Level: " [:input {:type "number"
                                   :value level
                                   :on-change #(update-state :level (fn [] (-> % .-target .-value)))}]]
     [:p "XP per hour: " [:input {:type "text"
                                  :value xp-per-hour
                                  :on-change #(update-state :xp-per-hour (fn [] (-> % .-target .-value)))}]]
     (when error [:p "Error: " error])
     [:h1 "HOURS: " hours]]))

(rdom/render [my-component] (.getElementById js/document "app"))
