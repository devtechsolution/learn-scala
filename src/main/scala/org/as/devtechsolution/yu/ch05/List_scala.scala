package org.as.devtechsolution.yu.ch05
/*
  @Similar to array with some difference
  @Arrays are mutable while List are Immutable(We can't change the elements of value once its assigned)
  @List represent Linked list where as Arrays are flat

* */
object List_scala extends App {

  val myList: List[Int] = List(1,2,5,8,9,6,4)
  val names:List[String]= List("Max","Tom", "Jhon")

  //myList(0)=5;//'List_scala.myList.type' does not take parameters
  /*
    @There are two fundamentals building blocks of a List
      1. Nil
      2. A cons( Changing of List is not possible, we just append the value)
   */
  //2. Using cons(::)
  println(0:: myList)// List(0, 1, 2, 5, 8, 9, 6, 4)
  println(myList) //List(1, 2, 5, 8, 9, 6, 4)
  println(names)
  //1. Using Nil
  println(Nil )// List()
  println(1 :: 5 :: 9:: Nil)// List(1, 5, 9)
  println(myList.head)// 1
  println(myList.tail)// List(2, 5, 8, 9, 6, 4)
  println(names.head)// Max
  println(names.tail)// List(Tom, Jhon)
  println(names.isEmpty)// false
  println(myList.reverse)// List(4, 6, 9, 8, 5, 2, 1)
  println(names.reverse)//List(Jhon, Tom, Max)

  print(List.fill(5)(2))//List(2, 2, 2, 2, 2)
  println(myList.max)// 9
  println(names.max)// Tom

  // Iterating over list myList
  myList.foreach(println)
  /*1
    2
    5
    8
    9
    6
    4
   */
  // Sum of all element of myList
  var sum : Int=0
  myList.foreach(sum+=_)
  println(sum)//35

  // Iterating over list names
  names.foreach(println)
  for(name<- names) println(name)
  /*  Max
      Tom
      Jhon
   */

  println(names(0))//Max



}
