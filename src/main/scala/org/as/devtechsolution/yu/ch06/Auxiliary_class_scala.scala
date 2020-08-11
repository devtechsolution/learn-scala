package org.as.devtechsolution.yu.ch06

/*
  @Auxiliary Constructor: are the alternative constructor for a class
  @Whenever we define an auxiliary constructor we must define the previously constructor

*/

class Customer(var name:String, var age:Int){
  def this(){
    this("Tom",32)
  }
  def this(name:String){
    this(name,32)
  }
}
object Auxiliary_class_scala extends App {
  var user1= new Customer("Max", 28)
  var user2= new Customer()
  var user3= new Customer("Max")
  println(user1.name+" " + user1.age )
  println(user2.name+" " + user2.age )
  println(user3.name+" " + user3.age )

  /*
      Max 28
      Tom 32
      Max 32
   */



}
