//<<< DO NOT EDIT THIS CODE >>> //

import api.PaymentService
import cards.*

public class PaymentProcessor (
    private val amountPence: Int,
    private val card: Card,
) {
    @Throws(InvalidCardException::class)
    public fun process() {
        card.validate()
        card.takePayment(amountPence)
        println("£${amountPence / 100} payment taken")
    }

    public fun call() {
        try { process() }
        catch (e: InvalidCardException) {
            println("ERROR PROCESSING PAYMENT: ${e.message}")
        }
    }
}
