(ns simple-closure
  (:gen-class))

(defn add [x]
  (fn [y]
    (+ x y)))

(defn -main []
  (println ((add 5) 4))
  (def add10 (add 10))
  (println (add10 90))
  (println (add10 999)))

