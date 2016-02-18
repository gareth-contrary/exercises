package mapandreduce

import com.atomicscala.AtomicTest._

object Q1 extends App {
  
  //part a
  val v = Vector(1, 2, 3, 4)
  v.map(n => n + ((n+1) * 10)) is Vector(21, 32, 43, 54)
  
}