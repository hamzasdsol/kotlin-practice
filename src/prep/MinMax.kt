package prep

fun main() {
    miniMaxSum(arrayOf(256741038, 623958417, 467905213, 714532089, 938071625))
}

private fun miniMaxSum(arr: Array<Int>): Unit {
    // Write your code here
    val max = arr.max().toLong()
    val min = arr.min().toLong()
    val sum = arr.sumOf { it.toLong() }

    // println("sum = $sum, min = $min, max = $max")

    println("${sum - max} ${sum - min}")
}