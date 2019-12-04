object exercise5 {
  def squareList(xs: List[Int]): List[Int] = xs match {
    case Nil => xs
    case y :: ys => y * y :: squareList(ys)
  }

  def squareListMap(xs: List[Int]): List[Int] = xs map (x => x * x)

  squareList(List(1, 2, 5, 6))
  squareListMap(List(1, 2, 5, 6))

  val fruits = List("apple", "orange", "banana", "mango")
  fruits filterNot (s => s.isEmpty)

  val numbers = List(2, 6, 1, -7, 4, 8, -1, -4)

  println(numbers partition (x => x > 0))

  println(numbers takeWhile (x => x > 0))

  println(numbers dropWhile (x => x > 0))

  val data = List(2, 2, 2, 1, 0, 0, 2)

  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case x :: xs1 =>
      val (first, rest) = xs span (y => y == x)
      first :: pack(rest)
  }

  println(pack(data))


  def encode[T](xs: List[T]): List[(T, Int)] = xs match {
    case Nil => Nil
    case x :: xs1 =>
      val (first, rest) = xs span (y => y == x)
      (x, first.length) :: encode(rest)
  }

  println(encode(data))

}