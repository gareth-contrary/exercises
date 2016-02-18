package mapandreduce

import com.atomicscala.AtomicTest._

object Q1 extends App {
  
  //part a
  val v = Vector(1, 2, 3, 4)
  v.map(n => n + ((n+1) * 10)) is Vector(21, 32, 43, 54)
  
  
  //part b
  val v2 = Vector(1, 2, 3, 4)
  v2.foreach(n => n + ((n+1) * 10)) is Vector(21, 32, 43, 54)  
  //foreach will return a function
  
  //part c 
  val v3 = Vector(1, 2, 3, 4)
  def f(v: Vector[Int]): Vector[Int] =  {
    var result = Vector[Int]()
    for (x <- v.reverse) {
      result = result.+:(x + (x+1) * 10)
    }
    result
  }
  
  f(v3) is Vector(21, 32, 43, 54)  
  
}