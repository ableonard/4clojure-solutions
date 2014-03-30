; Since we're given the index of where we want to split the seq, we can use
; separate invocations of take and drop to create the result seq.

#(list (take % %2) (drop % %2))
