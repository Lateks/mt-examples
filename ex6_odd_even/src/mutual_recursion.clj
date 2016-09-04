(ns mutual-recursion
  (:gen-class))

(declare is-even)

(defn is-odd [n]
  (do
    (if (zero? n)
      false
      (is-even (- n 1)))))

(defn is-even [n]
  (do
    (if (zero? n)
      true
      (is-odd (- n 1)))))

(defn -main []
  (println (is-odd 10))
  (println (is-even 10))
  (println (is-odd 9))
  (println (is-even 9))
  (println (is-odd 2147483647)))
