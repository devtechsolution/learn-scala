### If Else Statement And Expression
*   In Scala, we can use the if and else clause as a statement to test for some condition or logical step
*   In addition, we can also use if and else clause as an expression where you get back the result of your condition or logical step.

```scala
package org.as.devtechsolution.yu.ch07;

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

```
### While loop  and do-while loop

#### while loop

*  From a pure functional perspective the use of loop such as the while loop is generally less favoured.
*  Instead, fold and recursive operations are preferred.
```scala
println("Step 1: How to use while loop in Scala")
var numberOfDonutsToBake = 10
while (numberOfDonutsToBake > 0) {
  println(s"Remaining donuts to be baked = $numberOfDonutsToBake")
  numberOfDonutsToBake -= 1
}
```
###### Output
```text
Remaining donuts to be baked = 10
Remaining donuts to be baked = 9
Remaining donuts to be baked = 8
Remaining donuts to be baked = 7
Remaining donuts to be baked = 6
Remaining donuts to be baked = 5
Remaining donuts to be baked = 4
Remaining donuts to be baked = 3
Remaining donuts to be baked = 2
Remaining donuts to be baked = 1
```
##### Note:
* The while loop will stop when the condition numberOfDonutsToBake > 0 becomes false.
* Yes - we've used a mutable variable! And we know that mutation is a bad thing in functional programming!
* Once again, there are better functional ways of achieving the same looping semantics using fold or recursive techniques.

#### do-while loop
* The difference between a while construct versus a do while is that any expressions within the do {} will be ran at least once regardless of the condition within the while() clause.

```scala
println("\nStep 2: How to use do while loop in Scala")
var numberOfDonutsBaked = 0
do {
  numberOfDonutsBaked += 1
  println(s"Number of donuts baked = $numberOfDonutsBaked")
} while (numberOfDonutsBaked < 5)
```
##### Output:
```text
Step 2: How to use do while loop in Scala
Number of donuts baked = 1
Number of donuts baked = 2
Number of donuts baked = 3
Number of donuts baked = 4
Number of donuts baked = 5
```
### for loop (For Comprehension)
* Basic Syntax of for-loop as statement is:
 ```text
for(var a<- Range){
  //statements
}
```
* Here arrow pointing to variable is called **Generator**
* **to** and **until** are methods which gives us **Range**
* Nested for-loop we will write like
```scala
  for(numberOfDonuts <- 1 to 5 ; x <- 1 to 3){
    println(s"Using to: Number of donuts to buy by  = $numberOfDonuts and $x")
  }
```
```scala
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

```
* Basic Syntax of for-loop as expression

```scala
val donutIngredients = List("flour", "sugar", "egg yolks", "syrup", "flavouring")
val sweeteningIngredients = for {
     ingredient <- donutIngredients
     if (ingredient == "sugar" || ingredient == "syrup")
} yield ingredient
```
**Output**
```text
Sweetening ingredients = List(sugar, syrup)
```
* Instead of using the (), we are using the {} in our for comprehension to make our expressions more explicit.
* To **return the result** of the for comprehension and store it in the sweeteningIngredients variable, we will make use of the **yield** keyword.

##### Using for comprehension to loop through 2-Dimensional array
* **Creation**
    *  We will use **Scala Array class** and call the **ofDim()** function, pass in the type of String in square brackets **[String]** and then specify our **2 by 2 array** in the function parameter.
* **Iteration of 2-D Array**
     * To iterate through your 2-Dimensional array, you can use the for comprehension and first declare an x variable to loop from 0 until 2, followed by a second iteration again from 0 until 2 which you will store in variable y.
     * After the closing } of our for loop, you can call println() to print each element of our 2-Dimensional array.

```scala
val twoDimensionalArray = Array.ofDim[String](2,2)
twoDimensionalArray(0)(0) = "flour"
twoDimensionalArray(0)(1) = "sugar"
twoDimensionalArray(1)(0) = "egg"
twoDimensionalArray(1)(1) = "syrup"
// Iteration of 2-D Array
for { x <- 0 until 2
       y <- 0 until 2
} println(s"Donut ingredient at index ${(x,y)} = ${twoDimensionalArray(x)(y)}")

```

### Pattern Matching
* We will see **functional feature** of Scala which is **pattern matching**
* **Pattern matching** may at first sight appear similar to switch statements. But, Scala's pattern matching is a lot more powerful!

##### 1. Pattern matching 101 - a very basic example
* Unlike in **Java** or in **.NET**, there are **no break** statements!
* If someone forgot to use the **break** clause, exception will be thrown. In **Java or .NET**, this would allow the logic to **fall-through** to the next case statement.
* Scala compiler is smart enough to prevent fall-through and hence there is no need to use a break clause with pattern matching.
```scala
println("Step 1: Pattern matching 101 - a very basic example")
val donutType = "Glazed Donut"
donutType match {
  case "Glazed Donut" => println("Very tasty")
  case "Plain Donut" => println("Tasty")
}
```
**Output**
```text
Step 1: Pattern matching 101 - a very basic example
Very tasty
```

