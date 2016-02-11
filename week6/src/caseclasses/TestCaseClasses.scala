package caseclasses

import com.atomicscala.AtomicTest._

object TestCaseClasses extends App {
  val p = Person("Jane", "Smile", "jane@smile.com")
  p.first is "Jane"
  p.last is "Smile"
  p.email is "jane@smile.com"
}