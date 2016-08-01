(module counter (main main))

(define increment-counter #f)
(define get-counter #f)

(define init-counter
  (lambda ()
    (define c 0)

    (set! increment-counter
      (lambda ()
        (set! c (+ c 1))))

    (set! get-counter
      (lambda () c))))

(define main
  (lambda (args)
    (init-counter)
    (print (get-counter))
    (increment-counter)
    (print (get-counter))
    (increment-counter)
    (increment-counter)
    (print (get-counter))))

