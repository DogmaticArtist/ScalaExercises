package part2OOP

object OOBasics extends App {

  val person = new Person ("Abdul", 34)
  println(person.age)
  println(person.name)
  println(person.x)
  person.greet("Daniel")
  person.greet()

  val author = new Writer("Chales", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(author))


  val counter = new Counter
  counter.inc.print
  counter.inc.inc.inc.print
  counter.inc(12).print
}

//constructor
class Person (val name: String, val age: Int)  {
  //body
  val x = 2
  println(1 + 5)

  // method
  def greet(name: String): Unit = println(s"~${this.name} says: Hi, $name")

  //Overloading
  def greet(): Unit = println(s"Hi, I am $name")

  // multiple constructors
  def this (name: String) = this(name,0)
  def this() = this("John Doe")



}
// class parameters are NOT FIELDS, unless adding val before