; (x ∧ y) ≡ ¬(¬x ∨ ¬y)

(declare-const x Bool)
(declare-const y Bool)
(assert (= (and x y) (not (or (not x) (not y)))))

; solve
(check-sat)
(get-model)

; ; output
; sat
; (model
; )
