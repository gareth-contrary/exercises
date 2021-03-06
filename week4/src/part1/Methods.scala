package part1

object Methods {
  def main(args : Array[String]) {
    
    //tests q1
    val a = getSquare(3)
    assert(a == 9)
    val b = getSquare(6)
    assert(b == 36)
    val c = getSquare(5)
    assert(c == 25)
    
    //tests q2
    val t1 = isArg1GreaterThanArg2(4.1, 4.2)
    assert(t1 == false)
    val t2 = isArg1GreaterThanArg2(2.1, 1.2)
    assert(t2 == true)
    
    //tests q3
    val m1 = manyTimesString("abc", 3)
    assert("abcabcabc" == m1, "m1")
    val m2 = manyTimesString("123", 2)
    assert("123123" == m2, "m2")
    
  } // end of main
  
  def getSquare(num : Int):Int = {
    println(num * num)
    num * num
    }
  
  def isArg1GreaterThanArg2(arg1 : Double, arg2 : Double):Boolean = {
    if (arg1 > arg2) {
      println(true)
      true
    } else {
      println(false)
      false
    }
  }

  def manyTimesString(string : String, times : Int):String = {
    println(string * times)
    string * times
  }
  
} //end of Methods