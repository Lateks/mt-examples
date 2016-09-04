(module examples (main main))

(define fact
  (lambda (n)
    (define fact-helper
      (lambda (n acc)
        (if (zero? n)
            acc
            (fact-helper (- n 1) (* acc n)))))
    (fact-helper n 1)))

(define main
  (lambda (args)
    (display (fact 10000))))
