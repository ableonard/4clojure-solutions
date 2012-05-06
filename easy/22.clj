; This is a bit longer than I'd like, because I discovered I needed to use the
; fn form to declare the anonymous function.  With #, the % variable was being
; treated as a sequence and not the first of two arguments.
reduce (fn [x y] (+ 1 x)) 0
