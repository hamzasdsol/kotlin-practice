package misc

fun main() {
    println(StaticMembers.aMethod())
    println(SomeClass.getZ())
}

class SomeClass {
    private var z = 6

    companion object {
        const val CONSTANT = 9

        fun getZ(): Int {
            return SomeClass().z
        }
    }
}

class ANormalClass {
    var x = 5
}
