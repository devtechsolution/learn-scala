package org.as.devtechsolution.yu.ch03

object Higer_Order_Function extends App {
  /*
      @Higher order fuctions are those function which are able to take
      function as arguments and able to return function.
      @So Higher order fuctions are take function as arguments and return fuction

   */
  def math(x:Double, y:Double, f:(Double,Double)=>Double):Double=f(x,y);
  val addition= math(10,20,(x,y)=>x + y)
  val mul= math(10,20,(x,y)=>x * y)
  val min= math(10,20,(x,y)=>x min y)
  println(addition)//30.0
  println(mul)//200.0
  println(min)//10.0

  def math1(x:Double, y:Double,z:Int, f:(Double,Double)=>Double):Double=f(f(x,y),z);
  val addition1= math1(10,20,50,(x,y)=>x + y)
  val mul1= math1(10,20,50,(x,y)=>x * y)
  val min1= math1(10,20,50,(x,y)=>x min y)
  println(addition1)//30.0
  println(mul1)//200.0
  println(min1)//10.0
  //Useing wild-card
  val add= math1(20,10,50, _ + _)
  println(add) // 80.0

}
