package part1

object Vectors {
  
  def main(args : Array[String]) {
  
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
  }
}