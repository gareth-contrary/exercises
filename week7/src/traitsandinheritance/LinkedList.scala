package traitsandinheritance

sealed trait LinkedList[A] {
  def length(): Int
  def apply(n: Int): Option[A]
  def contains(a: A): Boolean
}
case class Pair[A](val head: A, val tail: LinkedList[A]) extends LinkedList[A] {
  def length(): Int = 1 + tail.length()
  
  def apply(n: Int): Option[A] = n match {
    case 1 => Some(head)
    case _ => tail.apply(n - 1)
  }
  
  def contains(a: A): Boolean = a match {
    case head => true
    case _ => tail.contains(a)
  }
}
case class Empty[A]() extends LinkedList[A] {
  def length(): Int = 0
  
  def apply(n: Int): Option[A] = None
  
  def contains(a: A): Boolean = false
}
