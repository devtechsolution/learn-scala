package org.as.devtechsolution.yu.ch06.lazyinitialization
/*
  @Lazy initialization will be also achieved by named parameter
 */
class strict{
  val e= {
    println("strict");
    9
  }
}

class lazyEval{
  lazy val l= {
    println("lazy")
    9
  }
}
object Lazy_Demo extends App {
  val x= new strict
  val y= new lazyEval
  // Above line only initialize or call strict
  // to call lazy one we have to call it 1st time

  println(x.e)
  println(y.l)

  def method1(n: Int): Unit ={
    println("method 1")
    println(n)
  }
  def method2(n: => Int){
    println("method 2")
    println(n)
  }

  val add= (a: Int, b: Int)=> {
    println("Add")
    a+b
  }

  method1(add(5,6))
  /*
      Add
      method 1
      11
   */
  method2(add(5,6))

  /*
      method 2
      Add
      11
   */


}
