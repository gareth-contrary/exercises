package namedanddefaultargs

case class Planet(name: String, moons: Int = 1, description: String) {
  def hasMoon(): Boolean = {
    if (moons > 0) {return true}
    else {return false}
  }
}