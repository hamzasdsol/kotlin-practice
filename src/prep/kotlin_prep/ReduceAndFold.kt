package prep.kotlin_prep

fun main() {
    println(fold(arrayOf(1,2,3,4)))
    println(reduce(arrayOf(1,2,3,4)))
}

fun fold(arr: Array<Int>): Int {
    return arr.fold(5) { initial, element ->
        initial + element
    }
}

fun reduce(arr: Array<Int>): Int {
    return arr.reduce { initial, element ->
        initial + element
    }
}