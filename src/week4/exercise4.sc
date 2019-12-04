import week3.{Emtpy, IntSet, NonEmpty}

val a:Array[NonEmpty] = Array(new NonEmpty(1, Emtpy, Emtpy))
val b:Array[IntSet] = a
b(0) = Emtpy
val s: NonEmpty = a