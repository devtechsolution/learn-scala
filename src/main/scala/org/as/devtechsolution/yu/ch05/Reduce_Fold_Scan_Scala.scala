package org.as.devtechsolution.yu.ch05
/*
  @Scala- Reduce, fold, scan(left/right)
  @All three methods we can apply on collection and they comes in the confirm
  @reduceLeft, reduceRight, foldLeft, foldRight, scanLeft, scanRight
  @In general all 6 methods can be ussed to apply binary operator of each element of collection
   and the result of each steps is passed to next step
  @Reduce: Reduce method takes associative binary operator function as a parameter
  @Fold: The fold and reduce methods are almost same only difference is we can pass
  initial arguments
  @Scan: Same as fold but it retun map of intermediate result

*/

object Reduce_Fold_Scan_Scala extends App {

  val lst= List(1,2,3,5,7,10,13)
  val lst2= List("A","B","C")

  println(lst2)// List(A, B, C)
  println(lst2.reduceLeft(_ + _))// ABC
  println(lst.reduceLeft(_ + _))// 41
  println(lst.reduceLeft((x,y)=>{println(x + "," + y); x+y}))
  /*
    1,2
    3,3
    6,5
    11,7
    18,10
    28,13
    41
  */
  println(lst.reduceRight(_ + _))//41
  println(lst.reduceLeft(_ - _))//-39
  println(lst.reduceLeft((x,y)=>{println(x + "," + y); x-y}))
  /*
       1,2
      -1,3
      -4,5
      -9,7
      -16,10
      -26,13
      -39
   */
  println(lst.reduceRight(_ - _))//7

  println(lst.reduceRight((x,y)=>{println(x + "," + y); x-y}))
  /*
      10,13
      7,-3
      5,10
      3,-5
      2,8
      1,-6
      7
   */

  //@Fold: The fold and reduce methods are almost same only difference is we can pass
  //  initial arguments
  println(lst.foldLeft(0)(_+_)) //41
  println(lst.foldLeft(10)(_+_)) //51
  println(lst2.foldLeft("z")(_+_)) //zABC
  println(lst.foldRight(100)(_+_)) //141
  println(lst2.foldRight("z")(_+_)) //ABCz

  //@Scan: Same as fold but it retun map of intermediate result
  println(lst.scanLeft(100)(_+_)) //List(100, 101, 103, 106, 111, 118, 128, 141)
  println(lst.scanRight(100)(_+_)) //List(141, 140, 138, 135, 130, 123, 113, 100)
  println(lst2.scanLeft("z")(_+_)) //List(z, zA, zAB, zABC)
  println(lst2.scanRight("z")(_+_)) //List(ABCz, BCz, Cz, z)
}
