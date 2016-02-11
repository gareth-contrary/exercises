package namedanddefaultargs

import com.atomicscala.AtomicTest._

object TestNamedAndDefaultArgs extends App {
  
  val t = new SimpleTime(hours=5, minutes=30)
  t.hours is 5
  t.minutes is 30
