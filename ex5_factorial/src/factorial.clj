(ns factorial
  (:gen-class))

(defn fact [n]
  (loop [n n acc 1]
    (if (zero? n)
      acc
      (recur (- n 1) (*' acc n)))))

(defn -main []
  (println (fact 10000)))

