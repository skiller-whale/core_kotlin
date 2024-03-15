import passwordgenerator.*
import hasher.*

fun main() {
    val plainGenerator = PasswordGenerator()
    val plainPassword = plainGenerator.generate()

    plainGenerator.hasher = Hash()

    val hashedPassword = plainGenerator.generate()

    plainGenerator.passwordLength  = 40
    plainGenerator.acceptedChars   = "SKILLERWHALE_-!@*$"

    val customPassword = plainGenerator.generate()

	println("Plain password:  $plainPassword")
    println("Hashed password: $hashedPassword")
    println("Custom password: $customPassword")
}
