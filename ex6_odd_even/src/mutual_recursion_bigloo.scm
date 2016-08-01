; JVM: StackOverflowError
; -fglobal-tailc ei vaikuta tekevän mitään (ehkä toimii
; vain C-takaosan kanssa?)

(module odd-even (main main))

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

(define main
  (lambda (args)
    (display (odd? 10))
    (display (even? 10))
    (display (odd? 9))
    (display (even? 9))
    (display (odd? 2147483647))))
