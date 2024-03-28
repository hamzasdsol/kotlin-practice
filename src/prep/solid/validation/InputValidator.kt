package prep.solid.validation

interface EmailValidator {
    fun isValidEmail(email: String): Boolean
}

interface PasswordValidator {
    fun isValidPassword(password: String): Boolean
}

interface InputValidator: EmailValidator, PasswordValidator