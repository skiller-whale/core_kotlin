package passwordgenerator

// An interface to hash a password, represented as a function
// from a String to a hexadecimal String
fun interface Hasher {
    fun hash(password: String): String
}

class PasswordGenerator() {
    var passwordLength: Int   = 20
    var acceptedChars: String = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-!@$"
    var random                = java.security.SecureRandom()
    var hasher: Hasher        = Hasher { x: String -> x }

    // Generate plaintext password
    private fun generatePlain(): String {
        val password = StringBuilder()
        (0 until passwordLength).forEach {
            var randomDigit: Int = random.nextInt(acceptedChars.length)
            var randomChar: Char = acceptedChars[randomDigit]
            password.append(randomChar)
        }
        return password.toString()
    }

    // Generate hashed password
    public fun generate(): String {
        val plain = generatePlain()
        return hasher.hash(plain)
    }
}
