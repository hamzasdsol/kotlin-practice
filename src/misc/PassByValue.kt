package misc


/**
 * In summary, Numbers (Byte, Short, Int, Long), Booleans,
 * Characters and Strings are pass-by-value.
 * All the rest are pass-by-reference.
 */

fun main() {
//    val obj = SomeObj()
//    takeObject(obj)
//    println("Value of obj is: $obj")

    // Summary

    var a = 5
    var b = a
    a = 6

    println("b = $b")

    val crow = Crow(5)
    var c = crow
    crow.value = 6

    println("c = ${c.value}")

}

data class Crow(var value: Int)

fun takeInt(x: Int) {
    // x = 4 // [ won't compile because x is by default val ]
}

data class SomeObj(var x: Int = 0)

fun takeObject(o: SomeObj) {
    o.x = 7
}

/**
 * Java is always pass by value, with no exceptions, ever.
 *
 * So how is it that anyone can be at all confused by this, and believe that Java is pass by reference, or think they have an example of Java acting as pass by reference? The key point is that Java never provides direct access to the values of objects themselves, in any circumstances. The only access to objects is through a reference to that object. Because Java objects are always accessed through a reference, rather than directly, it is common to talk about fields and variables and method arguments as being objects, when pedantically they are only references to objects. The confusion stems from this (strictly speaking, incorrect) change in nomenclature.
 *
 * So, when calling a method
 *
 * For primitive arguments (int, long, etc.), the pass by value is the actual value of the primitive (for example, 3).
 * For objects, the pass by value is the value of the reference to the object.
 * So if you have doSomething(foo) and public void doSomething(Foo foo) { .. } the two Foos have copied references that point to the same objects.
 *
 * Naturally, passing by value a reference to an object looks very much like (and is indistinguishable in practice from) passing an object by reference.
 *
 *
 */