##### 2. Pattern matching and return the result
* Like  **If And Else Expression** and **For Comprehension**, Scala's **pattern matching** can **return** the result back to the caller.
* We did not have to use the **return** keyword as you would in say **Java or .NET**.
* Instead, the **last expression** will be the one **returned** back to the caller.
```scala
println("\nStep 2: Pattern matching and return the result")
val tasteLevel = donutType match {
  case "Glazed Donut" => "Very tasty"
  case "Plain Donut" => "Tasty"
}
println(s"Taste level of $donutType = $tasteLevel")
```
**Output**
```text
Step 2: Pattern matching and return the result
Taste level of Glazed Donut = Very tasty
```
##### 3. Pattern matching using the wildcard operator
* There is no need to use any **break** clauses as there is no **fall-through** when using **pattern matching**.
* But, what if you needed to provide a **default case**?
* We use **wildcard operator (_)**
```scala
val donutType = "Glazed Donut"
println("\nStep 3: Pattern matching using the wildcard operator")
val tasteLevel2 = donutType match {
  case "Glazed Donut" => "Very tasty"
  case "Plain Donut" => "Tasty"
  case _ => "Tasty"
}
println(s"Taste level of $donutType = $tasteLevel2")
```
**Output**
```text
Step 3: Pattern matching using the wildcard operator
Taste level of Glazed Donut = Very tasty
```
##### 4. Pattern matching with two or more items on the same condition
* This behavior seems similar to an OR expression and you can use the **pipe |**
```scala
val donutType = "Glazed Donut"
println("\nStep 4: Pattern matching with two or more items on the same condition")
val tasteLevel3 = donutType match {
  case "Glazed Donut" | "Strawberry Donut" => "Very tasty"
  case "Plain Donut" => "Tasty"
  case _ => "Tasty"
}
println(s"Taste level of $donutType = $tasteLevel3")
```
**Output**
```text
Step 4: Pattern matching with two or more items on the same condition
Taste level of Glazed Donut = Very tasty
```
##### 5. Pattern matching and using if expressions in the case clause
* We can simulate an **OR** clause by adding **If Expression** in the case statements.
```scala
val donutType = "Glazed Donut"
println("\nStep 5; Pattern matching and using if expressions in the case clause")
val tasteLevel4 = donutType match {
  case donut if (donut.contains("Glazed") || donut.contains("Strawberry")) => "Very tasty"
  case "Plain Donut"  => "Tasty"
  case _  => "Tasty"
}
println(s"Taste level of $donutType = $tasteLevel4")
```
**Output**
```text
Step 5; Pattern matching and using if expressions in the case clause
Taste level of Glazed Donut = Very tasty
```
##### 6. Pattern matching by types
* What if we would like to **pattern match** on the **type** of the variable?
* Let's declare a variable explicitly to be of type **Any** to hold the price of one donut.
* The **Scala** compiler would **infer** that priceOfDonut to be of type Double.
```scala
println("\nStep 6: Pattern matching by types")
val priceOfDonut: Any = 2.50
val priceType = priceOfDonut match {
  case price: Int => "Int"
  case price: Double => "Double"
  case price: Float => "Float"
  case price: String => "String"
  case price: Boolean => "Boolean"
  case price: Char => "Char"
  case price: Long => "Long"
}
println(s"Donut price type = $priceType")
```
**Output**
```text
Step 6: Pattern matching by types
Donut price type = Double
```
* We can think of the **Any** type similar to the **Object class**.
* In other words, **Any** is at the **root of Scala's type hierarchy**.

# Chapter 3 Thinking in terms of functions

### Function
* Scala is both an Object Oriented and Functional programming language

#### Learn How To Create And Use Functions
```text

```
##### 1. How to define and use a function which has no parameters and has a return type
* To define a function in Scala:
    * We need to use the keyword def.
    * Then add the name of your function followed by an empty pair of parenthesis (). 
    * To specify the return type you need to use the colon : followed by the return type.
    * Finally, you will use the = followed by {} to enclose the body of your function.
    * We did not use any return keyword as you would in say **Java or .NET**. The last line within the body of the function is the one that will be returned back to the caller.

```scala
println("Step 1: How to define and use a function which has no parameters and has a return type")
def favoriteDonut(): String = {
  "Glazed Donut"
}

val myFavoriteDonut = favoriteDonut()
println(s"My favorite donut is $myFavoriteDonut")
```
**Output**
```text
Step 1: How to define and use a function which has a return type
My favorite donut is Glazed Donut
```
##### 2. How to define and use a function with no parenthesis
*  We should define your functions without parenthesis if you are defining a function that does not have any side effects.
*  We also did not provide a return type of String to the leastFavoriteDonut function to leverage what we've learned from the tutorial on Scala Type Inference.

```scala
println("\nStep 2: How to define and use a function with no parenthesis")
def leastFavoriteDonut = "Plain Donut"
println(s"My least favorite donut is $leastFavoriteDonut")
```
**Output**
```text
Step 2: How to define and use a function with no parenthesis
My least favorite donut is Plain Donut
```
##### 3. How to define and use a function with no return type
* If you have used other mainstream languages such as Java or .NET, Unit is similar to using the void keyword in a method.
```scala
println("\nStep 3: How to define and use a function with no return type")
def printDonutSalesReport(): Unit = {
  // lookup sales data in database and create some report
  println("Printing donut sales report... done!")
}
printDonutSalesReport()
```
**Output**
```text
Step 3: How to define and use a function with no return type
Printing donut sales report... done!
```


