package namedanddefaultargs

case class Item(name: String, price: Double) {
  
    def cost(grocery: Boolean = false, medication: Boolean = false, taxRate: Double = 0.10): Double = {
      var result: Double = price
      if (grocery == true || medication || true) {
        result += price * taxRate
      } 
      return result
    }
}