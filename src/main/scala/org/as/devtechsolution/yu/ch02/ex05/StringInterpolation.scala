package org.as.devtechsolution.yu.ch02.ex05

/*
  String Interpolation example
 */
object StringInterpolation {

  def main(args: Array[String]): Unit = {
    val name= "Aditya"
    val age = 28
    val favoriteDonut: String = "Glazed Donut"
    // Method 1: Using Concatenation
    println(name + " is " + age + " Years old" )// Aditya is 28 Years old

    // Method 2: Using String interpolation to print a variable

      /*
         1. We've prefixed the s at the beginning of our println statement.
         2. We also used the dollar sign $ to refer to our variable.
      */
    println(s"My favorite donut = $favoriteDonut")
    println(s"$name is $age Years old")

    // Method 3. Using String interpolation on object properties
      /*
          1.We've just introduced case class which is yet another feature of Scala!
           If you've never heard of case class before, don't worry, we will cover it later

          2.For now you can think of case class as a means for creating domain objects where
           the Scala compiler does the hardwork of adding your getters and setters!

          3. If you come from a Java background, think of a case class as an alternative
          to creating Plain Old Java Objects (POJO) but without having to write boilerplate
          code for getters and setters.
          4. If you've used .NET, it's similar to creating domain objects but without
          having to define boilerplate properties for getters and setters.
      */
    println("\nStep 3: Using String interpolation on object properties")
    case class Donut(name: String, tasteLevel: String)
    val favoriteDonut2: Donut = Donut("Glazed Donut", "Very Tasty")
    println(s"My favorite donut name = ${favoriteDonut2.name}, tasteLevel = ${favoriteDonut2.tasteLevel}")
    // My favorite donut name = Glazed Donut, tasteLevel = Very Tasty

    // Method 4. Using String interpolation to evaluate expressions
      /*
        We can use String interpolation with expressions by using the curly braces.
       */
    println("\nStep 4: Using String interpolation to evaluate expressions")
    val qtyDonutsToBuy: Int = 10
    println(s"Are we buying 10 donuts = ${qtyDonutsToBuy == 10}")// Are we buying 10 donuts = true

    // Method 4: Using String interpolation for formatting text i.e. f interpolation. This is type safe
    println("\nStep 4: Using String interpolation for formatting text")
    val donutName: String = "Vanilla Donut"
    val donutTasteLevel: String = "Tasty"
    println(f"$donutName%20s $donutTasteLevel")//
    /*
        Step 4: Using String interpolation for formatting text
              Vanilla Donut Tasty
        Note: The extra white spaces that were prepended to Vanilla Donut String.
     */
    println(f"$name%s is $age%d Years old")
    println(f"$name%s is $age%f Years old") //  Aditya is 28.000000 Years old
    //println(f"$name%s is $age%b Years old")
    /*
      Error:(63, 27) type mismatch;
      found   : Int
      required: Boolean
      println(f"$name%s is $age%b Years old")
    */

    // Using f interpolation to format numbers
    val donutPrice: Double = 2.50
    println(s"Donut price = $donutPrice")// Donut price = 2.5
    println(f"Formatted donut price = $donutPrice%.2f") // Formatted donut price = 2.50

    // Method 5: Using String interpolation with raw
    // The raw String interpolation will allow you to print any symbols within your String

    println("Hello \nworld")
    /*
        Hello
        world
    */
    println(raw"Hello \nwoorld")// Hello \nwoorld
  }

}
