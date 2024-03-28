package clean_architecture.interview

fun main() {
    // println(reverseStr("str"))

    val animal: Animal = Animal()
    animal.run()

    val pig: Pig = Pig()
    pig.run()

    val dog: Animal = Dog()
    dog.run()
}

open class Animal {
    open fun run() {
        println("Animal run")
    }
}

class Dog: Animal() {
    override fun run() {
        println("Dog run")
    }
}

class Pig: Animal() {
    override fun run() {
        println("Pig run")
    }
}

fun reverseStr(s: String): String {
    val reversed: StringBuilder = StringBuilder()
    val charArr = s.toCharArray()

    for (i in charArr.size - 1 downTo 0) {
        reversed.append(charArr[i])
    }

    return reversed.toString()
}

