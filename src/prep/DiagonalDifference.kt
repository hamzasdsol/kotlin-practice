package prep

import java.util.Collections
import kotlin.math.absoluteValue

fun main() {
//    val a = arrayOf(1,2,3)
//    val b = arrayOf(4,3,6)
      val c = arrayOf(2,3,4,2)
    val q1 = arrayOf(1,4)
    val q2 = arrayOf(3,4)
    val queries = arrayOf(q1,q2)

    countTeams(c, queries)
    val d = listOf("abc","2","10","0")
    println(Collections.sort(d))

//    val list = listOf(c,d)
//
//
//
//    println(diagonalDifference(arrayOf(a,b,c)))

    // println(::add.invoke(5,6))
}

fun countTeams(rating: Array<Int>, queries: Array<Array<Int>>): Array<Int> {
    val result = mutableListOf<Int>()

    queries.forEachIndexed { index, query ->
        
    }

    return result.toTypedArray()
}


infix fun Int.add(a: Int) : Int {
    return this + a
}



private fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var primaryDiagonalSum = 0 // arr[0][0] + arr[1][1] + arr[2][2]
    var secondaryDiagonalSum = 0 // arr[0][2] + arr[1][1] + arr[2][0]
    val size = arr.size

    arr.forEachIndexed { index, _ ->
        primaryDiagonalSum += arr[index][index]
        secondaryDiagonalSum += arr[index][size-1 - index]
    }

    return (primaryDiagonalSum - secondaryDiagonalSum).absoluteValue
}