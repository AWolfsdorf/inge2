; Variable declarations
(declare-fun a () Int)
(declare-fun b () Int)
(declare-fun c () Int)

; Constraints
; Z1 
;(assert (or (<= a 0) (<= b 0) (<= c 0)))
; (not Z1) 
(assert (not (or (<= a 0) (<= b 0) (<= c 0))))

;Z2
(assert (not (and (> (+ a b) c) (> (+ a c) b) (> (+ b c) a))))
;(not Z2)
;(assert (and (> (+ a b) c) (> (+ a c) b) (> (+ b c) a)))

;Z3
;(assert (and (= a b) (= b c)))
;(not Z3)
;(assert (not (and (= a b) (= b c))))


;Z4
;(assert (or (= a b) (= b c) (= a c)))
;(not Z4)
;(assert (not (or (= a b) (= b c) (= a c))))


; Solve
(check-sat)
(get-model)
