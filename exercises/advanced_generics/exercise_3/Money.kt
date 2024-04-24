// <<< DO NOT EDIT THIS CODE >> //
package money.currency

/* This package defines some classes to build monetary values in different
 * currencies. For example, £10 is not the same as $10, so:
 *
 *      £10 ==> GBP(1000)
 *      $10 ==> USD(1000)
 *
 * Note that GBP and USD are built in pennies and cents.
 */

abstract class Money(var amount: Long) {
    abstract val type: String
}

// UK Pound
class GBP(pence: Long = 0L) : Money(pence) {
    override val type = "GBP"
}

// US Dollar
class USD(cents: Long = 0L) : Money(cents) {
    override val type = "USD"
}

// Japanese Yen
class JPY(yen: Long = 0L) : Money(yen) {
    override val type = "JPY"
}
