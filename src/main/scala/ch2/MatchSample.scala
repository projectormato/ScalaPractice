package ch2

object MatchSample extends App {
  //基本的な例だけ。応用的なのは実践で学ぼう
  val i = 5
  val s = i match {
    case 0 => "A"
    case 1 => "B"
    case 2 => "C"
    case 3 => "D"
    case 4 => "E"
    case 5 => "F"
    case _ => "?"
  }
  println(s)
}