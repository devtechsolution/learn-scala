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
