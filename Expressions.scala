package lectures.part1basics

object Expressions extends App{

  val x = 1 + 2; //EXPRESSION
  println(x);

  println( 2+ 3 * 4);

  println ( 1 == x);

  var aVariable = 2;
  aVariable += 3;


  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3
  println(aConditionValue)


  //do not write loops in scala, demonstartion purposes only

  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }



  val aWeirdValue = (aVariable = 3) //Unit === void
  println(aWeirdValue)

  //side effects: println() , whiles, reassigning

  // Code blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }





}
