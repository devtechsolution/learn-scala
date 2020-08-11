package org.as.devtechsolution.yu.ch06.inheritance

class Polygon {
  def area: Double = 0.0
}

  object Polygon extends App{
    var poly= new Polygon;
    printArea(poly)// 0.0
    var rect= new Rectangle(25.0,32);
    printArea(rect)// 800.0
    var tri= new Triangle(25.0,32);
    printArea(tri)//400.0

    def printArea(p:Polygon): Unit ={
      println(p.area)
    }

  }



