package prep

import kotlin.math.absoluteValue

fun main() {
    println(findMedian(arrayOf(0,3,2,4,2,5,5,1,1,5,5)))
    // 01122345555
}

fun findMedian(arr: Array<Int>): Int {
    val size = arr.size
    return arr.sortedArray()[size/2]
}