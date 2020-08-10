package org.as.devtechsolution.yu.ch03

import java.util.Date

object Partial_Applied_Function extends  App {
  val sum= (a:Int, b: Int, c: Int)=> a+b+c

  val f1= sum(10,20, _:Int);
  val f2= sum(10,_:Int, _:Int);
  println(f1(30))
  println(f2(20,30))

  def log(date: Date, message:String)={
    println(date + " "+ message);
  }
  val date= new Date;
  val newLog= log(date, _:String)
  newLog("Message 1")


}
