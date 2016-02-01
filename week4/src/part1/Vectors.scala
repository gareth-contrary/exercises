package part1

object Vectors {
  
  def main(args : Array[String]) {
    
    //q3
    val species =  Vector("sapiens", "neanderthalis", "floresiensis", "habilis", "erectus")    
    var str : String = " belongs to the genus Homo."    
    for(word <- species) 
      println(word)      
    import com.atomicscala.AtomicTest._
    val vec = Vector("The", "dog", "visited", "the", "fire", "station")
    var sentence : String = ""
    for(word <- vec)
      sentence = sentence + word + " "
    sentence.toString() is "The dog visited the fire station "
    
    //q4
    val intVec = Vector(99, 785244, 4523577,  -452366,  4, 55)
    val doubVec = Vector(12.2, 4.56, 8.56, 9.63, -1.34)
    intVec.sum is 4856613
    doubVec.sum is 33.61
    intVec.max is 4523577
    doubVec.max is 12.2
    intVec.min is -452366
    doubVec.min is -1.34
    
    //q5
    val myVector1 = Vector(1, 2, 3, 4, 5, 6)
    val myVector2 = Vector(1, 2, 3, 4, 5, 6)
    myVector1 is myVector2
  }
}