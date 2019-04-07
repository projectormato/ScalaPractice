package ch3

object Fold extends App {
  //コレクションを畳み込む系の関数
  val sum = Seq(1, 2, 3).foldLeft(0)(_ + _)
  println(sum)

  val sum2 = Seq(1, 2, 3).reduceLeft(_ * _)
  println(sum2)

}