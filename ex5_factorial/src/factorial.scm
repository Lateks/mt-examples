; Tämä Scheme-ohjelma kääntyy esim. Kawalla, mutta ei
; Bigloolla, joka vaatii moduulimäärittelyn.

(define fact
  (lambda (n)
    (define fact-helper
      (lambda (n acc)
        (if (zero? n)
            acc
            (fact-helper (- n 1) (* acc n)))))
    (fact-helper n 1)))

(display (fact 10000))

; Tulostus erotettuna laskennasta:
; (define res (fact 10000))
; (display res)
