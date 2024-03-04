import scala.math._ // Import all the math package, the underscore is a wildcard


1 + 2
println("Hello world")

val value = 8 *5 + 2
value * 2

print("Hello".toLowerCase())

value

var value2 = 5

value2 = 3

value2

// Optional declaring of the type
val hello: String = "Hi! Im Inmutable"
println(hello)

var number: Int = 3
println(number)

val xmax, ymax = 100
println((xmax, ymax))

// Everything is an object, and the types are actually classes
1.to(5)

// String interpolation to StringOps
"Hello".intersect("World")

// Int to RichInt
1.to(10)

// a.to(b) is the same as a to b
val a = "María"
val b = "Marta"

a intersect b

val x: BigInt = 1234567890
x * x * x

// If a method doesn't have params, you can call it without parenthesis
"Hello".distinct

sqrt(2)
pow(2, 5)

// Static method are called with the class name
// Random is a singleton object which generates random numbers
BigInt.probablePrime(100, scala.util.Random)

val chars = "Hello"

// Here, we see an overloadedform of the () operator, and its implemented as a method called apply
chars(2)
//
chars.apply(0)

val s = "Hello, World"
s.sorted.apply(3)

// When doing a casting, it is done with the apply method
BigInt("1234567890")
//It's the same as
BigInt.apply("1234567890")

val randomstring = {
    println("What am I?")
    1337
}

println(randomstring)

def function() = {
    println("I'm a function")
    print("But I will be recalculated every time I'm called")
    1337
}

function()

// Lazy val is a val that is calculated only once and when it's needed
lazy val mix = {
    println("I'm a lazy val")
    1337
}

println(mix)

def avg(x: Double, y: Double): Double = {
    (x + y) / 2
}

avg(3, 5)

def coinToss: String = if (Math.random < 0.5) "Heads" else "Tails"

coinToss

val unit1: Unit = ()
println(unit1)

// Scala actually has a null value, but it's not used as much as in Java
/* val danger: Null = null
println(danger) */

// Boolean values
val booleanValue: Boolean = true
println(booleanValue) 

val byteMin: Byte = Byte.MinValue
print(byteMin)

val byteMax: Byte = Byte.MaxValue
print(byteMax)

type N = Int
val myFavoriteNumber: N = 1337
println(myFavoriteNumber)

class Dog {
    def bark(): String = "Woof!"
}

// Class Alias
type D = Dog

val myDog: D = new D
println(myDog.bark())

val a2 = 123456

val a3 = 3208473208947328047L

// Doubles quotes are used for string literals
val s2 = "Hello, World"

// Single quotes are used for character literals
val c = 'A'

// Triple quotes are used for multiline strings
val s3 = """This is
""" + "a multiline" + """ string"""

println(s3)

// Triple quotes are used for multiline strings and the stripMargin method is used to remove the leading spaces
println(
    """ #This is
        #a multiline""".stripMargin('#')
)

// The stripMargin method is used to remove the leading spaces, and by default it uses the pipe character
println(
    """ |This is
        |a multiline""".stripMargin
)   

println(
    raw"""
        |This is
        |a multiline
        |string""".stripMargin 
)

// Like the python f-strings, Scala has string interpolation with the s prefix
val name = "Yorch"

println(s"H!, my name is: $name")

// And also, we can calculate values inside the string interpolation
val age = 25
println(s"My age plus two is: ${age + 2})")