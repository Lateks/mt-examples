(define add
  (lambda (x)
    (lambda (y)
      (+ x y))))

(display ((add 5) 4))

(define add10 (add 10))

(display (add10 90))
(display (add10 999))

