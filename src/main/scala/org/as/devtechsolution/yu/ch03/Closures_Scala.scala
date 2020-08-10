package org.as.devtechsolution.yu.ch03
/*
  @A closure is a function which uses one or more variables declared outside this function
  @It can be pure or impure function
 */
object Closures_Scala extends App {
  /* @Impure Closure: the variable value can change from insiede the closure or from
    outside it
    @The return value of closure will be vary
    @Var
  */
  var number =10
  val add=(x:Int)=>{
    number=x+number
    number
  }
  number =100;
  println(add(20))
  println(number)

  /* @Pure Closure: the variable value can't change from insiede the closure or from
    outside it
    @The return value of closure will be always same
    @Val
  */

  val number1=10;
  val mul=(x:Int)=> x*number1
  println(mul(20))




}
