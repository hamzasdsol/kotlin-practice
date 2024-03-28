package hackerrank

fun main() {
    println("${birthdayCakeCandles(arrayOf(1,3,2,1,3))}")
    println("${birthdayCakeCandles(arrayOf(1,4,4,1,3,4,4,4,4,4))}")
}

private fun birthdayCakeCandles(arr: Array<Int>): Int {
    var max = 0
    var count = 0
    arr.forEach { value ->
        if (value > max) {
            max = value
            count = 0
        }

        if (value == max) count++
    }

    return count
}