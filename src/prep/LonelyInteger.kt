package prep

fun main() {
   println(lonelyInteger(arrayOf(1,2,3,4,3,2,1)))
}

private fun lonelyInteger(arr: Array<Int>): Int {
    return arr.groupingBy { it }.eachCount().entries.find { it.value == 1 }!!.key
//    println("data = $data")
//    println("entries = ${data.entries}")
//    println("keys = ${data.keys}")
//    println("values = ${data.values}")
//
//    // .entries.find { it.value == 1 }!!.key

}

// [1,2,3,4,3,2,1]
// [1,1,2,2,3,3,4]
//
//