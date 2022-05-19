; Variable declarations
(declare-fun k () Real)

; Constraints

;Z1
(assert (= (+ 5.0 k) 0.0))
;(not Z1)
;(assert (not (= (+ 5.0 k) 0.0)))

;Z2
;(assert (= (+ 1.0 k) 0.0))
;(not Z2)
;(assert (not (= (+ 1.0 k) 0.0)))

;Z3
;(assert (= (+ 3.0 k) 0.0))
;(not Z3)
;(assert (not (= (+ 3.0 k) 0.0)))


; Solve
(check-sat)
(get-model)

