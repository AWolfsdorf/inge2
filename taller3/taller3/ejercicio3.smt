(declare-const a1 Real)
(declare-const a2 Real)
(declare-const a3 Real)

; 16 mod 2
(assert (= a1 (mod 16 2)))

; 16 dividido por 4
(assert (= a2 (/ 16 4)))

; El resto de la division entera de 16 por 5.
(assert (= a3 (rem 16 5)))

(check-sat)
(get-model)

; ; output
; sat
; (model 
;   (define-fun a2 () Real
;     4.0)
;   (define-fun a1 () Real
;     0.0)
;   (define-fun a3 () Real
;     1.0)
; )
