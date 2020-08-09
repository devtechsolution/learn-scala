package org.as.devtechsolution.yu.ch02.ex09

object ForLoop_Tutorial extends App {
  println("Step 1: A simple for loop from 1 to 5 inclusive")
  for(numberOfDonuts <- 1 to 5){
    println(s"Using to: Number of donuts to buy = $numberOfDonuts")
  }

  for(numberOfDonuts <- 1.to(5)){
    println(s"Using Method to: Number of donuts to buy = $numberOfDonuts")
  }



  println("\nStep 2: A simple for loop from 1 to 5, where 5 is NOT inclusive")
  for(numberOfDonuts <- 1 until 5){
    println(s"Using until: Number of donuts to buy = $numberOfDonuts")
  }

  for(numberOfDonuts <- 1.until(5)){
    println(s"Using method Until: Number of donuts to buy by  = $numberOfDonuts")
  }
  /*
      to and until are methods which gives us Range
   */

  // Nested Loop:
  for(numberOfDonuts <- 1 to 5 ; x <- 1 to 3){
    println(s"Using to: Number of donuts to buy by  = $numberOfDonuts and $x")
  }





  val donutIngredients = List("flour", "sugar", "egg yolks", "syrup", "flavouring")
  println("\nStep 3: Iterating List using  for loop")
  for(ingredient <- donutIngredients){
    println(s"Iterating donutIngredients List = $ingredient")
  }
  println("\nStep 3.1: Filter values using if conditions in for loop")
  for(ingredient <- donutIngredients if ingredient == "sugar"){
    println(s"Found sweetening ingredient = $ingredient")
  }



  println("\nStep 4: Filter values using if conditions in for loop and return the result back using the yield keyword")
  val sweeteningIngredients = for {
    ingredient <- donutIngredients
    if (ingredient == "sugar" || ingredient == "syrup")
  } yield ingredient
  println(s"Sweetening ingredients = $sweeteningIngredients")



  println("\nStep 5: Using for comprehension to loop through 2-Dimensional array")
  val twoDimensionalArray = Array.ofDim[String](2,2)
  twoDimensionalArray(0)(0) = "flour"
  twoDimensionalArray(0)(1) = "sugar"
  twoDimensionalArray(1)(0) = "egg"
  twoDimensionalArray(1)(1) = "syrup"

  for { x <- 0 until 2
        y <- 0 until 2
        } println(s"Donut ingredient at index ${(x,y)} = ${twoDimensionalArray(x)(y)}")



}
