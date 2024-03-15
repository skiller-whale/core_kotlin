/* <<< DO NOT EDIT THIS CLASS >>>
 * This is a Utility class to hash a plaintext password.
 */
package hasher

import passwordgenerator.*

import java.security.SecureRandom
import java.security.spec.KeySpec
import javax.crypto.SecretKeyFactory
import javax.crypto.spec.PBEKeySpec
import java.security.NoSuchAlgorithmException
import java.security.spec.InvalidKeySpecException

public class Hash : Hasher {
    fun createHash(password: CharArray): ByteArray {
        // Generate salt for hashing
        val random = SecureRandom()
        val salt = byteArrayOf(22)
        random.nextBytes(salt)

        // Hash password using PBEKeySpec
        val spec = PBEKeySpec(password, salt, 100, 192)
        val factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1")
        return factory.generateSecret(spec).getEncoded()
    }

    // Hash password and return hexadecimal string
    override fun hash(password: String): String {
        val hashed = this.createHash(password.toCharArray())
        return this.toHex(hashed)
    }

    fun toHex(bytes: ByteArray): String {
        return bytes.joinToString(separator = "") { byte -> "%02x".format(byte) }
    }
}
