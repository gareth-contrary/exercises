package classargs

import com.atomicscala.AtomicTest._

object SquareThem extends App {
  squareThem(2) is 4
  squareThem(2, 4) is 20
  squareThem(1, 2, 4) is 21
  
  def squareThem(intList : Int*) : Int = {
    var result : Int = 0
    for (num <- intList) 
      result += num * num
    return result
  }
}