package ooop

fun main() {
    val lion = AnimalFactory().createInstanceOfAnimal("Lion")
    val tiger = AnimalFactory().createInstanceOfAnimal("Tiger")

    lion.eat()
    tiger.eat()

    lion.run()
    tiger.run()
}

abstract class Animal {
    abstract fun eat()
    abstract fun run()
}

class Tiger: Animal() {
    override fun eat() {
        println("Tiger eats")
    }

    override fun run() {
        println("Tiger runs")
    }

}

class Lion: Animal() {
    override fun eat() {
        println("Lion eats")
    }

    override fun run() {
        println("Lion runs")
    }
}

class AnimalFactory {
    fun createInstanceOfAnimal(input: String): Animal {
        return when(input) {
            "Lion" -> Lion()
            "Tiger" -> Tiger()
            else -> error("Out of scope")
        }
    }
}