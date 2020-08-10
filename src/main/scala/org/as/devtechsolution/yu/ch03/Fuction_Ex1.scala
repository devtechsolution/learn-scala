package org.as.devtechsolution.yu.ch03

object Fuction_Ex1 extends App {
  // Function definition with default value
  /*
    def FunctionName(x:Int=45, y:String="Ram"):Int={
      //fuction body
      //return (Optional in Scala. Last expression is the return value and type of fuction)
      // If we are certain the return type of fuction then declartion of return type is
          also optional like divide() function
      @ In Scala we can define fuction name as operator like +, **
    }
   */


  /*
    @ Calling methods from an Object for Instance Math add() function
    @ As Math is an object so we no need to create a new instance of this object.
    @ If it's a class then we have to instantiate it with new keyword
    @ If a function contain only one parameters then we can call that fuction like this.
      For Instance: square(x:Int)
      @ Calling : println(Math square 3)

   */
  object Math{
    def add(x:Int=45, y:Int=15):Int={
      return  x+y
    }
    def square(x:Int)= x*x

    def +(x:Int=45, y:Int=15):Int={
      return  x+y
    }
    def **(x:Int)= x*x
  }
  println(Math.add(10))// 25
  println(Math.add())//60
  println(Math square 3)//9
  println(Math.+())//60
  println(Math ** 3)//9
  // function definition which does not return
  /*
      @We use Unit as return type for void fuction
   */
  def print(x:Int,y:Int):Unit={
    println(x+y)
  }
  print(100,200);// 300
  // In scala +, * are fuction not operator
  val sum= 10 + 20
  val mul= 10 * 12
  /*
    @ In Scala fuction are treated as First class citizens
    @ i.e. we can assign a function to a variable and this we can do using anonimous function
    @ var add =(x:Int, y:Int) =>x+y;
   */

  var add =(x:Int, y:Int) =>x+y;
  println(add(10,20))






}
