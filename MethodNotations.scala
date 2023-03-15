package part2OOP

object MethodNotations extends App{

  class Person(val name: String, favoriteMovie: String) {
    def likes(movie: String): Bolean = movie == favoriteMovie

  }


  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // equivalent to the above



}
