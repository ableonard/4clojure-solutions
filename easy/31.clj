#(reduce
    (fn [a e]
        (if (not= (first (last a)) e)
         (conj a [e])
         (conj (vec (drop-last a)) (conj (last a) e))))
    []
    %)

;; This implementation stores the state of the last visited value in the
;; resulting it's producing. However, you can avoid the need for explicitly
;; tracking the last value by utilizing "partition-by". As long as the
;; partitioning function returns a different value whenever it reaches a new
;; value in the sequence, you're good.
;;
;; As an example, #(partition-by identiy %) would work. For code golf, you can use
;; any function whose value will reliably change when the input value changes
;; (such as "str").
