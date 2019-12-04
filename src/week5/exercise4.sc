object exercise4 {
  def merge[T](xs: List[T], ys: List[T])(implicit ord: Ordering[T]): List[T] = {

    (xs, ys) match {
      case (Nil, ys) => ys
      case (xs, Nil) => xs
      case (x :: xs1, y :: ys1) =>
        if (ord.lt(x, y)) x :: merge(xs1, ys)
        else y :: merge(xs, ys1)
    }

  }

  def mergeSort[T](xs: List[T])(implicit ord: Ordering[T]): List[T] = {
    val n = xs.length / 2
    if (n == 0) return xs
    else {
      val (fst, snd) = xs splitAt n
      merge(mergeSort(fst), mergeSort(snd))
    }
  }

  val numbers = List(2, 6, 1, 7, 4, 8)
  println(mergeSort(numbers))

  val fruits = List("apple", "orange", "banana", "mango")
  println(mergeSort(fruits))
}