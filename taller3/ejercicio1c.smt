; ¬(x ∧ y) ≡ ¬(¬x ∧ ¬y)

(declare-const x Bool)
(declare-const y Bool)
(assert (= (not (and x y)) (not (and (not x) (not y)))))

; solve
(check-sat)
(get-model)

; ; output
; sat
; (model 
;   (define-fun y () Bool
;     true)
;   (define-fun x () Bool
;     false)
; )

