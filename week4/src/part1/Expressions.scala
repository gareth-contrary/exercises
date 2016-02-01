package part1

/**
 * @author gmoore04
 */
object Expressions {
 
  def main(args : Array[String]) {
   
  def isSunny(weather : String, temperature : Int) : Boolean = {
    if (weather.equals("sunny") && (temperature >= 80)) {
      true
    } else {
      false
    }
  }

  def isSunnyOrCloudy(weather : String, temperature : Int) : Boolean = {
    if (weather.equals("sunny") || weather.equals("partly cloudy") && (temperature >= 80) {
      true
    } else {
      false
    }
  }
 
   println(isSunnyOrCloudy("sunny", 83))
  }
}