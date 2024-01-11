/* Exercise 2: Subclasses and Constructors
 * ---------------------------------------
 *
 * Add primary constructors to each of the classes below, and use them to
 * initialise or declare the properties.
 *
 * Make sure that each subclass delegates to its superclass.
 */

open class Account {
    val accountNumber: Int = 0
    val sortCode: Int      = 0
    var balancePence: Long = 0L
}

class Current : Account() {
    var debitCardNumber: Long = 0L
    val pin: Int              = 0
}

class Savings : Account() {
    var interestRate: Double = 0.0
}
