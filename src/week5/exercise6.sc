object exercise6 {

  val data = List(2, 2, 2, 1, 0, 0, 2)

  println(data reduceLeft ((x, y) => x + y))
  println(data reduce (_ + _))

  (data foldLeft (2)) (_ + _)

  def concat[T](xs: List[T], ys: List[T]): List[T] =
    (xs foldRight   ys) (_ :: _)

  println(concat(List(1, 2, 4), List(3, 5, 6)))
}