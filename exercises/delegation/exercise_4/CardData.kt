// <<< DO NOT EDIT THIS CODE >> //
package card.carddata

import java.time.LocalDate

data class CardData(
    public val cardHolderName: String,
    public val cardNumber: String,
    public val cvvNumber: String,
    public val cardExpiration: LocalDate,
)
