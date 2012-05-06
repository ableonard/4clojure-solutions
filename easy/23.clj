; This was a bit of a tough one for me, as the method that immediately came to
; mind was a recursive solution. Unfortunately for my golf score, the recursive
; solution is a little verbose.

; #(loop [x % y []] (if (empty? x) y (recur (rest x) (cons (first x) y))))

; Based on the score graph I saw, there were obviously much shorter ways of
; solving the problem. Realizing that I could use a vector's index to iterate
; through the sequence in reverse, I came up with this.

#(for [m (range (- (count %) 1) -1 -1)] ((vec %) m))

; The absolute shortest solution relies on where a value is inserted into lists
