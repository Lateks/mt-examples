(define (fact n)
  (define (fact-helper c acc)
    (if (> c n)
      acc
      (fact-helper (+ c 1) (* acc c))))
  (fact-helper 1 1))

(display (fact 10000))
