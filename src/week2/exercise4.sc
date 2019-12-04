object exercise4 {
  val tolerance = 0.0001

  def isCloseEnough(x: Double, y: Double) =
    math.abs((x - y) / x) / x < tolerance

  def fixedPoint(f: Double => Double)(firstClass: Double) = {
    def iterate(guess: Double): Double = {
      val next = f(guess)
      if (isCloseEnough(guess, next)) next
      else iterate(next)
    }

    iterate(firstClass)
  }

  def sqrt(x: Double) = {
    fixedPoint(averageDamp(y => x /y))(1)
  }

  def averageDamp(f: Double => Double)( x: Double):Double = (x + f(x))/2

  sqrt(4)
}