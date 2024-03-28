package misc


fun main() {
    println(sumPairs(arrayOf(1,2,2,2,3,3,4,4), 5))
}

fun sumPairs(input: Array<Int>, k: Int): Int {
    val frequencies: MutableMap<Int, Int> = HashMap()
    var pairsCount = 0

    for (i in input.indices) {
        val value = input[i]
        val complement = k - input[i]

        if (frequencies.containsKey(complement)) {
            val freq = frequencies[complement]!! - 1
            pairsCount++
            //System.out.println(value + ", " + complement);
            if (freq == 0) {
                frequencies.remove(complement)
            } else {
                frequencies[complement] = freq
            }
        } else {
            if (frequencies.containsKey(value)) {
                frequencies[value] = frequencies[value]!! + 1
            } else {
                frequencies[value] = 1
            }
        }
    }
    return pairsCount
}