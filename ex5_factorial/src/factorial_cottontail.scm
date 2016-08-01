(define fact
  (lambda (n)
    (define fact-helper
      (lambda (n acc)
        (if (zero? n)
            acc
            (fact-helper (- n 1) (* acc n)))))
    (fact-helper n 1)))

; Tässä käytetään pienempää syötettä koska Cottontail-toteutus
; ei tällä hetkellä tue tarpeeksi suuria lukuja.
(display (fact 10))
