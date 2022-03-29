//kotlin class
val c1 = Car()

c1.brand = "Ford"
c1.model = "Mustang"
c1.year = 1969

println(c1.brand)   
println(c1.model)   
println(c1.year)    

//kotlin constructors
class Car(var brand: String, var model: String, var year: Int)

fun main() {
  val c1 = Car("Ford", "Mustang", 1969)
  val c2 = Car("BMW", "X5", 1999)
  val c3 = Car("Tesla", "Model S", 2020)
}

//kotlin Class Functions
class Car(var brand: String, var model: String, var year: Int) {

  fun drive() {
    println("Wrooom!")
  }
}

fun main() {
  val c1 = Car("Ford", "Mustang", 1969)

  c1.drive() 
}

//Kotlin Inheritance
open class MyParentClass {
  val x = 5
}

class MyChildClass: MyParentClass() {
  fun myFunction() {
    println(x)
  }
}

fun main() {
  val myObj = MyChildClass()
  myObj.myFunction()
}