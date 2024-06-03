package account

// <<< DO NOT EDIT ANY OF THESE INTERFACES >>> //

interface Withdrawable {
    fun withdraw(amountPence: Long): Boolean
    fun transferTo(to: Depositable, amountPence: Long)
    fun showBalance(): String
}

interface Depositable {
    fun deposit(amountPence: Long)
    fun transferFrom(from: Withdrawable, amountPence: Long)
}

interface Account : Withdrawable, Depositable

interface CardData {
    val cardHolderName: String
    val cardNumber: String
    val cvvNumber: String
}

interface Card : Withdrawable, CardData {
    fun getAccount(): Account
}

/* Exercise 4: Multiple Delegation
 * -------------------------------
 *
 * For convenience, all of the interfaces you need to know about are written in
 * this file, and you do not need to read the code in Main.kt.
 * DO NOT EDIT ANY OF THE INTERFACES ABOVE.
 *
 * 1. Complete the implementation of the DebitCard class below, writing as
 *    little additional code as possible. Do not change its constructor.
 *
 * 2. Run the `main` function in Main.kt to test your implementation. The code
 *    should compile and run, performing a transfer bewteen two accounts.
 */

public class DebitCard(
    private val cardData: DebitCardData,  // DebitCardData is a class that implements CardData
    private val account: CurrentAccount,  // CurrentAccount is a class that implements Account
): Card
