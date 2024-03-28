package prep

import java.text.SimpleDateFormat
import java.util.*

fun main() {
    println(timeConversion("07:05:45PM"))
}

private fun timeConversion(s: String): String {
    val inputFormat = SimpleDateFormat("hh:mm:ssa", Locale.getDefault())
    val outputFormat = SimpleDateFormat("HH:mm:ss", Locale.getDefault())
    val date = inputFormat.parse(s)
    return outputFormat.format(date)
}