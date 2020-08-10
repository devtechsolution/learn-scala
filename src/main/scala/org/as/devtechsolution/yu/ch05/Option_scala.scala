package org.as.devtechsolution.yu.ch05
/*
  @Option is a container which will give us two value:-
      1. Instance of Some
      2. Instance of None
*/
object Option_scala  extends App {

  val lst= List(1,2,3)
  val map = Map(1->"Tom", 2-> "Max", 3-> "Jhon")

  println(lst.find(_>6))//None
  //println(lst.find(_>6).get)// Exception in thread "main" java.util.NoSuchElementException: None.get
  println(lst.find(_>6).getOrElse(0))//0
  println(lst.find(_>2))// Some(3)
  println(lst.find(_>2).get)// 3

  println(map.get(1))// Some(Tom)
  println(map.get(1).get)// Tom
  println(map.get(5))// None
  //println(map.get(5).get)//Exception in thread "main" java.util.NoSuchElementException: None.get
  println(map.get(5).getOrElse("No Name found"))//No Name found

  // Define an Option with None
  val opt: Option[Int] = None
  println(opt.isEmpty)// true
  println(opt.getOrElse("Empty"))
  // Define an Option with Some with value
  //val opt2: Option[Int]= Some("Hello")
  val opt2: Option[Int]= Some(5)
  println(opt2.isEmpty)// flase
  println(opt2.get)// 5




}
