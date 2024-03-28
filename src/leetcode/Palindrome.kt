package leetcode

import java.util.Stack

fun main() {
    println(isPalindrome(-121))
}

fun isPalindrome(x: Int): Boolean {
    var input = x
    var reversed = 0
    while (input != 0) {
        val myTemp = input % 10
        reversed = reversed * 10 + myTemp
        input /= 10
    }

    return x == reversed
}

fun isPalindrome2(x: Int): Boolean {
    return x.toString() == x.toString().reversed()
}