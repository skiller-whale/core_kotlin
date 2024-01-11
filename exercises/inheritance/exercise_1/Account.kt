/* Exercise 1: Defining Subclasses
 * -------------------------------
 *
 * The following code defines two kinds of bank account that a client might use.
 *
 *      Savings: accrues an amount of interest based on an interest rate
 *
 *      Current: for everyday use, has an associated debit card number and pin
 *
 * Define an 'Account' superclass from which Savings and Current will inherit.
 *
 * The superclass should eliminate any duplicated code.
 */

class Current {
    val accountNumber: Int    = 0
    val sortCode: Int         = 0
    var balancePence: Long    = 0L
    var debitCardNumber: Long = 0L
    val pin: Int              = 0
}

class Savings {
    val accountNumber: Int   = 0
    val sortCode: Int        = 0
    var interestRate: Double = 0.0
    var balancePence: Long   = 0L
}
