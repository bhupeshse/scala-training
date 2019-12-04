class Rational(x: Int, y: Int) {
  def numer: Int = x

  def denom: Int = y

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

def addRational(rational1: Rational, rational2: Rational): Rational = {
  new Rational(rational1.numer * rational2.denom + rational2.numer * rational1.denom, rational1.denom * rational2.denom)
}

def makeString(rational: Rational) = {
  rational.numer + "/" + rational.denom
}

val rational1 = new Rational(2, 3)
val rational2 = new Rational(1, 2)
val rational3 = new Rational(4, 5)

rational1.sub(rational2).sub(rational3)


makeString(addRational(rational1, rational2))

