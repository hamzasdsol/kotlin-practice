package misc

fun main() {
    /**
     * Inheritance is-a relationship
     * Dog is an animal, they can have some common properties
     */
    val dog = Dog("Tommy", "German")
    println(dog.eat())
    println(dog.bark())

    /**
     * Association is where each class has an independent existence
     */
    val course = listOf(Course("English"), Course("Urdu"))
    val student = SchoolStudent("Alice", course)
    println("Student: $student")

    /**
     * Composition is strong relation where one class is composed of other classes
     */

    val engine = Engine()
    val car = Car(engine)
    println(car.drive())
}

class SchoolStudent(val name: String, var courses: List<Course>)

class Course(val name: String)

open class Animal(var name: String) {

    init {
        println("Animal created")
    }

    open fun eat() {
        println("Animal eats")
    }
}

class Dog(name: String, var breed: String): Animal(name) {

    init {
        println("Dog created")
    }

    fun bark() {
        println("Dog barks")
    }
}

class Engine {
    fun start() {
        println("Engine started.")
    }
}

class Car(
    private val engine: Engine
) {
    fun drive() {
        engine.start()
        println("Car is moving.")
    }
}