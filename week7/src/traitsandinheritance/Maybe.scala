package traitsandinheritance

sealed trait Maybe[T]
case class Full[T](value: T) extends Maybe[T]
case class Empty2[T]() extends Maybe[T]

object divide {
  def apply[T <: AnyVal](x: Int, y: Int): Maybe[Int] = y match {
    case 0 => Empty2()
    case _ => Full(x / y)
  }
}