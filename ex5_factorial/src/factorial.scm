(define fact
  (lambda (n)
    (define fact-helper
      (lambda (n acc)
        (if (zero? n)
            acc
            (fact-helper (- n 1) (* acc n)))))
    (fact-helper n 1)))

(display (fact 10000))

