import javax.crypto.SecretKeyFactory
import javax.crypto.spec.PBEKeySpec
import kotlin.random.Random
import kotlin.time.measureTime
import kotlinx.coroutines.*

/**
EXERCISE 1 - PASSWORD HASHING
================================

The code below takes 10 username-password combinations, and securely hashes
the passwords using a slow hashing algorithm. It writes the hashed results to
a file, along with the username and a "salt" used in the hashing

This process is deliberately CPU expensive, to make brute-force attacks hard.

* Run the code and make note of the runtime.
* Update the code so that each password is hashed in a separate coroutine.
* Run the code again. Do you notice a speed up?

* Add the following line to each coroutine to check which thread it runs on
    
    println("I'm working in thread ${Thread.currentThread().name}")

* What do you notice?

Note:
the imported PASSWORDS is a dictionary mapping from username to password, e.g:
{
    "geri.hallibut@gmail.com":       "password123",
    "sealion@dion.com":              "better9098!pw01",
    "w.a.floatzart@music.com":       "iHEARTsymphonies",
}

The below functions are provided and you don't need to edit them.
**/

fun ByteArray.toHexString() = joinToString("") { it.toString(16).padStart(2, '0') }

/**
 * A function that hashes a password and returns the hash as a String.
 */
fun hashPassword(password: String, iterations: Int = 100_000): String {
    val salt = ByteArray(32)
    Random(42).nextBytes(salt)

    val spec = PBEKeySpec(password.toCharArray(), salt, iterations, 160)
    val skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256")
    return skf.generateSecret(spec).getEncoded().toHexString()
}

/**
 * A hashMap of emails to passwords.
 */
val PASSWORDS = hashMapOf(
    "mark@whaleburg.com"            to  "hello_nice_day",
    "shark.whalburg@gmail.com"      to "another-insecure-password!",
    "sting-ray.charles@hotmail.com" to "mothers!maiden!name",
    "oprahswimfrey@googlemail.com"  to "strong943lkOIlknv!-PASsWord",
    "skate_winslet@gmail.com"       to "weak_pw1",
    "whoopee@goldfish.com"          to "weak_pw2",
    "geri.hallibut@gmail.com"       to "dont-do-this",
    "sealion@dion.com"              to "better9098kalsie!pw01",
    "agatha.fishtie@yahoo.com"      to "password123",
    "w.a.floatzart@music.com"       to "another-weakish-password",
)

val timeTaken = measureTime {
    PASSWORDS.forEach { (key, value) ->
        val passHash = hashPassword(value)

        println(String.format("%-40s%s", key, passHash))
    }
}


println("Done in $timeTaken.")
