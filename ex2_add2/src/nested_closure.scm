(define add
  (lambda (x)
    (lambda (y)
      (lambda (z)
        (+ x y z)))))

(display (((add 5) 4) 3))

