package tea

case class Tea(name: String = "Earl Grey", milk: Boolean = false, sugar: Boolean = false, decaf: Boolean = false) {
  
  def describe(): String = {
    var result: String = name
    if (decaf) {result += " decaf"}
    if (milk) {result += " + milk"}
    if (sugar) {result += " + sugar"}
    return result
  }
  
  def calories(): Int = {
    var result = 0
    if (milk) {result += 100}
    if (sugar) {result += 16}
    return result
  }
}