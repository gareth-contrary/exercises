package traitsandinheritance

sealed trait Publication 
class Book(author: String) extends Publication
case class Periodical(editor: String) extends Publication
case class Issue(p: Periodical, volume: Int, issue: Int, m: Seq[Manuscript])
case class Manuscript(author: String, length: Int) extends Book(author)