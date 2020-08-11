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
##### Option
```scala
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
```
##### map and filter method

````scala
package org.as.devtechsolution.yu.ch05
/*
    @ map and filter methods are two methods which we are used with collections.
    @ map() methods we typically used to iterate over Collection(Arrays, List, Set, Map) and
      then apply the fuction to each element of the collection
*/
object Map_Filter_Scala extends App {

  val lst= List(1,2,3,5,7,10,13)
  val mymap = Map(1->"Tom", 2-> "Max", 3-> "Jhon")
  println(lst.map(_*2))// List(2, 4, 6, 10, 14, 20, 26)
  //OR
  println(lst.map(x=> x*2))//List(2, 4, 6, 10, 14, 20, 26)
  println(lst.map(x=> x/0.2))// List(5.0, 10.0, 15.0, 25.0, 35.0, 50.0, 65.0)
  println(lst.map(x=> "Hi"+ x))//List(Hi1, Hi2, Hi3, Hi5, Hi7, Hi10, Hi13)
  println(lst.map(x=> "Hi"* x))//List(Hi, HiHi, HiHiHi, HiHiHiHiHi, HiHiHiHiHiHiHi, HiHiHiHiHiHiHiHiHiHi, HiHiHiHiHiHiHiHiHiHiHiHiHi)

  //Every (k,V) pair in map is a tuple
  println(mymap.map(x=> "Hi" + x))//List(Hi(1,Tom), Hi(2,Max), Hi(3,Jhon))

  println("xxxxxx")
  println(mymap.mapValues(x=> "Hi " +x))//MapView(<not computed>) Depricated
  println(mymap.mapValues(x=> "Hi " +x).toMap)// Map(1 -> Hi Tom, 2 -> Hi Max, 3 -> Hi Jhon) Deppricated
  println(mymap.view.mapValues(x=> "Hi " +x).toMap)//Map(1 -> Hi Tom, 2 -> Hi Max, 3 -> Hi Jhon)

  println("hello".map(_.toUpper))// HELLO
  //Flaten methods on collection
  println(List(List(1,2,3), List(3,4,5)))// List(List(1, 2, 3), List(3, 4, 5))
  println(List(List(1,2,3), List(3,4,5)).flatten)// List(1, 2, 3, 3, 4, 5)
  // FlatMap act as a shothhand to a map a collection and immidiately flatten it
  println(lst.flatMap(x=>List(x, x+1))) // List(1, 2, 2, 3, 3, 4, 5, 6, 7, 8, 10, 11, 13, 14)
  // If we ue map instead of flatMap we will get List of List not flatten
  println(lst.map(x=>List(x, x+1)))//List(List(1, 2), List(2, 3), List(3, 4), List(5, 6), List(7, 8), List(10, 11), List(13, 14))

  //Filter method
  //Filer method generally used with predicate(A predicate is a fuction which return a boolean value)
  println(lst.filter(x=> x%2==0))//List(2, 10)
  println(lst.filter(x=> x%2!=0))//List(1, 3, 5, 7, 13)
}
````


