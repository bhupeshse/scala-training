package week4.exercise7

class Number(n: Int) extends Expr {
  override def isNumber = true

  override def isSum = false

  override def numValue = n

  override def leftOp = throw new Error("Not applicable")

  override def rightOp = throw new Error("Not applicable")
}
