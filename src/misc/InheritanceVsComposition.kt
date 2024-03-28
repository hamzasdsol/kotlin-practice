package misc

fun main() {

    /**
     * Inheritance
     */
    // Uses person as base class
    val student = Student("Hamza", 30, "MHS", "CS")
    student.age = 21
    println("Student: $student")
    // Now if something needs to be changed in Person class, Student class would also be affected

    /**
     * Composition
     */
    // Use Postal code class to compose Teacher object
    val postalCode = PostalCode(54000)
    val teacher = Teacher("Hamza", postalCode)
    println("Teacher: $teacher")

    // Composition gives us more flexibility in composing/creating more complex objects

}

open class Person(var name: String, var age: Int)

class Student(
    name: String,
    age: Int,
    val school: String,
    val major: String
): Person(name, age)

data class PostalCode(var code: Int)

data class Teacher(val name: String, val postalCode: PostalCode)