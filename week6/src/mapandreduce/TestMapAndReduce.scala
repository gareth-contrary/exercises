package mapandreduce

import com.atomicscala.AtomicTest._

object TestMapAndReduce extends App {
  val v = Vector(1, 2, 3, 4)
  v.map(n => (n * 11) + 10) is Vector(21, 32, 43, 54)  
  
  var v2 = Vector[Int]()
  for (x <- v.reverse) {
    v2 = v2.+:((x * 11) +10)   
  }
  v2 is Vector(21, 32, 43, 54)
  
  var v3 = Vector[Int]()
  for (x <- v.reverse) {
    v3 = v3.+:(x + 1)
  }
  v3 is Vector(2, 3, 4, 5)
}