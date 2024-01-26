package mailer

import formatters.*
import servers.*
import user.*

/* Exercise 1: Interfaces
 * ----------------------
 *
 * PART 1: Write a `Formatter` interface in `Formatters.kt` that contains one
 * function `generateBody()`. This function should take a user and a message,
 * and return a `String` for the formatted email body.
 *
 * You can look at the `Server` interface in `Servers.kt` for a template.
 *
 * PART 2: Have `WhaleMailer` implement the `Formatter` and `Server` interfaces.
 * Override the inherited function signatures to simplify the `send()` function.
 *
 * HINT: to override these functions use the code in `send()`.
 */

public class WhaleMailer {
    public fun send(recipient: User, message: String) {
        // Generate plaintext body of email
        @Suppress("UNUSED_VARIABLE")
        val emailBody = "Dear ${recipient.name}\n${message}\nHave a great day!\nSkiller Whale"

        // Simulate dispatching message from the host server
        print("Host: orcaniser@karp.com\nSending mail to ${recipient.name} <${recipient.email}>")
        try { (0..8).forEach { print("."); Thread.sleep(40) }
        } catch (e: InterruptedException) {
            Thread.currentThread().interrupt()
            println("Thread interrupted")
        }
        println("complete.")
    }
}
