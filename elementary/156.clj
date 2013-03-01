; Combine two seqs? Sounds like a zip operation to me. Zip will take the
; lower of the two seq sizes as the result size, so an infinite seq of the
; default value will result in a keys-sized map
(fn [d k] (zipmap k (repeat d)))
