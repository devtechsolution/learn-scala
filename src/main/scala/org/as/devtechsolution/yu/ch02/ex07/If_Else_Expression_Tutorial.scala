package org.as.devtechsolution.yu.ch02.ex07

object If_Else_Expression_Tutorial extends App {
  println("Step 1: Using if clause as a statement")
  val numberOfPeople = 20
  val donutsPerPerson = 2

  if(numberOfPeople > 10)
    println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPerson}")



  println(s"\nStep 2: Using if and else clause as a statement")
  val defaultDonutsToBuy = 8

  if(numberOfPeople > 10)
    println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPerson}")
  else
    println(s"Number of donuts to buy = $defaultDonutsToBuy")



  println("\nStep 3: Using if, else if, and else clause as a statement")
  if(numberOfPeople > 10) {
    println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPerson}")
  } else if (numberOfPeople == 0) {
    println("Number of people is zero.")
    println("No need to buy donuts.")
  } else {
    println(s"Number of donuts to buy = $defaultDonutsToBuy")
  }



  println("\nStep 4: Using if and else clause as expression")
  //What if you had to store the result of the if and else expressions above into a variable. With Scala, you can easily inline this as follows:
  val numberOfDonutsToBuy = if(numberOfPeople > 10) (numberOfPeople * donutsPerPerson) else defaultDonutsToBuy
  println(s"Number of donuts to buy = $numberOfDonutsToBuy")
  /*
    1. In another language such as Java or .NET, you would have used the Ternary Operator to achieve Step 4.
    2. Perhaps Scala's functional style is much easier to read and less error prone compared to the ternary operator.
   */

  val x=20
  val y=30
  var res=""
  println("\nStep 5: Using if and else clause as Statement")
  if(x<20 || y>30){
    res="x==20 && y==30"
  }else{
    res="x!=30"
  }
  println(res)
  println("\nStep 6: Using if and else clause as expression")
  println(if(x!=20) "x==20" else "x!=20")




}
