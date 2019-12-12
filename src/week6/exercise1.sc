val numbers = Vector(1, 3, 4)
numbers :+ 3
1 +: numbers
print(numbers)

val numbersArray = Array(1, 3, 4)

val r: Range = 2 until (6)
val s: Range = 1 to 5

s exists (x => x > 3)

s forall (x => x > 3)

print(s zip r)

val str = "hello world"
str.flatMap(c => List(c + ","))

def isPrime(n: Int): Boolean = (2 until n) forall (d => n % d != 0)

isPrime(4)
isPrime(5)

val n = 7
val vOfV = (1 until n) flatMap (i => (1 until i) map (j => (i,j)))
vOfV.filter(pair => isPrime(pair._1 + pair._2))