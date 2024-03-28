package ooop


fun main() {
    val success = Result.Success
    val error = Result.Error("My error")

    processResult(success)
    processResult(error)
}


sealed class Result {
    data object Success: Result()
    data class Error(val error: String): Result()
}

fun processResult(result: Result) {
    when(result) {
        is Result.Error -> println("Error is ${result.error}")
        Result.Success -> println("Success")
    }
}