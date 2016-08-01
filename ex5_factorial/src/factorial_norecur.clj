; Normal tail-recursive version of factorial in Clojure
; (not using recur). Crashes with a StackOverflowException
; because Clojure does not do TCO when not using the
; loop-recur structure.
(ns factorial_norecur
  (:gen-class))

(defn fact[n]
  (defn fact-helper [n acc]
    (if (zero? n)
      acc
      (fact-helper (- n 1) (*' acc n))))
  (fact-helper n 1))

(defn -main []
  (println (fact 10000)))

