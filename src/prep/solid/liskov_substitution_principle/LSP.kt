package prep.solid.liskov_substitution_principle

/**
 * LSP is all about well-designed inheritance
 */
fun main() {
    val vehicle: Vehicle = Car("Toyota")
    vehicle.startEngine()
   // vehicle.openTrunk() // compilation error because openTrunk is not part of Vehicle base class
}

open class Vehicle(val name: String) {
    open fun startEngine() {
        println("$name is started")
    }
}

class Car(name: String): Vehicle(name) {
    override fun startEngine() {
        println("$name car is started")
    }

    fun openTrunk() {
        println("Trunk opening for $name car")
    }
}

class Motorcycle(name: String): Vehicle(name) {
    override fun startEngine() {
        println("$name bike is started")
    }
}