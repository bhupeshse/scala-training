object exercise {
  def factorial(n: Int): Int = {

    def loop(acc: Int, n: Int): Int = {
      if (n == 0) acc
      else loop(acc * n, n)
    }

    loop(1, n)
  }

  factorial(10)
}