package part2OOP

object oopQuestions extends App{



}

 class Writer( firstName: String, Surname: String, val year: Int) {

   def fullName: String = firstName + " " + Surname
}

class Novel(name: String,year: Int, val author: Writer) {

  def authorAge = year - author.year

  def isWrittenBy (author: Writer) = author == this.author
  def copy(newYear: Int): Novel = new Novel (name, newYear, author )

}



class Counter(val count: Int = 0) {
  def inc = {
    println("increment")
    new Counter(count + 1)
  } //immutability

  def dec = {
    println("decrement")
    new Counter(count - 1)
  }

  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n-1)
    new Counter(count + n)
  }

  def dec(n: Int): Counter =
    if (n <= 0) this
    else dec.dec(n-1)

  def print = println(count)
}


