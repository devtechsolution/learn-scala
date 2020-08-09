package org.as.devtechsolution.part2

object example_7 {
  def main(args: Array[String]): Unit = {
    val x:String=null
    if(x==null) println("null") else println("Not null")
//    val y:Int=null
//    println(y)
    //println(x)
    val emptyList= List() //Pattern: emptyList: List[Nothing]
    val someList= List(1,2,3,4) //Pattern: someList: List[Int]
    var listIter= someList
    println(someList)
    println(listIter)
    while (listIter!=Nil){
      println(listIter.head);
      listIter= listIter.tail
      println(listIter)
    }

    println(fraction(22,7))




  }

  def fraction(number:Double, denom:Double) :Option[Double]=
  {
    if(number==0) None
    else Option(number/denom)
  }




}
