; Standard fib function. The trick here is getting the character count low. I eventually gave up
; and used this 58 character version. I'm sure I'm missing something fundamental that would shorten
; it down to the 20-some odd characters the lowest score has, but c'est la vie.
#(loop [a [1] b 1 c %] (if (= 1 c) a (recur (conj a b) (+ (last a) b) (- c 1))))
