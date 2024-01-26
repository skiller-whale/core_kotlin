package api

import cards.*
import java.time.LocalDate

public class PaymentService {

    @Suppress("UNUSED_PARAMETER")
    private fun takePayment(
        cardType: String,
        number: String,
        amountPence: Int,
    ) {
        val displayNumber = "${number.slice(0..3)} ${number.slice(4..7)} ${number.slice(8..11)} ${number.slice(12 until 16)}"
        print("Taking $cardType payment from <${displayNumber}>")
        try {
            (0..3).forEach { print("."); Thread.sleep(200) }
        } catch (e: InterruptedException) {
            Thread.currentThread().interrupt()
            println("Thread interrupted")
        }
        println(" complete.")
    }

    public fun visaPayment(card: Card, amountPence: Int) {
        if (card.cvv.length != 3) {
            throw InvalidCardException(
                "Visa cvv should be 3 digits long"
            )
        }
        takePayment(card.cardType, card.number, amountPence)
    }

    // TODO: define a `clamexPayment()` function similar to the above
}
