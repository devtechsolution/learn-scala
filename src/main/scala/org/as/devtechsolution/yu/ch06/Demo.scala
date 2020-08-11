package org.as.devtechsolution.yu.ch06
/*
  @Class is a blue print of an object
            getter  setter
  @var      yes     yes
  @val      Yes     No
  @default  No      No
  @private can't use outside of the class.
*/
class User(var name:String, var age:Int);
class Employee(private var name:String, var age:Int){
  def printName{ println(name)}
};
class Student(name:String,age:Int){
  def printName{ println(name)}
  def printAge{ println(age)}
};

object Demo extends App {
  var user= new User("Max",28);
  println(user.name)
  println(user.age)
  user.name="Tom"
  user.age=22
  println(user.name)//Tom
  println(user.age)//22

  var emp= new Employee("Max",28);
  //println(emp.name)
  emp.printName// Max
  println(emp.age)// 28

  var stu= new Student("Max",28);
  //println(emp.name)
  stu.printName// Max
  //stu(emp.age)// Error
  stu.printAge// 28



}
