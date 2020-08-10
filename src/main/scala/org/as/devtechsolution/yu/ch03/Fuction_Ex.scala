package org.as.devtechsolution.yu.ch03

object Fuction_Ex extends App {
  // Function definition
  /*
    def FunctionName(x:Int, y:String):Int={
      //fuction body
      //return (Optional in Scala. Last expression is the return value and type of fuction)
      // If we are certain the return type of fuction then declartion of return type is
          also optional like divide() function
    }
   */
  def add(x:Int, y:Int):Int={
   return  x+y
  }
  def subtract(x:Int, y:Int):Int={
    x-y
  }
  def multiply(x:Int, y:Int):Int= x*y
  def divide(x:Int, y:Int)=x/y

  println(add(45,15));
  println(subtract(45,15));
  println(multiply(45,15));
  println(divide(45,15));

  /*
    @ Calling methods from an Object for Instance Math add() function
    @ As Math is an object so we no need to create a new instance of this object.
    @ If it's a class then we have to instantiate it with new keyword
    @ If a function contain only one parameters then we can call that fuction like this.
      For Instance: square(x:Int)
      @ Calling : println(Math square 3)

   */
  object Math{
    def add(x:Int, y:Int):Int={
      return  x+y
    }
    def square(x:Int)= x*x
  }
  println(Math.add(10,20))
  println(Math square 3)
}
