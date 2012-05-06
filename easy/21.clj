; We can get around the restriction on using 'nth by turning the provided Seq
; into a vector, which acts as a function on its index for the provided arg
#((vec %) %2)
