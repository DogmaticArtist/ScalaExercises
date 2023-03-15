package part2OOP

object inheritanceAndTraits extends App {

  sealed class Animal {
     def eat = println("nomnom")
    val creatureType = "wild"
  }

  class Cat extends Animal {

    def crunch = {
      eat
      println("crunch crunch")
    }
  }

  val cat = new Cat
  cat.crunch


  //constructors

  class Person(name: String, age: Int) {
    def this(name: String) =  this(name, 0)
  }
  class Adult(name: String, age: Int, idCard:String) extends Person(name)

  // overriding
  class Dog(override val creatureType: String) extends Animal {
    //override val creatureType = "domestic"
    override def eat = {
      super.eat
      println("crunch aaaaaah")
    }
  }

  val dog = new Dog("k9")
  dog.eat
  println(dog.creatureType)


  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat


  //super





}
