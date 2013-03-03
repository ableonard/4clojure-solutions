; Naive solution is to iterate through the seq and repeat each element the
; specified number of times.

; #(loop [a % b []]
;   (if (empty? a)
;     b
;     (recur (rest a) (into b (repeat %2 (first a))))))

; However, since we're essentially applying a function to each element in the
; collection and concatenating all the results together we can use the handy
; shortcut mapcat. We'll need to use partial to create the function to be
; applied, because we're already inside a lambda (and using the fn syntax
; is more expensive from a code golf standpoint).

#(mapcat (partial repeat %2) %)
