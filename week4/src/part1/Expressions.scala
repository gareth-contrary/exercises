package part1

/**
 * @author gmoore04
 */
object Expressions {
 
  def main(args : Array[String]) {
   
  def isSunny(weather : String, temperature : Int) : Boolean = {
    if (weather.equals("sunny") && (temperature > 80)) { true }
    else { false }
  }

  def isSunnyOrCloudy(weather : String, temperature : Int) : Boolean = {
    if ((temperature > 80) && (weather.equals("sunny") || weather.equals("partly cloudy"))) { true } 
    else { false }
  }
 
  def isSunnyCloudy80Or20(weather : String, temperature : Int) : Boolean = {
    if ((temperature > 80 || temperature < 20) && (weather.equals("sunny") || weather.equals("partly cloudy"))) { true } 
    else { false }
  }
   println(isSunnyCloudy80Or20("sunny", 15))
  }
}