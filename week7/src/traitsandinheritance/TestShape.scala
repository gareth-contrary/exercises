package traitsandinheritance

import com.atomicscala.AtomicTest._

object TestShape extends App {
   Draw(Rectangle(3, 4, Red())) is "A red rectangle of width 4.0cm and height 3.0cm"
   Draw(Circle(3, Custom(250, 250, 0))) is "A dark circle of radius 3.0cm"
   Draw(Circle(3, Custom(0, 250, 155))) is "A light circle of radius 3.0cm"
   Draw(Square(3, Pink())) is "A pink square of width 3.0cm"
   Draw(Square(9.653, Yellow())) is "A yellow square of width 9.653cm"
}