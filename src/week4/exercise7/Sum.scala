package week4.exercise7

class Sum(e1: Expr, e2: Expr) extends Expr {
  override def isNumber = false

  override def isSum = true

  override def numValue = throw new Error("Not applicable")

  override def leftOp = e1

  override def rightOp = e2
}
