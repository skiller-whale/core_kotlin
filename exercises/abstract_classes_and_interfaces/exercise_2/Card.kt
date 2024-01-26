package cards

import api.*

import java.time.LocalDate

/* Exercise 1: Abstract Classes
 * ----------------------------
 *
 * PART 1: make the `Card` class `abstract` and choose which of the following
 * functions and properties to make `abstract`. You'll also need to remove any
 * implementation details if you do this:
 *
 *  - expectedCvvLength
 *  - takePayment(amountPence: Int)
 *  - validate()
 *
 * Update the `Visa` class correspondingly.
 *
 * PART 2: define a `ClamericanExpress` class that extends `Card` and implements
 * any inherited `abstract` functions or properties. Recall that Clamerican Express
 * cards have a CVV length of four, not three.
 *
 * Hint: look at your updated implementation for `Visa`.
 *
 * Once you're finished, uncomment the lines in `Main.kt` and go back to the slide
 * instructions to compile and run this code.
 */

public open class Card (
    val cardType: String,
    val number: String,
    val expiryDate: String,
    val cvv: String,
) {
    protected val expectedCvvLength: Int = 3

    public fun takePayment(amountPence: Int): Unit {
        // Currently hardcoded for Visa payments
        PaymentService().visaPayment(this, amountPence)
    }

    // Separate different validation steps into separate methods
    @Throws(InvalidCardException::class)
    protected fun validateExpiryDate() {
        val expiry: LocalDate = LocalDate.parse(expiryDate)
        if (expiry.isBefore(LocalDate.now())) {
            throw InvalidCardException("Card has expired")
        }
    }

    @Throws(InvalidCardException::class)
    protected fun validateCvv() {
        if (cvv.length != expectedCvvLength) {
            throw InvalidCardException(
                "cvv should be ${expectedCvvLength} digits long"
            )
        }
    }

    @Throws(InvalidCardException::class)
    public fun validate() {
        validateExpiryDate()
        validateCvv()
    }
}
