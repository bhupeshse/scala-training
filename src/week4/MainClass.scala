package week4

class MainClass {
  def singleton[T](elem: T) = new Cons[T](elem, new Nil[T])

  singleton[Int](1)

}
