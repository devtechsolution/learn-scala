package org.as.devtechsolution.yu.ch05
/*
  @ In Scala, Tuple is a class which contains different kinds of
    elements(Hetrogeneous data)
  @ In Scala, tuples are immutable i.e. we can't change the value of tuple once
    it's declared



*/
object Tuple_scala extends App {

  val mytuple= (1,2,"Hello", true)
  //val mytuple2= new Tuple(1,2,"Hello")
  val mytuple2= new Tuple3(1,2,"Hello")// Tuple3 means no of elements in tuple is 3 allowed upto 22
  val mytuple3= new Tuple2(1,"Hello")

  println(mytuple)//(1,2,"Hello", true)

  //Accessing tuples
  println(mytuple._1)
  println(mytuple._2)
  println(mytuple._3)
  println(mytuple._4)
  println(mytuple3._1)
  println(mytuple3._2)
  /*println(mytuple3._3);
    Error:(26, 20) value _3 is not a member of (Int, String)
    println(mytuple3._3);
   */

  mytuple.productIterator.foreach{
    i=> println(i )
  }
  // Creating tuple using arrow symbol
  /*
      @ Map contains key-value pair. And in this k-v pair one pair is tuple
        println(1->"Tom")// (1,Tom)
        This notation is only valid for 2 elements. If we give more then it will create tuple inside another tuple
        println(1->"Tom"-> true);// ((1,Tom),true)



   */
  println(1->"Tom")// (1,Tom)
  println(1->"Tom"-> true);
  // Tuple inside anoother tuple
  val mytuple4= new Tuple3(1,"Hello", (2,3))
  println(mytuple4._3)// (2,3)
  println(mytuple4._3._2);// 3



}
