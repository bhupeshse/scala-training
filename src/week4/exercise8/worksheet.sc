import week4.exercise8.{Expr, Number, Sum}

def eval(e: Expr): Int = e match {
  case Number(n) => n
  case Sum(e1, e2) => eval(e1) + eval(e2)
}

eval(new Sum(new Number(3), new Number(5)))