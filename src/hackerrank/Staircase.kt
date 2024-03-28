package hackerrank

fun main() {
    staircase(6)
}

/**
 *
 * ---#  n - 3
 * --##  n - 2
 * -###  n - 1
 * ####  n - 0
 */

private fun staircase(number: Int) {
    for (line in 1 .. number) {
        print(" ".repeat(number - line))
        println("#".repeat(line))
    }
}