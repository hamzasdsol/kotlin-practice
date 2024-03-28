package hackerrank

import kotlin.math.absoluteValue

fun main() {
    val a: Array<Int> = arrayOf(1, 2, 4, 5)
    val b: Array<Int> = arrayOf(4, 3, 6, 9)
    val c: Array<Int> = arrayOf(3, 2, 7, 6)
    val d: Array<Int> = arrayOf(1, 1, 2, 1)

    // sum of left diagonal should be 1 + 5 + 9 = 15
    // sum of right diagonal should be 3 + 5 + 7 = 15

    // diagonal difference should be 0

    val result = diagonalDifference(arrayOf(a, b, c, d))
    println("Difference is : $result")
}


fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var leftDiagonalSum = 0
    var rightDiagonalSum = 0

//    leftDiagonalSum = arr[0][0] + arr[1][1] + arr[2][2]
//    rightDiagonalSum = arr[0][2] + arr[1][1] + arr[2][0]

    val size = arr.size

    for (i in 0..< size) {
        leftDiagonalSum += arr[i][i]
        rightDiagonalSum += arr[i][size-1 - i]
    }

    println("left = $leftDiagonalSum  right = $rightDiagonalSum")


    return (leftDiagonalSum - rightDiagonalSum).absoluteValue
}