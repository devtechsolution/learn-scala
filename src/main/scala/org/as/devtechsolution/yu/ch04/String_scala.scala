package org.as.devtechsolution.yu.ch04
/*
  @String in scala is same as in Java. Its value type is java.lang.String
  @Scala makes use of Java String without creating String class in Scala
  @Similar to Java String class is immutable(i.e. can't be modified) in Scala

*/
object String_scala extends App {
  val num1=75
  val num2= 100.25
  val str1: String ="Hello Wolrd"
  val str2: String = " Max"
  // Length of String
  str1.length()
  println(str1.length)//11
  // Concatenation of String
  println(str1.concat(str2)) //Hello World Max
  println(str1+ str2) //Hello World Max

  // Format the String
  val result= printf("%d -- %f -- %s",num1, num2, str1)
  println(result)// 75 -- 100.250000 -- Hello Wolrd()
  printf("%d -- %f -- %s",num1, num2, str1)//75 -- 100.250000 -- Hello Wolrd
  println("%d -- %f -- %s".format(num1,num2,str1))// 75 -- 100.250000 -- Hello Wolrd









}
