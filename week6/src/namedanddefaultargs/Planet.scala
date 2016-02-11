package namedanddefaultargs

case class Planet(moons: Int = 1, name: String, description: String) {
  def hasMoon(): Boolean = {
    if (moons > 0) {return true}
    else {return false}
  }
}