package week4.exercise6

trait List[+T] {
  def prepend[U >: T](elem: U): List[U] = new Cons(elem, this)
}
