object exercise3 {
  def merge[T](xs: List[T], ys: List[T])(lt: (T, T) => Boolean): List[T] = {

    (xs, ys) match {
      case (Nil, ys) => ys
      case (xs, Nil) => xs
      case (x :: xs1, y :: ys1) =>
        if (lt(x, y)) x :: merge(xs1, ys)(lt)
        else y :: merge(xs, ys1)(lt)
    }

  }

  def mergeSort[T](xs: List[T])(lt: (T, T) => Boolean): List[T] = {
    val n = xs.length / 2
    if (n == 0) return xs
    else {
      val (fst, snd) = xs splitAt n
      merge(mergeSort(fst)(lt), mergeSort(snd)(lt))(lt)
    }
  }

  val numbers = List(2, 6, 1, 7, 4, 8)
  println(mergeSort(numbers)((x, y) => x > y))

  val fruits = List("apple", "orange", "banana", "mango")
  println(mergeSort(fruits)((x, y) => x.compareTo(y) > 0))
}