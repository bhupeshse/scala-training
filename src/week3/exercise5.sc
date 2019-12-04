
abstract class IntSet {
  def incl(x: Int): IntSet

  def contains(xP: Int): Boolean

  def union(other: IntSet): IntSet
}


object Emtpy extends IntSet {

  override def incl(x: Int): NonEmpty = new NonEmpty(x, Emtpy, Emtpy)

  override def contains(xP: Int): Boolean = false

  override def toString: String = "."

  override def union(other: IntSet) = other
}

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  override def incl(x: Int): NonEmpty =
    if (x < elem) new NonEmpty(elem, left incl x, right)
    else if (x > elem) new NonEmpty(elem, left, right incl x)
    else this

  override def contains(x: Int): Boolean =
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true

  override def toString: String = "{" + left + elem + right + "}"

  override def union(other: IntSet) = ((left union right) union (other)) incl elem
}




