import passwordgenerator.*
import hasher.*

fun main() {
    // Create generators
    val plainGenerator  = PasswordGenerator()
    val hashGenerator   = PasswordGenerator()
    val customGenerator = PasswordGenerator()

    // Configure generators
    hashGenerator.hasher = Hash()
    customGenerator.hasher = Hash()
    customGenerator.passwordLength = 40
    customGenerator.acceptedChars = "SKILLERWHALE_-!@*$"

    // Create passwords
    val plainPassword  = plainGenerator.generate()
    val hashedPassword = hashGenerator.generate()
    val customPassword = customGenerator.generate()

	println("Plain password:  $plainPassword")
    println("Hashed password: $hashedPassword")
    println("Custom password: $customPassword")
}
