package week4.exercise8

case class Sum(e1: Expr, e2: Expr) extends Expr {

   def leftOp = e1

   def rightOp = e2
}
