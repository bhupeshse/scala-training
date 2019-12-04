object session {


  def sqrt(x: Double) = {

    def abs(x: Double) = if (x < 0) -x else x

    def isGuessGoodEnough(guess: Double) =
      abs(guess * guess - x) / x < 0.01

    def improve(guess: Double) = {
      (guess + x / guess) / 2
    }

    def sqrtIter(guess: Double): Double =
      if (isGuessGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    sqrtIter(1.0)

  }

  sqrt(2)
  sqrt(4)
  sqrt(9)
}