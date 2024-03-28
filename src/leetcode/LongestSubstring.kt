package leetcode

fun main() {
    println("length = ${lengthOfLongestSubstring("dvdf")}")
}

// s = "abcabc" // output = d, output = dv, output = d, output = df
// output = [abc], size = 3
fun lengthOfLongestSubstring(s: String): Int {
    val charArray = s.toCharArray()
    val output = StringBuilder()
    var subStringLength = 0
    for (char in charArray) {
        if (output.contains(char)) {
            output.setLength(0)
            output.append(char)
            if (output.length > subStringLength) {
                subStringLength = output.length
            }
        } else {
            output.append(char)
            if (output.length > subStringLength) {
                subStringLength = output.length
            }
        }
    }

    return subStringLength
}

