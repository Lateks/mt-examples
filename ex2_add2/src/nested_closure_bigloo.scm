(module nested_closure (main main))

(define add
  (lambda (x)
    (lambda (y)
      (lambda (z)
        (+ x y z)))))

(define main
  (lambda (args)
    (print (((add 5) 4) 3))))

