package week4

//peano numbers

abstract class Nat {
  def isZero: Boolean

  def predecessor: Nat

  def successor: Nat

  def +(that: Nat): Nat

  def -(that: Nat): Nat
}

object Zero extends Nat {
  override def isZero = true

  override def predecessor = throw new Error("Predecessor does not exist for zero")

  override def successor = new Succ(this)

  override def +(that: Nat) = that

  override def -(that: Nat) = if (that.isZero) this else throw new Error("Negative number")
}

class Succ(n: Nat) extends Nat {
  override def isZero = false

  override def predecessor = n

  override def successor = new Succ(n)

  override def +(that: Nat) = new Succ(n + that)

  override def -(that: Nat) = if (that.isZero) this else (n - that.predecessor)
}