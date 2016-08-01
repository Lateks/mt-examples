; Ilman --full-tailcalls-vipua tulee StackOverflowError
; jos käyttää isoa lukua (Huom. Kawa näyttää vaativan
; että kokonaislukuliteraali mahtuu 32-bittiseen
; kokonaislukuarvoon.)
;

(define odd?
  (lambda (x)
    (if (zero? x)
        #f
        (even? (- x 1)))))

(define even?
  (lambda (x)
    (if (zero? x)
        #t
        (odd? (- x 1)))))

(display (odd? 10))
(display (even? 10))
(display (odd? 9))
(display (even? 9))
(display (odd? 2147483647))
