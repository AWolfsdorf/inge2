; ¬(x ∨ y) ≡ (¬x ∧ ¬y)

(declare-const x Bool)
(declare-const y Bool)
(assert (= (not (or x y)) (and (not x) (not y))))

; solve
(check-sat)
(get-model)

; ; output
; sat
; (model 
; )
