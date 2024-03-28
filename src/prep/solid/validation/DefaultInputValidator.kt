package prep.solid.validation

import prep.solid.exception.EmailException
import prep.solid.exception.PasswordException

class DefaultInputValidator(
    private val patternChecker: PatternChecker
): InputValidator {
    override fun isValidEmail(email: String): Boolean {
        if (email.isEmpty() || !patternChecker.isValidEmailPattern(email)) {
            throw EmailException()
        }
        return true
    }

    override fun isValidPassword(password: String): Boolean {
        if (password.isEmpty() || password.length < 6) {
            throw PasswordException()
        }
        return true
    }
}

interface PatternChecker {
    fun isValidEmailPattern(email: String): Boolean
}

class DefaultPatternChecker: PatternChecker {
    override fun isValidEmailPattern(email: String): Boolean {
        return email.isNotEmpty() && email.length > 10
    }
}