package org.as.devtechsolution.yu.ch03

/*
  @ Curring is the technique of transforming a fuction that takes multiple arguments
    into a function that take a single argument
 */
object Currying_Scala extends App {
  def add(x:Int,y:Int)= x+y
  //Method 1 :
  def add2 (x:Int)=(y:Int)=> x+y
  println(add2(10)(20))
  // with partial function
  val sum40= add2(40)
  println(sum40(50))

  //Method 2 :
  def add3 (x:Int)(y:Int)= x+y

  println(add3(100)(200))
  //val sum50= add3(50)
  /*
    Error:(21, 18) missing argument list for method add3 in object Currying_Scala
Unapplied methods are only converted to functions when a function type is expected.
You can make this conversion explicit by writing `add3 _` or `add3(_)(_)` instead of `add3`.
  val sum50= add3(50)
   */
  val sum50= add3(50)_
  println(sum50(400))//450







}
