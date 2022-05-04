; x ∗ y = 64
(declare-const x Int)
(declare-const y Int)
(assert (= (* x y) 64))

(check-sat)
(get-model)

; ; output
; sat
; (model 
;   (define-fun y () Int
;     1)
;   (define-fun x () Int
;     64)
; )
