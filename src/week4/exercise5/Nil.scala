package week4.exercise5

object Nil extends List[Nothing] {
  override def isEmpty = true

  override def head = throw new NoSuchFieldException("Nil.Head")

  override def tail = throw new NoSuchFieldException("Nil.Head")
}
