package hackerrank

import kotlin.math.min

fun main() {
    println("Using kotlin helper functions")
    minMaxSum(arrayOf(1,2,3,4,5))
    minMaxSum(arrayOf(1,3,5,7,9))
    println("With out using kotlin helper functions")
    minMaxSumWithOutUsingKotlinHelperFunctions(arrayOf(1,2,3,4,5))
    minMaxSumWithOutUsingKotlinHelperFunctions(arrayOf(1,3,5,7,9))
}

private fun minMaxSum(arr: Array<Int>) {
    val max = arr.max()
    val min = arr.min()

    val sum = arr.sum()

    println("${sum - max} ${sum - min}")
}

private fun minMaxSumWithOutUsingKotlinHelperFunctions(arr: Array<Int>) {
    var max = 0
    var min = arr.first()
    var sum = 0

    arr.forEach { value ->
        if (value > max) max = value
        if (value < min) min = value
        sum += value
    }

    println("${sum - max} ${sum - min}")
}