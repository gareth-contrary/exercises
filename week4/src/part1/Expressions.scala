package part1

/**
 * @author gmoore04
 */
object Expressions {
 
  def main(args : Array[String]) {
   
  def q1(weather : String, temperature : Int) : Boolean = {
    if (weather.equals("sunny") && (temperature > 80)) { true }
    else { false }
  }

  def q2(weather : String, temperature : Int) : Boolean = {
    if ((temperature > 80) && (weather.equals("sunny") || weather.equals("partly cloudy"))) { true } 
    else { false }
  }
 
  def q3(weather : String, temperature : Int) : Boolean = {
    if ((temperature > 80 || temperature < 20) && (weather.equals("sunny") || weather.equals("partly cloudy"))) { true } 
    else { false }
  }

  def q4(fahrenheit : Double) : Double = {(fahrenheit - 32) / (5/9) }
  
  def q5(celsius : Double) : Double = {(celsius * (9/5)) + 32}
  
  
  // simple tests
  //should pass
  println(q1("sunny", 85))
  println(q2("sunny", 85))
  println(q2("partly cloudy", 85))
  println(q3("partly cloudy", 85))
  println(q3("sunny", 89))
  println(q3("sunny", 19))
  println(q3("partly cloudy", 0))
  
  if (q5(q4(100)) == 100) { println("true")}
      
  //should fail
  println(q1("partly cloudy", 85))
  println(q1("sunny", 80))
  println(q1("sunny", 25))
  println(q2("partly cloudy", 80))
  println(q2("sunny", 25))
  println(q3("sunny", 40))
  println(q3("partly cloudy", 45))
  
  } // end of main
} // end of expressions