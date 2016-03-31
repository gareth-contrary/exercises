package traitsandinheritance

import com.atomicscala.AtomicTest._

case class GenericPair[A, B](val one: A, val two: B)

object GenericPair extends App {
  val pair = GenericPair[String, Int]("hi", 2)
  pair.one is "hi"
  pair.two is 2
}