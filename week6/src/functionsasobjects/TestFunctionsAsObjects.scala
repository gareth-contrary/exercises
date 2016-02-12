package functionsasobjects

import com.atomicscala.AtomicTest._

object TestFunctionsAsObjects extends App {
  
  def str = "1,2,3,4,"
  
  val dogYears = (x: Int) => x * 7
  
  str is "1,2,3,4,"
  dogYears(10) is 70
  var s = ""
  val v = Vector(1, 5, 7, 8)
  v.foreach(x => s += dogYears(x) + " ")
  s is "7 35 49 56 "
}