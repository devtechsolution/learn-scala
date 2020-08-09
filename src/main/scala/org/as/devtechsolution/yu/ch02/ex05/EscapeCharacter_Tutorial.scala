package org.as.devtechsolution.yu.ch02.ex05

/*
    How to assign a JSON String to a val.
    How to escape characters in a String using backslash
    How to escape characters using triple quotes
    How to create multi-line text using stripMargin
 */
object EscapeCharacter_Tutorial extends App {
  println("Step 1: How to escape a Json String")
  //val donutJson: String ="{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"
  /*
      The Scala compiler will complain about the double quotes in the JSON field names.
      Error:(5, 29) ';' expected but string literal found.
      val donutJson: String ="{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"
   */


  println("\nStep 2: Using backslash to escpae quotes")
  val donutJson2: String = "{\"donut_name\":\"Glazed Donut\",\"taste_level\":\"Very Tasty\",\"price\":2.50}"
  println(s"donutJson2 = $donutJson2")
  /*
    1. As you can see from above, we were able to print a JSON String by making use of backslash \
    2. This is great but if you have longer text to escape, I'm sure you will get
    bored quite quickly : ) by having to escape each and every individual quote within
    your JSON String. So, let's see how to make this easier in Step 3 below.

  */



  println("\nStep 3: Using triple quotes \"\"\" to escape characters")
  val donutJson3: String = """{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"""
  println(s"donutJson3 = $donutJson3")


  println("\nStep 4:  Creating multi-line text using stripMargin")
  val donutJson4: String =
    """
      |{
      |"donut_name":"Glazed Donut",
      |"taste_level":"Very Tasty",
      |"price":2.50
      |}
    """.stripMargin
  println(s"donutJson4 = $donutJson4")



  println("\nTip:  stripMargin using a different character")
  val donutJson5: String =
    """
      #{
      #"donut_name":"Glazed Donut",
      #"taste_level":"Very Tasty",
      #"price":2.50
      #}
    """.stripMargin('#')
  println(s"donutJson5 = $donutJson4")
}
