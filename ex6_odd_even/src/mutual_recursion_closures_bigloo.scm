(module odd-even (main main))

(define odd? #f)
(define even? #f)

(set! odd?
  (lambda (x)
    (if (zero? x)
        #f
        (even? (- x 1)))))

(set! even?
  (lambda (x)
    (if (zero? x)
        #t
        (odd? (- x 1)))))

(define main
  (lambda (args)
    (display (odd? 10))
    (display (even? 10))
    (display (odd? 9))
    (display (even? 9))
    (display (odd? 2147483647))))
