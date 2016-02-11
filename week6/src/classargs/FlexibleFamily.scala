package classargs

class FlexibleFamily(mother : String, father : String, children : String*) {
  
  def familySize() : Int = children.size + 2
  
}