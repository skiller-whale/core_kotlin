// <<< DO NOT EDIT THIS CODE >> //
package money.account

import money.currency.*

/* This package defines an `Account<T>` class whose type parameter represents
 * the currency it uses. For example, a US banking account would have the type
 * `Account<USD>`.
 *
 * The `withdraw()` and `deposit()` methods have been designed to produce
 * and consume a `T`.
 */

class Account<T: Money>(val balance: T) {

    // A function to withdraw some money
    fun withdraw(input: Long): T {
        if (input <= balance.amount) {
            balance.amount -= input
        }
        return balance
    }

    // A function to deposit some money
    fun deposit(input: T) {
        balance.amount += input.amount
    }
}
