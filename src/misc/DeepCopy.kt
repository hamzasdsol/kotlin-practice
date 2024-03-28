package misc

import com.google.gson.Gson

/**
 * A deep copy creates a new object that is a copy of the original object
 * and (recursively) all its nested objects. Therefore, any changes made
 * to the nested objects in the original object will not affect the new object.
 */
fun main() {
    val address2 = Address2("Lahore")
    val originalUser = User2("12345", "Hamza", address2)
    val clonedUser = originalUser.clone()

    // Make changes in the original nested objects
    originalUser.address.city = "Karachi"

    println("Original user: $originalUser") // should be changed
    println("Cloned user: $clonedUser") // should not be changed

    // Make changes in original isChanged
    originalUser.isChanged = true
    println("Original isChanged: ${originalUser.isChanged}") // should be changed
    println("Cloned isChanged: ${clonedUser.isChanged}") // should not be changed

}

data class Address2(var city: String): Cloneable {
    public override fun clone(): Address2 {
        return super.clone() as Address2
    }
}

data class User2(val id: String, val name: String, val address: Address2): Cloneable {
    var isChanged = false

    public override fun clone(): User2 {
        val gson = Gson()
        return gson.fromJson(gson.toJson(this), User2::class.java)
    }
}