package card.creditcard

import card.account.*
import card.carddata.*
import card.validator.*

import java.time.LocalDate

/* Exercise 4: Multiple Delegation
 * -------------------------------
 *
 * 1. Define the `CreditCard` class.
 * This should implement the `Card` interface and do so using only delegation.
 *
 * 2. Extra: delegate to the `CardValidator` to provide a validation function
 * that is run whenever a `CreditCard` is initialised.
 */

// TODO: implement the `Card` interface
public class CreditCard() : Card

public interface Card {
    public fun getCardHolderName(): String
    public fun getCardNumber(): String
    public fun getCvvNumber(): String
    public fun getCardExpiration(): LocalDate
    public fun showBalance(): String
    public fun getAccount(): Account
    public fun transfer(to: Account, amountPence: Long)
}
