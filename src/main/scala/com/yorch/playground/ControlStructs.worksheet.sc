/* Recursive functions */

// Tail recursive function
@scala.annotation.tailrec
private def loop(acc: Int = 0): Unit = {
    if (acc < 10){
        println(acc)
        loop(acc + 1)
    }
}

loop()

var acc = 0

// While loop, as it is an expresion it can be assigned
val result = while (acc < 10) {
    println(acc)
    acc += 1
}

// The result of a while loop is Unit
println(result)

// Función de orden superior que recibe una función hija y un valor
def parent(f: Int => String, value: Int): Unit = {
    val result = f(value)
    println(result)
}

def child(value: Int): String = s"Value is: $value"

parent(child, 5)

// List structure
List(1, 2, 3).foreach(println)


