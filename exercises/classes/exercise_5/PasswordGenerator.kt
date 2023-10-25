class PasswordGenerator(val passwordLength: Int = 20) {
    val ACCEPTED_CHARS = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-!@$"
    val random         = java.security.SecureRandom()

    init {
        require(passwordLength <= 40) { "Password was $passwordLength characters, must be fewer than 40." }
    }

    fun generate(): String {
        val password = StringBuilder()
        (0 until passwordLength).forEach {
            var randomDigit: Int = random.nextInt(ACCEPTED_CHARS.length)
            var randomChar: Char = ACCEPTED_CHARS[randomDigit]
            password.append(randomChar)
        }
        return password.toString()
    }
}
