object polynomials {

  class Poly(val term0: Map[Int, Double]) {
    def this(bindings:(Int,Double)*) = this(bindings.toMap)
    val terms  = term0 withDefaultValue(0.0)
    def +(other: Poly) = new Poly(terms ++ (other.terms map adjust))

    def adjust(term: (Int, Double)): (Int, Double) = {
      val (exp, coeff) = term
      exp -> (coeff + terms(exp))
    }

    override def toString: String =
      (for {(exp, coeff) <- terms.toList.sorted.reverse} yield coeff + "x^" + exp) mkString " + "

  }

  val p1 = new Poly(1 -> 2.0, 3 -> 4.0, 5 -> 6.2)
  val p2 = new Poly(Map(0 -> 3.0, 3 -> 7.0))
  p1 + p2 toString
}