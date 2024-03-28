package prep.solid.bad_practice

import prep.solid.FirebaseAuth
import prep.solid.MyCustomFileLogger

/**
 * 1 - Multiple responsibilities for this loginUser method. 1-Authentication, 2-Logging error, if any
 * 2 - Passing concrete implementation of FirebaseAuth. Should be an Abstraction to follow the D of SOLID
 * 3 - File logger should be passed from outside instead of initializing here.
 */
class MainRepository(
    private val auth: FirebaseAuth
) {
    suspend fun loginUser(email: String, password: String) {
        try {
            auth.authenticateWithEmailAndPassword(email, password)
        } catch (ex: Exception) {
            val fileLogger = MyCustomFileLogger()
            fileLogger.log(ex.message.toString())
        }
    }
}