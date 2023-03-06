package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())



def aRepeatedFunction(aString: String, n: Int): String = {

  if (n==1) aString
  else aString + aRepeatedFunction(aString, n-1)
}

println(aRepeatedFunction("Shahwar", 6))

def aFunctionWithSideEffects(aString: String): Unit = println(aString)

println(aFunctionWithSideEffects("jOHn"))





def nameAgeFunction (name: String, age: Int): String = {

  "Hi, my name is " + name + " and i'm " + age + " years old"
}

println(nameAgeFunction("Jamal", 15))





//Factorial Function

def factorialFunction(n: Int): Int = {

  if (n==1) return 1
  else n * factorialFunction(n-1)
}

println(factorialFunction(5))




def fibonacciFunction(n: Int): Int = {

  if (n==1 || n ==2) return 1
  else fibonacciFunction(n-1) + fibonacciFunction(n-2)
}

println(fibonacciFunction(9))


def isPrime(n: Int): Boolean = {
  def isPrimeUntil(t: Int): Boolean =
    if (t <= 1) true
    else n % t != 0 && isPrimeUntil(t - 1)

  isPrimeUntil(n/2)
}

  println(isPrime(17))
  println(isPrime(2003))




}










































