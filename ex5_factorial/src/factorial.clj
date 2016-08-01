; ======================================
; To build (remember the compile path!):
; ======================================
; clojure
; (alias for java -cp ~/clojure-1.8.0/clojure-1.8.0.jar:. clojure.main)
; (set! *compile-path* "build")
; (compile 'factorial)
;
; Note: the build directory must exist prior to doing this
; or compilation will fail.
;
; =======
; To run:
; =======
; cd build
; java -cp ~/clojure-1.8.0/clojure-1.8.0.jar:. factorial
;
; =====
; Note:
; =====
; Using *' operator instead of * to avoid integer overflow.
(ns factorial
  (:gen-class))

(defn fact [n]
  (loop [n n acc 1]
    (if (zero? n)
      acc
      (recur (- n 1) (*' acc n)))))

(defn -main []
  (println (fact 10000)))

