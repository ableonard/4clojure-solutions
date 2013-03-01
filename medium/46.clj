; Since the 4 examples only have 2 arguments each, this could be a little
; shorter. However, this version will work an any number of arguments.
#(fn [& a] (apply % (reverse a)))
