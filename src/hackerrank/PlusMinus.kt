package hackerrank

fun main() {
    plusMinus(arrayOf(2,2,2,0,0,0,0,-1,-1,-1,-1))
}

private fun plusMinus(arr: Array<Int>) {

    var positives = 0
    var negatives = 0
    var zeros = 0

    arr.forEach {
        when {
            it > 0 -> positives++
            it < 0 -> negatives++
            else -> zeros++
        }
    }

    println("Positives = $positives, negatives = $negatives, zeros = $zeros")
}