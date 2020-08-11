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
