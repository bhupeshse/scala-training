object execise2 {


  def sum(f: Int => Int, a: Int, b: Int): Int = {
    def loop(a:Int, result: Int): Int = {
      if (a > b) result
      else loop(a+1, result + f(a))
    }
    loop(a, 0)
  }

  sum(x => x * x, 1, 4)
}