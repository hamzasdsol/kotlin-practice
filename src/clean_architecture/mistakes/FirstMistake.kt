package clean_architecture.mistakes

fun main() {
    val androidSpecificEmailValidator = AndroidSpecificEmailValidator()
    val fakeEmailValidator = FakeEmailValidator()
    val emailValidatorUseCase = DefaultEmailValidatorUseCase(fakeEmailValidator)
    emailValidatorUseCase.execute("test@test.com")
}

/**
 * Writing unit test is not possible because
 * there's an android specific class (Patterns)
 * which would require emulator/device to run
 * the test thus this is an instrumented test and no longer unit test
 */
class EmailValidatorUseCase {
    fun execute(email: String): Boolean {
        // Android specific code like Patterns.EMAIL.matches(email)
        return false
    }
}

/**
 * Have this use case class in Domain layer
 */
class DefaultEmailValidatorUseCase(
    private val emailValidator: EmailValidator
) {
    fun execute(email: String): Boolean {
        if (email.isBlank()) {
            return false
        }

        return emailValidator.isValidEmail(email)
    }
}

/**
 * Have this interface in Domain layer
 */
interface EmailValidator {
    fun isValidEmail(email: String): Boolean
}

/**
 * Have this implementation in data layer
 */
class AndroidSpecificEmailValidator: EmailValidator {
    override fun isValidEmail(email: String): Boolean {
        // We can use Android specific code here in data layer
        return true
    }
}

/**
 * Fake validator for unit tests with specific input
 */
class FakeEmailValidator: EmailValidator {
    override fun isValidEmail(email: String): Boolean {
        // return whatever you need to test the behavior
        return true
    }
}