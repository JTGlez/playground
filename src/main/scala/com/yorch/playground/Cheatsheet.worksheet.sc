/* Importación de paquetes y operaciones básicas */
import scala.math._ // Import all the math package, the underscore is a wildcard
import scala.io

1 + 2 // Suma básica
println("Hello world") // Impresión de texto

val value = 8 * 5 + 2 // Cálculo y asignación de una variable inmutable
value * 2 // Uso de una variable inmutable

print("Hello".toLowerCase()) // Conversión de texto a minúsculas

value // Acceso a una variable inmutable

var value2 = 5 // Declaración de una variable mutable
value2 = 3 // Reasignación de una variable mutable
value2 // Acceso a una variable mutable

/* Declaración de varibles y tipos */

// Declaración opcional de tipo
val hello: String = "Hi! Im Inmutable" // Valor inmutable con tipo explícito
println(hello) // Impresión de un valor inmutable

var number: Int = 3 // Valor mutable con tipo explícito
println(number) // Impresión de un valor mutable

val xmax, ymax = 100 // Declaración de múltiples variables en una línea
println((xmax, ymax)) // Impresión de una tupla

/* Trabajo con objetos y tipos */

1.to(5) // Creación de un rango de números

// Interpolación de cadenas y métodos de RichInt
"Hello".intersect("World") // Intersección de cadenas
1.to(10) // Conversión de un entero a un rango

val a = "María"
val b = "Marta"
a intersect b // Intersección de cadenas

val x: BigInt = 1234567890
x * x * x // Operaciones con BigInt

"Hello".distinct // Eliminación de caracteres duplicados en una cadena

sqrt(2) // Cálculo de la raíz cuadrada
pow(2, 5) // Cálculo de una potencia

// Métodos estáticos y generación de números aleatorios
BigInt.probablePrime(100, scala.util.Random) // Generación de un número primo probable

/* Acceso y manipulación de caracteres y cadenas */

val chars = "Hello"
chars(2) // Acceso a un carácter en una posición específica
chars.apply(0) // Uso del método apply para acceder a un carácter

val s = "Hello, World"
s.sorted.apply(3) // Ordenamiento y acceso a un carácter en una cadena

BigInt("1234567890") // Conversión de cadena a BigInt
BigInt.apply("1234567890") // Uso del método apply para la conversión

/* Valores lazy y funciones */
val randomstring = {
  println("What am I?")
  1337
}
println(randomstring) // Impresión de un valor perezoso

def function() = {
  println("I'm a function")
  print("But I will be recalculated every time I'm called")
  1337
}
function() // Llamada a una función

lazy val mix = {
  println("I'm a lazy val")
  1337
}
println(mix) // Impresión de un valor perezoso

def avg(x: Double, y: Double): Double =
  (x + y) / 2
avg(3, 5) // Cálculo de la media de dos números

def coinToss: String = if (Math.random < 0.5) "Heads" else "Tails"
coinToss // Lanzamiento de una moneda

/* Tipos de datos y literales */
val unit1: Unit = () // Valor unitario
println(unit1) // Impresión de un valor unitario

val booleanValue: Boolean = true // Valor booleano
println(booleanValue) // Impresión de un valor booleano

val byteMin: Byte = Byte.MinValue // Valor mínimo de Byte
print(byteMin) // Impresión de un valor mínimo de Byte

val byteMax: Byte = Byte.MaxValue // Valor máximo de Byte
print(byteMax) // Impresión de un valor máximo de Byte

type N = Int // Definición de un alias de tipo
val myFavoriteNumber: N = 1337 // Uso de un alias de tipo
println(myFavoriteNumber) // Impresión de un valor con alias de tipo

/* Clases y objetos */

class Dog {
  def bark(): String = "Woof!" // Método de instancia
}

type D = Dog // Alias de tipo para una clase

val myDog: D = new D // Creación de una instancia de Dog
println(myDog.bark()) // Llamada a un método de instancia

/* Literales de cadena y caracteres */

val s2 = "Hello, World" // Cadena de texto
val c = 'A' // Carácter
val s3 = """This is
a multiline
string""" // Cadena de texto multilínea
println(s3) // Impresión de una cadena de texto multilínea

println(
  """ #This is
        #a multiline""".stripMargin('#')
) // Uso de stripMargin para eliminar espacios iniciales

println(
  """ |This is
        |a multiline""".stripMargin
) // Uso de stripMargin con el carácter predeterminado

println(
  raw"""
        |This is
        |a multiline
        |string""".stripMargin
) // Uso de raw para no interpretar caracteres especiales

/* Interpolado con cadenas */
val name = "Yorch" // Asignación de una cadena
println(s"H!, my name is: $name") // Interpolación de cadenas con el prefijo s

val age = 25 // Asignación de un valor numérico
println(s"My age plus two is: ${age + 2}") // Interpolación de cadenas con cálculos

/* Condicionales */

val result = if (true) "good" else "bad"

val y = 0

// Se almacena en s1 lo que retorne la condición
val s1 = if (y > 0) 1 else -1
println(s1)

// Declaraciones multilínea: en este caso no se requieren llaves al ser expresiones de una sola línea
if (y > 0)
  println("positive")
else if (y == 0)
  println("zero")
else
  println("negative")

var n: Int = 1
var r = 3

// Expresión multilínea dentro de un if
if (n > 0) { r = r * n; n -= 1 }
print(r)
print(n)

def wannaWatchMovieOrGoForIceCream(
    isMovieTime: Boolean,
    isIceCreamTime: Boolean
): String = 
    if (isMovieTime && isIceCreamTime) "Awesome!" // Return "Awesome!" if both are true, we don't need to use the return keyword
    else if (isMovieTime | isIceCreamTime) "Well, it's all right!"
    else "Meh"

println(wannaWatchMovieOrGoForIceCream(true, true))

def boringFunction(
    isBoring: Boolean
): String =
    if (isBoring) "This is boring!"
    else "This is funny!"

println(boringFunction(false))

val functionStored = boringFunction(false)

val nameValue = io.StdIn.readLine("What's your name? ")
println(s"Hello, $nameValue!")