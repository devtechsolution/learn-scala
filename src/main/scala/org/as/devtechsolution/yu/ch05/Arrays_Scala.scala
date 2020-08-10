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
