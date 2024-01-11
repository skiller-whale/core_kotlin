/* Exercise 3: Polymorphism
 * ------------------------
 *
 * The `Account` superclass and its subclasses are implemented below.
 *
 *  1. The Account class has a `display()` function that prints information
 *     about an account, e.g., the current balance, sort code, etc.
 *
 *     Override this function for the `Current` and `Savings` classes.
 *     The updated function should be similar to the superclass function, while
 *     also printing any fields unique to the subclass.
 *
 *  2. Define a new top-level function called `printCustomerInfo()`.
 *     This should take as input a `List<Account>`, and call `display()`on each
 *     account in sequence.
 */

// TODO: define the `printCustomerInfo()` function

open class Account (
    val accountNumber: Int = 0,
    val sortCode: Int      = 0,
    var balancePence: Long = 0L,
) {
    fun deposit(amountPence: Int) {
        balancePence += amountPence
    }

    fun withdraw(amountPence: Int): Boolean {
        if (amountPence <= balancePence) {
            balancePence -= amountPence
            return true
        }
        return false
    }

    open fun transfer(transferee: Account, amountPence: Int) {
        if (withdraw(amountPence)) {
            transferee.deposit(amountPence)
        }
    }

    fun display() {
        println("${this::class.simpleName} Balance: £${balancePence / 100.0}")
        println("Account Number:\t$accountNumber")
        println("Sort Code:\t$sortCode")
    }
}

class Current (
    accountNumber: Int        = 0,
    sortCode: Int             = 0,
    balancePence: Long        = 0L,
    var debitCardNumber: Long = 0,
    val pin: Int              = 0,
) : Account(accountNumber, sortCode, balancePence)

class Savings (
    accountNumber: Int       = 0,
    sortCode: Int            = 0,
    balancePence: Long       = 0L,
    var interestRate: Double = 0.0,
) : Account(accountNumber, sortCode, balancePence) {

    fun getInterest(): Double {
        return java.lang.Math.ceil((balancePence * interestRate) - balancePence)
    }

    // Savings account can transfer only to accounts with the same sort code
    override fun transfer(transferee: Account, amountPence: Int) {
        if (sortCode == transferee.sortCode) {
            super.transfer(transferee, amountPence)
        }
    }
}
