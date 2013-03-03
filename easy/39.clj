; Naive approach is to recursively step through both seqs and conj the first
; element from each into a final seq. This works, but it's verbose.
 
; #(loop [x % y %2 z []] 
;   (if (or (empty? x) (empty? y))
;     z
;     (recur (rest x) (rest y) (conj z (first x) (first y)))))

; However, since we're taking elements from each collection, the easiest way
; to do this is to apply the list function via map and concatenate the
; resulting 2 element lists.

#(mapcat list % %2)
