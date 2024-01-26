import mailer.*
import user.*
import formatters.*
import servers.*

// <<< DO NOT EDIT THIS CODE >>> //
@Suppress("UNUSED_VARIABLE") // Turn off annoying error messages
fun main() {
    val recipient1        = User("Sealion", "Dion", "sealion@seamail.com")
    val recipient2        = User("Tuna", "Turner", "tunaTurner@clamazon.com")
    val recipient3        = User("Dolphin", "Lundgren", "dolph-lund@rocky.com")
    val plainTextMailer   = WhaleMailer()
    User.users.forEach { user -> plainTextMailer.send(user, "Skiller Whale") }
}
