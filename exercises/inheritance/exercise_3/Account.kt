/* Exercise 3: Overriding Functions
 * --------------------------------
 *
 * The `Current` and `Savings` classes have been updated to contain some functions.
 * However, the `Account` superclass does not implement any functions for its
 * subclasses, so there is some code duplication in this module.
 *
 *  1. Refactor the code so that the `deposit()` and `withdraw()` methods are
 *     not duplicated between `Current` and `Savings`.
 *
 *  2. Define a `transfer()` method in `Account` that has the common functionality
 *     of the existing `transfer()` methods. Update the subclasses accordingly.
 *
 *     Hint: In `Savings` you can use `super` to access the superclass function.
 */

open class Account (
    val accountNumber: Int = 0,
    val sortCode: Int      = 0,
    var balancePence: Long = 0L,
)

class Current (
    accountNumber: Int        = 0,
    sortCode: Int             = 0,
    balancePence: Long        = 0L,
    var debitCardNumber: Long = 0,
    val pin: Int              = 0,
) : Account(accountNumber, sortCode, balancePence) {

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

    // Transfer to another Current account
    fun transfer(transferee: Current, amountPence: Int) {
        if (withdraw(amountPence)) {
            transferee.deposit(amountPence)
        }
    }

    // Transfer to a Savings account
    fun transfer(transferee: Savings, amountPence: Int) {
        if (withdraw(amountPence)) {
            transferee.deposit(amountPence)
        }
    }
}

class Savings (
    accountNumber: Int       = 0,
    sortCode: Int            = 0,
    balancePence: Long       = 0L,
    var interestRate: Double = 0.0,
) : Account(accountNumber, sortCode, balancePence) {

    fun getInterest(): Double {
        return kotlin.math.ceil((balancePence * interestRate) - balancePence)
    }

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

    // Savings account can transfer only to accounts with the same sort code
    // If the first condition is `false` the second won't be evaluated
    fun transfer(transferee: Account, amountPence: Int) {
        if (sortCode == transferee.sortCode && withdraw(amountPence)) {
            transferee.deposit(amountPence)
        }
    }
}
