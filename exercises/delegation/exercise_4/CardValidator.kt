// <<< DO NOT EDIT THIS CODE >> //
package card.validator

import java.time.LocalDate

public class CardValidator(
    private val expectedCvvLength: Int = 3,
    private val expectedCardLength: Int = 16,
) {
    public fun validateCard(cvvNumber: String, cardNumber: String, cardExpiration: LocalDate) {
        validateCvv(cvvNumber)
        validateCardNumber(cardNumber)
        validateExpiration(cardExpiration)
    }

    private fun validateCvv(cvvNumber: String) {
        if (cvvNumber.length != expectedCvvLength) {
            throw InvalidCardException(
                "cvv should be ${expectedCvvLength} digits long"
            )
        }
    }

    private fun validateCardNumber(cardNumber: String) {
        if (cardNumber.length != expectedCardLength) {
            throw InvalidCardException(
                "card number should be ${expectedCardLength} digits long"
            )
        }
    }

    private fun validateExpiration(cardExpiration: LocalDate) {
        if (cardExpiration.isBefore(LocalDate.now())) {
            throw InvalidCardException("Card has expired")
        }
    }
}

public class InvalidCardException(message: String) : Exception(message)
