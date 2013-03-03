; The naive solution here is to iterate through the list, keeping track of the
; current index, and dropping the item every time you reach the given number of
; elements. An alternate approach is to split the collection into
; groups of the desired size and then concat them all back together. That
; suggests the use of partition.

; #(partition %2 %) [1 2 3 4 5 6 7 8] 3) ; returns ((1 2 3) (4 5 6))

; There are a couple of problems with this. First, we are still including the
; elements that need to be dropped. To get rid of them, we need to give a step
; size to partition. Additionally, partition wants all partitions to be the
; same size, so we actually need to use partition-all to make sure we pick up
; any elements at the end of the collection.

#(apply concat (partition-all (dec %2) %2 %))
