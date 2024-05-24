// <<< DO NOT EDIT THIS CODE >> //
import card.creditcard.*
import card.account.*
import card.carddata.*
import card.validator.*

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.LocalDate

fun main() {
    val clamexValidator = CardValidator(expectedCvvLength = 4)
    val visaValidator   = CardValidator()
    val account1        = Account(10000000)
    val account2        = Account(9000000)
    val formatter       = DateTimeFormatter.BASIC_ISO_DATE

    val cardData1 = CardData(
        "Sealion Dion",
        "1290837401298347",
        "431",
        LocalDate.parse("30200911", formatter),
    )

    val cardData2 = CardData(
        "Tuna Turner",
        "0123456789101112",
        "9922",
        LocalDate.parse("30220301", formatter),
    )

    val sealion = CreditCard(
        cardData  = cardData1,
        account   = account1,
        // TODO: uncomment if you have defined the validator
        // validator = visaValidator
    )

    val tuna = CreditCard(
        cardData  = cardData2,
        account   = account2,
        // TODO: uncomment if you have defined the validator
        // validator = clamexValidator
    )

    println("OrcaBank: Giving Your Money Porpoise")
    println("------------------------------------")
    println("${sealion.getCardHolderName()} -- Balance: £${sealion.showBalance()}")
    println("${tuna.getCardHolderName()}  -- Balance: £${tuna.showBalance()}")
    println("\nTransferring £100 from ${sealion.getCardHolderName()} to ${tuna.getCardHolderName()}")
    sealion.transfer(tuna.getAccount(), 10000L)
    println("${sealion.getCardHolderName()} -- Balance: £${sealion.showBalance()}")
    println("${tuna.getCardHolderName()}  -- Balance: £${tuna.showBalance()}")
}
