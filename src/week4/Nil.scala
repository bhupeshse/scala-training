package week4

class Nil[T] extends List[T] {
  override def isEmpty = true

  override def head = throw new NoSuchFieldException("Nil.Head")

  override def tail = throw new NoSuchFieldException("Nil.Head")
}
