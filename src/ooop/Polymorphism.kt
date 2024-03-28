package ooop

fun main() {

}

open class Shape {
   open fun draw() {
        println("Drawing shape")
    }
}

class Rectangle: Shape() {
    override fun draw() {
        println("Drawing rectangle")
    }
}

class Circle: Shape() {
    override fun draw() {
        println("Drawing Circle")
    }
}