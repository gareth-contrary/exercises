package traitsandinheritance

import com.atomicscala.AtomicTest._

object TestLinkedList extends App {
  val list = Pair(1, Pair(2, Pair(3, Empty())))
  list.isInstanceOf[LinkedList[Int]] is true
}