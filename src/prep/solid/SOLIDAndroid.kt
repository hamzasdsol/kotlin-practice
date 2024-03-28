package prep.solid

import prep.solid.validation.*

fun main() {
    // use some di framework here
    val firebaseAuth = FirebaseAuth()
    val fileLogger = MyCustomFileLogger()
    val patternChecker = DefaultPatternChecker()
    val inputValidator = DefaultInputValidator(patternChecker = patternChecker)
    val mainRepository = MainRepository(firebaseAuth, fileLogger, inputValidator)

    val passwordReset = PasswordReset(inputValidator, fileLogger)
    passwordReset.sendPasswordToEmail("test@test.com")

    // on click of login button
    mainRepository.login("test@test.com", "1234567")
}

class PasswordReset(
    private val emailValidator: EmailValidator,
    private val errorLogger: ILogger
) {
    fun sendPasswordToEmail(email: String) {
        try {
            if (emailValidator.isValidEmail(email)) {
                println("Sending email to password")
            }
        } catch (ex: Exception) {
            errorLogger.log(ex.message.toString())
        }
    }
}

class MainRepository(
    private val auth: Authenticator,
    private val fileLogger: ILogger,
    private val inputValidator: InputValidator
) {
    fun login(email: String, password: String) {
        try {
            if (inputValidator.isValidEmail(email) && inputValidator.isValidPassword(password)) {
                auth.authenticateWithEmailAndPassword(email, password)
            }
        } catch (ex: Exception) {
            fileLogger.log(ex.message.toString())
        }
    }
}


interface Authenticator {
    fun authenticateWithEmailAndPassword(email: String, password: String)
}

class FirebaseAuth: Authenticator {
    override fun authenticateWithEmailAndPassword(email: String, password: String) {
        println("Sign in with $email and $password firebase auth")
    }
}

class GoogleAuth: Authenticator {
    override fun authenticateWithEmailAndPassword(email: String, password: String) {
        println("Sign in with $email and $password google auth")
    }
}

class MyCustomAuth: Authenticator {
    override fun authenticateWithEmailAndPassword(email: String, password: String) {
        println("Sign in with $email and $password my custom auth")
    }
}


interface ILogger {
    fun log(ex: String)
}

interface IFileLogger: ILogger {
    fun printLogs()
}

class FileLogger: IFileLogger {

    override fun printLogs() {
        println("Printing logs")
    }

   override fun log(ex: String) {
        println("Error logged + $ex")
    }
}

class MyCustomFileLogger: ILogger {
    override fun log(ex: String) {
        println("My custom error logged $ex")
    }
}



