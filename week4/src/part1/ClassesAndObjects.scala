

package part1

object ClassesAndObjects {
  
  def main(args : Array[String]) {
    
    //q1
    val range1 = 1 to 20
    println("Step value: " + range1.step)
    val range2 = 1 to 20 by 2
    println("Step value: " + range2.step)
    
    //q2
    var s1 = "Sally"
    var s2 = "Sally"
    if (s1.equals(s2)) {
      println("s1 and s2 are equal")
    } else {
      println("s1 and s2 are not equal")
    }
  }
  
  
}