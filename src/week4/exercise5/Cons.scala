package week4.exercise5

class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  override def isEmpty = false
}
