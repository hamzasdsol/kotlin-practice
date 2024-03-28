package prep

fun main() {
    plusMinus(arrayOf(1, 1, 0, -1, -1))
}

private fun plusMinus(arr: Array<Int>) {
    var positives = 0
    var negatives = 0
    var zeroes = 0
    val size = arr.size.toDouble()

    for (value in arr) {
        when {
            value > 0 -> positives++
            value < 0 -> negatives++
            else -> zeroes++
        }
    }

    println("${positives / size}")
    println("${negatives / size}")
    println("${zeroes / size}")

}