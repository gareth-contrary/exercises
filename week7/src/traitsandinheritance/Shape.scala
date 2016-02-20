package traitsandinheritance

sealed trait Shape {
  def sides(): Int 
  def perimeter(): Double 
  def area(): Double
  val colour: Colour
}

trait Rectangular

sealed trait Colour {
	val red: Int
  val green: Int
  val blue: Int
  
  def shade(): String = {
	  if ((red + green) >= (green + blue)) "dark"
	  else "light"
	}
}

case class Red(override val red: Int = 255, override val green: Int = 0,
  override val blue: Int = 0) extends Colour

case class Pink(override val red: Int = 255,
  override val green: Int = 192,
  override val blue: Int = 203) extends Colour

case class Yellow(override val red: Int = 255,
  override val green: Int = 255,
  override val blue: Int = 0) extends Colour

case class Custom(override val red: Int, override val green: Int, override val blue: Int) extends Colour

case object Draw {  
  def apply(shape: Shape): String = shape match {
    case shape: Circle => "A " + colour(shape.colour) + " circle of radius " + shape.radius + "cm"
    case shape: Rectangle => "A " + colour(shape.colour) + " rectangle of width " + shape.width + "cm and height " + shape.height + "cm"
    case shape: Square => "A " + colour(shape.colour) + " square of width " + shape.width + "cm"
  }
  
  def colour(colour: Colour): String = colour match {
    case colour: Red => "red"
    case colour: Pink => "pink"
    case colour: Yellow => "yellow"
    case colour: Custom => colour.shade()
  }
}

case class Circle(val radius: Double, val colour: Colour) extends Shape {
  def sides(): Int = 1
  def perimeter(): Double = math.Pi * (radius * 2) 
  def area(): Double = math.Pi * (radius * radius)
}

case class Rectangle(val height: Double, val width: Double, val colour: Colour) extends Shape with Rectangular { 
  def sides(): Int = 4
  def perimeter(): Double = (width * 2) + (height * 2)
  def area(): Double = width * height
}

case class Square(val width: Double, val colour: Colour) extends Shape with Rectangular {
  def sides(): Int = 4
  def perimeter(): Double = width * 4
  def area(): Double = width * width
}