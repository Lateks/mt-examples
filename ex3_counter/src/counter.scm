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

(init-counter)
(display (get-counter))
(increment-counter)
(display (get-counter))
(increment-counter)
(increment-counter)
(display (get-counter))

