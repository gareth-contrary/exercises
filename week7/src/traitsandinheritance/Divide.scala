package traitsandinheritance

sealed trait DivisionResult
case class Finite(result: Int) extends DivisionResult
case class Infinite() extends DivisionResult

object Divide {
  def apply(x: Int, y: Int): DivisionResult = y match {
    case 0 => Infinite()
    case _ => Finite(x / y)
  }
}