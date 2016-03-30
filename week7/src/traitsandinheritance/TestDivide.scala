package traitsandinheritance

import com.atomicscala.AtomicTest._

object TestDivide extends App {
  Divide(1, 2) is Finite(0)
  Divide(1, 0) is Infinite()
}