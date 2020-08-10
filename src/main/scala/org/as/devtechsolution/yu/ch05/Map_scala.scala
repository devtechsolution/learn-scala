package org.as.devtechsolution.yu.ch05

/*
  @ Maps are collection of key-value pairs where keys should be unique, values can be duplicate

*/
object Map_scala extends App {
  val mymap: Map[Int, String]=
      Map(801->"Max", 802->"Tom", 804->"July",  804->"Julyyy")
  val mymap2: Map[Int, String]=
    Map(805->"Ali")
  println(mymap) //Map(801 -> Max, 802 -> Tom, 804 -> July)Map(801 -> Max, 802 -> Tom, 804 -> July)
  /*
    println(mymap(803))
    Exception in thread "main" java.util.NoSuchElementException: key not found: 803
  */
  println(mymap(801))//Max
  println(mymap.keys)//Set(801, 802, 804)
  println(mymap.values)//Iterable(Max, Tom, Julyyy)
  println(mymap.isEmpty)//false

  mymap.keys.foreach{ key=>
    println("Key "+ key)
    println("Values "+ mymap(key))
  }
  /*
        Key 801
        Values Max
        Key 802
        Values Tom
        Key 804
        Values Julyyy
   */

  println(mymap.contains(8000))// false
  println(mymap ++ mymap2)//Map(801 -> Max, 802 -> Tom, 804 -> Julyyy, 805 -> Ali)
  println(mymap.concat(mymap2))//Map(801 -> Max, 802 -> Tom, 804 -> Julyyy, 805 -> Ali)
  println(mymap.size)//3



}
