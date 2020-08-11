package org.as.devtechsolution.yu.ch06.inheritance

class Triangle (var width:Double, var height:Double) extends Polygon {
  override def area: Double = width*height/2
}
