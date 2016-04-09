package traitsandinheritance

/**
 * @author gmoore04
 */
trait Sum[A, B] {
  def value(): Any
}
case class Left[A, B](a: A) extends Sum[A, B] {
  def value(): A = a
}
case class Right[A, B](b: B) extends Sum[A, B] {
  def value(): B = b
}