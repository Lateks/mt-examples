(module simple_closure (main main))

(define add
  (lambda (x)
    (lambda (y)
      (+ x y))))

(define main
  (lambda (args)
    (print ((add 5) 4))

    (define add10 (add 10))

    (print (add10 90))
    (print (add10 999))))

