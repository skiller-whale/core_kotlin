package mailer

import logger.*
import formatters.*
import servers.*
import user.*

/* Exercise 3: Composition and Dependency Injection
 * ------------------------------------------------
 *
 * The `WhaleMailer` class has been re-implemented here to use dependency injection, rather
 * than inheritance, to obtain functionality from the `Server` interface.
 *
 * However, it currently implements the `Formatter` and `Logger` interfaces, and hardcodes the
 * behaviour in each case (to format emails in plaintext, and to log emails after sending them).
 *
 * PART 1: de-couple `WhaleMailer` from `Formatter`. Formatting behaviour should be injected as
 * a dependency through instances of a `PlainTextFormatter` class, or an `HtmlFormatter` class.
 * The latter is defined for you in `Formatters.kt`, and should service as a template for the
 * `PlainTextFormatter` class.
 *
 * Update `Main.kt` so that the `plainMailer` and `htmlMailer` objects are each constructed by
 * injecting an instance of the appropriate formatting class.
 *
 * PART 2: de-couple `WhaleMailer` from `Logger` and turn the interface into a functional one.
 * Enable `WhaleMailer` to have a `Logger` dependency injected, then update `Main.kt` to create
 * the `plainLogMailer` and `plainTimeLogMailer`. These should print the following strings:
 *
 *      plainLogMailer     ==> "Email sent: to ${it.email}\n"
 *      plainTimeLogMailer ==> "Email sent: to ${it.email} at ${LocalDateTime.now()}\n"
 *
 * Use lambda functions to inject the logging behaviour.
 *
 * Hint: you should update the primary constructor for `WhaleMailer` by adding two extra
 * parameters for each interface. The `Logger` parameter's default behaviour should do no logging.
 */

open public class WhaleMailer (
    private val server: Server
) : Formatter, Logger {
    public fun send(recipient: User, message: String) {
        val emailBody: String = generateBody(recipient, message)
        server.dispatch(recipient, emailBody)
        log(recipient)
    }

    override public fun generateBody(recipient: User, content: String): String {
        return "Dear ${recipient.name}\n${content}\nHave a great day!\nSkiller Whale"
    }

    override public fun log(recipient: User) {
        println("Email sent: to ${recipient.email}")
    }
}
