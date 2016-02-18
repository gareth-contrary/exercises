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
  def f(v: Vector[Int]): Vector[Int] =  {
    var result = Vector[Int]()
    for (x <- v.reverse) {
      result = result.+:(x + (x+1) * 10)
    }
    result
  }
  
  f(v) is Vector(21, 32, 43, 54)  
  
  
  // Q3 
  val v4 = Vector(1, 10, 100, 1000)
  def reducer(v: Vector[Int]): Int = {  
    var result = 0
    for(x <- v.reverse) {
      result += x
    }
    result
  }
  reducer(v4) is 1111
    
  
  
  
}