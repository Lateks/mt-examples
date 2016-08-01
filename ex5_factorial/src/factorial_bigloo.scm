; OS X:
; Käännä: bigloo -jvm factorial_bigloo.scm
; Aja tuloksena syntyvä a.out.
;
; Windows:
; bigloo -dotnet factorial_bigloo.scm
; Aja tuloksena syntyvä a.exe.
;
; Huom: Bigloolla on .NET-alustalla erinäisiä käännösvipuja,
; jotka säätelevät häntärekursion optimointistrategiaa.
(module examples (main main))

(define fact
  (lambda (n)
    (define fact-helper
      (lambda (n acc)
        (if (zero? n)
            acc
            (fact-helper (- n 1) (* acc n)))))
    (fact-helper n 1)))

(define main
  (lambda (args)
    (display (fact 10000))))
