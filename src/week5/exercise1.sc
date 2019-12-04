object exercise1 {
  val fruits = List("apple", "orange")
  println(fruits)
  val newFruits = "apple" :: "mango" :: "orange" :: Nil
  println(newFruits)
  println(newFruits.tail.head)

  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    case List() => List(x)
    case y :: ys => if (y > x) y :: insert(x, ys) else x :: xs
  }

  def isort(xs: List[Int]): List[Int] = xs match {
    case List() => List()
    case y :: ys => insert(y, isort(ys))
  }


  println(isort(List(4, 2, 6, 1, 7)))

  val numbers = List(4, 2, 6, 1, 7)
  println(numbers.length)
  println(numbers.last)
  println(numbers.init)
  println(numbers.take(2))
  println(numbers.drop(3))
  println(numbers(3))

  val newNumbers = List(5, 6)
  println(newNumbers.updated(1, 2))
  println(newNumbers.reverse)


  def reverse[T](xs: List[T]): List[T] = xs match {
    case List() => List()
    case y :: ys => reverse(ys) ++ List(y)
  }

  def removeAt(n: Int, xs: List[Int]) = (xs take n) ::: (xs drop n + 1)
}