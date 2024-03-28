package leetcode

fun main() {
    println("Output: ${romanToInt("XVIII")}")
}
// s = "III"
fun romanToInt(s: String): Int {
    val charArray = s.toCharArray()
    var output = 0
    for (char in charArray) {
        println("char: $char")
        when(char) {
            'I' -> output += 1
            'V' -> output += 5
            'X' -> output += 10
            'L' -> output += 50
            'C' -> output += 100
            'D' -> output += 500
            'M' -> output += 1000
        }
    }

    return output
}
