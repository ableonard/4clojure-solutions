; The canonical factorial problem. Since we're in a functional language, we
; might as well use a functional approach. Unfortunately, Clojure's range
; function starts at 0 and uses an exclusive upper bound, so it's not quite
; as clean as it could be.
#(reduce * (range 1 (inc %)))
