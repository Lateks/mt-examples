; Trampoliineilla
(ns mutual-recursion-trampolines
  (:gen-class))

(declare is-even-fn)

; Palauttaa nyt sulkeuman
(defn is-odd-fn [n]
  (do
    (if (zero? n)
      false
      #(is-even-fn (- n 1)))))

(defn is-even-fn [n]
  (do
    (if (zero? n)
      true
      #(is-odd-fn (- n 1)))))

; Käärii sulkeuman palauttavan funktion trampoliiniin
(defn is-odd [n]
  (trampoline is-odd-fn n))

(defn is-even [n]
  (trampoline is-even-fn n))

(defn -main []
  (println (is-odd 10))
  (println (is-even 10))
  (println (is-odd 9))
  (println (is-even 9))
  (println (is-odd 2147483647)))
