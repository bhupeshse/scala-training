import week4.exercise7.{Expr, Number}

def eval(e: Expr): Int = {
  if (e.isNumber) e.numValue
  else if (e.isSum) eval(e.leftOp) + eval(e.rightOp)
  else throw new Error("unKnown expersion " + e)
}
eval(new Number(3))
