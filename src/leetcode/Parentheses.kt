package leetcode

fun main() {
    //println(isValidParentheses("()"))
    isValidParentheses("()")
}

fun isValidParentheses(s: String): Boolean {
    val set = mapOf(
        '(' to ')',
        '{' to '}',
        '[' to ']'
    )

    var isValid = false

    s.forEach {
        println(set[it]?.let { ch -> s.contains(ch) } == true)
        isValid = set[it]?.let { ch -> s.contains(ch) } == true
    }

    return isValid
}


// ['(', ')']

// map = (key, value)

// if we have '(' then we should also have ')'.