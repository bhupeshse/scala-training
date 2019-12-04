import week3.{Empty, NonEmpty}
import week4.exercise5.{List, Nil}

object worksheet {
  val x: List[String] = Nil

  def f(xs: List[NonEmpty], x: Empty) = xs prepend x
}