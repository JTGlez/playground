// Code lives in com.yorch.playground.Main
package com.yorch
package playground
import scala.io

// In Scala 2 you can't have functions or variables outside of a class or object

// Singleton object
object Main {

  /** Entry point of the program.
    * The main methou will be executed immediatly.
    *
    * @param args
    */ 
  def main(args: Array[String]): Unit = {
    println("─" * 100)

    println("Hola Mundo!")

    // mkString method overload
    println(
      args.mkString(
        start= "Array(",
        sep = ", ",
        end = ")"
      )
    )

    val name = io.StdIn.readLine("What's your name")
    println(s"""Hello, $name!""")

  }
}

class Dog
