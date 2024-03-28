package misc

/**
 * Shallow Copy would keep the original nested object, it would just create the new copy of object.
 * If we make any change in original object then it would affect the copied object too. Because these
 * properties are pointing to the original properties.
 */

fun main() {
    val address = Address("Lahore")
    val user = User("12345", "Hamza", address)
    val copiedUser = user.copy(name = "Hamza Copy")
    println("User: $user")
    // User: User(id=12345, name=Hamza, address=Address(city=Lahore))
    println("Copied User: $copiedUser")
    // Copied User: User(id=12345, name=Hamza Copy, address=Address(city=Lahore))

    user.address.city = "Karachi"

    println("User after changing city in original object: $user")
    // User: User(id=12345, name=Hamza, address=Address(city=Lahore))
    println("Copied User after changing city in original object: $copiedUser")
    // Copied User: User(id=12345, name=Hamza Copy, address=Address(city=Lahore))

    //  Another thing to notice is copy function only copies the properties in the primary constructor.
    // That means that it won’t copy any property you define inside the class body.

    user.isChanged = true
    println("Original user isChanged property: ${user.isChanged}")
    // Original user isChanged property: true
    println("Copied user isChanged property: ${copiedUser.isChanged}")
    // Copied user isChanged property: false
}

data class Address(var city: String)

data class User(val id: String, val name: String, val address: Address) {
    var isChanged: Boolean = false
}