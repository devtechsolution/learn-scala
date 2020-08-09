package org.as.devtechsolution.lab1

object HelloWorld {

  def main(args: Array[String]): Unit = {
    println("Hello World!")

    println("Welcome To Scala World!")
    val someVal= 5;
    val someRef= new Object
    println(someVal)
    println(someRef)
    printAny(someVal)
    printAny(someRef)
    //printAnyRef(someVal)
    printAnyRef(someRef)
    printAnyVal(someVal)
    //printAnyVal(someRef)
  }

  def printAny(x: Any)= println(x);
  def printAnyVal(x: AnyVal)= println(x);
  def printAnyRef(x: AnyRef)= println(x);


}
