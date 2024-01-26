import user.*
import mailer.*
import logger.*
import servers.*
import formatters.*

import java.time.LocalDateTime

@Suppress("UNUSED_VARIABLE") // Turn off annoying error messages
fun main() {
    val recipient1 = User("Sealion", "Dion", "sealion@seamail.com")
    val recipient2 = User("Tuna", "Turner", "tunaTurner@clamazon.com")
    val recipient3 = User("Dolphin", "Lundgren", "dolph-lund@rocky.com")

    // TODO, PART 1: update `plainMailer` to inject the
    // `PlainTextFormatter` class
    val plainMailer = WhaleMailer(
        HostServer("orcaniser@karp.com")
    )

    // TODO, PART 1: update `htmlMailer` to inject the
    // `HtmlFormatter` class
    val htmlMailer = WhaleMailer(
        HostServer("orcaniser@karp.com")
    )

    // TODO, PART 2: update the `plainLogMailer` to inject
    // the `PlainTextFormatter` and a `Logger` function
    val plainLogMailer = WhaleMailer(
        HostServer("orcaniser@karp.com")
    )

    // TODO, PART 2: update the `plainTimeLogMailer` to inject
    // the `PlainTextFormatter` and a `Logger` function
    val plainTimeLogMailer = WhaleMailer(
        HostServer("orcaniser@karp.com")
    )


    User.users.forEach { user -> plainLogMailer.send(user, "Skiller Whale") }

    // TODO, PART 2: uncomment this code when `plainTimeLogMailer` is defined
    // User.users.forEach { user -> plainTimeLogMailer.send(user, "Skiller Whale") }
}
