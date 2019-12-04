class Rational(x: Int, y: Int) {
  require(y != 0, "Denominator must be non zero")

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  private val g = gcd(x, y)

  val numer: Int = x / g

  val denom: Int = y / g

  def this(x:Int) = this(x, 1)

  def less(that: Rational) = this.numer * that.denom < this.denom * that.numer

  def max(that: Rational) = if (this.less(that)) that else this

  def addRational(rational: Rational): Rational = {
    new Rational(rational.numer * denom + numer * rational.denom, denom * rational.denom)
  }

  def neg(): Rational = {
    new Rational(-1 * numer, denom)
  }

  def sub(rational: Rational) = addRational(rational.neg())

  override def toString(): String = {
    numer + "/" + denom
  }

}

val rational1 = new Rational(2, 3)
val rational2 = new Rational(1, 2)
val rational3 = new Rational(4, 5)

rational1.sub(rational2).sub(rational3).toString()

val rational4 = new Rational(4)