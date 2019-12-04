package week3

abstract class IntSet {
  def incl(x: Int): IntSet

  def contains(xP: Int): Boolean

  def union(other: IntSet): IntSet
}
