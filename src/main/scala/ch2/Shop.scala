package ch2

import scala.collection.mutable.Buffer

trait Enumerable[A] {
  def foreach[B](fun: A => B): Unit

  final def map[B](f: A => B): List[B] = {
    var members = Buffer.empty[B]
    foreach {m =>
      members += f(m)
    }
    members.toList
  }

  final def filter(p: A => Boolean): List[A] = {
    val members = Buffer.empty[A]
    foreach{m =>
      if (p(m)) members += m
    }
    members.toList
  }

  final def toList: List[A] = {
    val members = Buffer.empty[A]
    foreach{m =>
      members += m
    }
    members.toList
  }
}

class Staff(val name: String, val age: Int)

class Shop(val name: String) extends AnyRef with Enumerable[Staff] {
  private[this] val staffs: List[Staff] = List(new Staff("太郎", 18), new Staff("花子", 20), new Staff("次郎", 25))

  override def foreach[B](f: Staff => B): Unit = staffs.foreach(f)
}

object Main extends App {
  val shop = new Shop("八百屋")
  val ans = shop.filter(_.age >= 20)
//  ans.foreach(println)
  ans.foreach(i => println(i.name, i.age))
}
