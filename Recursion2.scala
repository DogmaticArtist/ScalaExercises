package lectures.part1basics

import scala.annotation.tailrec

object Recursion2 extends App{

  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of" + (n-1))
      val result = n * factorial(n-1)
      println("Computed factorial of " + n )

      result
    }

  val result = factorial(5000)
  println(result)





  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <=1 ) accumulator
      else factHelper(x-1, x* accumulator) //Tail recursion

    factHelper(n, 1)

  }


  def concatenateTailrec(aString: String, n: Int, accumulator: String): String =
    if (n <= 0) accumulator
    else concatenateTailrec(aString, (n-1), aString + accumulator)

  println(concatenateTailrec("hello", 3, ""))

}


