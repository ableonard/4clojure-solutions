; Since we've been gven the "less than" function, we can simply apply it to
; see if the first arg is less than the second and reverse the order of the args
; to check the inverse. The only possibility remaining is that they're equal.
#(cond (% %2 %3) :lt (% %3 %2) :gt :else :eq)
