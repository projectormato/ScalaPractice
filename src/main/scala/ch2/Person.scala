package ch2

trait Namable {
  val name: String
  def display(): Unit = println(name)
}

class Employee(val name: String) extends AnyRef with Namable

object Person extends App {
  val taro = new Employee("太郎")
  val hanako = new Employee("花子")
  taro.display()
  hanako.display()
}
