

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
    
    //Creating Classes q1
    val h = new Hippo()
    println(h)
    val l = new Lion()
    println(l)
    val t = new Tiger()
    println(t)
    val m = new Monkey()
    println(m)
    val g = new Giraffe()
    println(g)
    
    //Creating Classes q2
    val l2 = new Lion()
    println(l2)
    val g2 = new Giraffe()
    println(g2)
    val g3 = new Giraffe()
    println(g3)
    //different memory refs
    
    //Methods inside classes q1
    //val sailboat = new Sailboat
    //val r1 = sailboat.raise()
    //assert(r1 == "Sails raised", "Expected Sails raised, Got " + r1)
    //val r2 = sailboat.lower()
    //assert(r2 == "Sails lowered", "Expected Sails lowered, Got " + r2)
    val motorboat = new Motorboat
    val a1 = motorboat.on()
    assert(a1 == "Motor on", "Expected Motor on, Got " + a1)
    val a2 = motorboat.off()
    assert(a2 == "Motor off", "Expected Motor off, Got " + a2)
  }
  
  class Hippo{}
  class Lion{}
  class Tiger{}
  class Monkey{}
  class Giraffe{}
  
  class Sailboat{
    def lower() = {println("Sails lowered")}  
    def raise() = {println("Sails raised")}
  }
  
  class Motorboat{
    def on():String = {"Motor on"}  
    def off():String = {"Motor off"}
  }
}