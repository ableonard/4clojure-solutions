; Since Clojure is so Seq-focused, there are tons of ways to manipulate them in
; the standard library.  Since 4Clojure isn't concerned with performance, we
; can choose the clearest (and, since I'm golfing, shortest) option.
#(second (reverse %))
