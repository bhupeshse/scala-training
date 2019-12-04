package week3

class Empty extends IntSet {

  override def incl(x: Int): NonEmpty = new NonEmpty(x, new Empty, new Empty)

  override def contains(xP: Int): Boolean = false

  override def toString: String = "."

  override def union(other: IntSet) = other
}
