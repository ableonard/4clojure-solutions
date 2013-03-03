; We're combining two seqs by alternating between them, so interleave seems
; like a good starting point. Unfortunately, it would leave us with an equal
; number of separators as items in the seq being separated. That means an extra
; separator at the beginning or at the end. If it's at the beginning, we can
; simply use 'rest' to ignore it.

#(rest (interleave (repeat %) %2))
