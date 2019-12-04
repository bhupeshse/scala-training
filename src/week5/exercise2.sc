object exercise2 {
  def merge(xs: List[Int], ys: List[Int]): List[Int] = {

    (xs, ys) match {
      case (Nil, ys) => ys
      case (xs, Nil) => xs
      case (x :: xs1, y :: ys1) =>
        if (x < y) x :: merge(xs1, ys)
        else y :: merge(xs, ys1)
    }

  }

  def mergeSort(xs: List[Int]): List[Int] = {
    val n = xs.length / 2
    if (n == 0) return xs
    else {
      val (fst, snd) = xs splitAt n
      merge(mergeSort(fst), mergeSort(snd))
    }
  }

  val numbers = List(2, 6, 1, 7, 4, 8)
  println(mergeSort(numbers))
}