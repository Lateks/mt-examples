(ns counter
  (:gen-class))

(defn counter []
  (let [c (atom 0)
        increment-counter (fn [] (swap! c #(+ % 1)))
        get-counter (fn [] @c)]
    { :increment-counter increment-counter
      :get-counter get-counter }))

(defn -main []
  (let [ctr (counter)]
    (println ((:get-counter ctr)))
    ((:increment-counter ctr))
    (println ((:get-counter ctr)))
    ((:increment-counter ctr))
    ((:increment-counter ctr))
    (println ((:get-counter ctr)))))
