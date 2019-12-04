import week4.{Cons, Nil}

object List {
  //List(1,2)
  def apply[T](x1: T, x2: T): List[T] = {
    new Cons(x1, new Cons(x2, new Nil()))
  }

  def apply[T](): List[T] = {
    new Nil()
  }

  List(1, 2)
  List()
}