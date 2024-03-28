package misc

/**
 * You can call Kotlin extension functions from Java, sure,
 * but you can't call them with extension function syntax,
 * you must call them like static methods.
 */

fun main() {
    println("".myExtensionFunction())
}

fun String.myExtensionFunction() = "Hello, I am the extension function"