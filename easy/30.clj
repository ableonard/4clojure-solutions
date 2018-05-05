#(reduce (fn [x y] (if (= (last x) y) x (conj x y))) [] %)
