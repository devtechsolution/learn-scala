### Array, List, Set, Map, Tuple

##### Array
```scala
package org.as.devtechsolution.yu.ch05

import Array._
/*
  @Arrays are a data-structure which can store fixed size sequence elements of same data-type
  @Array declaration:
    @@ val <array_name>: Array[<data_type>] = new Array[<data_type>](<size_of_array>)
    @@ val <array_name>= new Array[<data_type>](<size_of_array>)
  @ Array declartion and initialization at same time
      val myarray3= Array(1,2,3,4,5)
  @ If we haven't assign value to array then default value will be assign
    String-> null, Double-> 0.0, Boolean-> false
*/
object Arrays_Scala extends App {

  // Array declartion
  val myarray: Array[Int] = new Array[Int](4)
  val myarray2= new Array[Boolean](5)
  // Array declartion and initialization at same time
  val myarray3= Array(1,2,3,4,5)

  // Initializing the Array
  myarray(0)=20; myarray(1)=50; myarray(2)=10; //myarray(3)=30
  // Access data of an Array
  println(myarray)// [I@73035e27

  for (x<- myarray) print(s"$x ")//20 50 10 0
  myarray(3)=30
  for (i<- 0 to (myarray.length-1)) print(" "+ myarray(i))// 20 50 10 30
  println()
  for(x<-myarray2) print(x)// falsefalsefalsefalsefalse default value
  //concatenation of two array of same data-type
  val conct= concat(myarray, myarray3);// import Array._
  for(x<- conct) print(x+ " ")//20 50 10 30 1 2 3 4 5

}

```
##### List
```scala
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

```
##### Set
```scala
package org.as.devtechsolution.yu.ch05
/*
  @ In Scala Set is collection of different element of same data-types
  @ i.e. Set can't have duplicate value inside them
  @ Sets are two types:
  @@ 1. Mutable Set: O
  @@ 2. Immutable Set: Object itself can't be changed inside immutable sets.
        By Default all Sets are immutable

  @ In Set insertion order not preserved

*/
object Sets_scala extends App {

  val myset: Set[Int] = Set(1,2,5,8,9,6,4,4,5,8)
  val myset2: Set[Int]= Set(4,2,9,18,19,16,14)
  val names: Set[String] = Set("Max", "Tom", "Jhon")
  println(myset)// HashSet(5, 1, 6, 9, 2, 8, 4) Insertion order nnot preserved and duplication not allowed
  println(names)// Set(Max, Tom, Jhon)
  // Add element to set
  println(myset+ 10)// HashSet(5, 10, 1, 6, 9, 2, 8, 4)
  println(names("Max"))// true
  println(myset.head)// 5
  println(myset.tail)// HashSet(1, 6, 9, 2, 8, 4)
  println(myset.isEmpty)// false

  // Concatenation of two sets having same data-types of values
  println(myset ++ myset2)// HashSet(5, 14, 1, 6, 9, 2, 18, 16, 8, 19, 4)
  println(myset.++(myset2))// HashSet(5, 14, 1, 6, 9, 2, 18, 16, 8, 19, 4)
  // Intersection of two sets
  println(myset.&(myset2))//HashSet(9, 2, 4)
  println(myset.intersect(myset2))//HashSet(9, 2, 4)

  // Min and Max
  println(myset.min)
  println(myset.max)

  // Iterrating
  myset.foreach(println)
  /*
      5
      1
      6
      9
      2
      8
      4
   */
  for(name<- names){
    println(name)
  }
  /*
      Max
      Tom
      Jhon
   */

}

```
##### Map
```scala
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

```
##### Tuple
```scala
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

```
