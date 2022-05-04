; 3x + 2y = 36
(declare-const x Int)
(declare-const y Int)
(assert (= (+ (* x 3) (* 2 y)) 36))

(check-sat)
(get-model)

; ; output
; sat
; (model 
;   (define-fun y () Int
;     0)
;   (define-fun x () Int
;     12)
; )
