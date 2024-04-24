package money.transfer

import money.account.*
import money.currency.*
import money.utility.*

/* Exercise 3: Type Projections
 * ----------------------------
 *
 * 1. Use type projections to update both functions so that the
 *    transferor can only make withdrawals, and the transferee can
 *    only make deposits.
 *
 * 2. Use type constraints to update the `intlTransfer()` function.
 *    This should allow transfers between different kinds of account:
 *
 *           Account<GBP> ==> Account<USD>
 *
 *    You might want to add a new type parameter to this function and
 *    update the types of some of its arguments.
 */

// TODO: use type projections to update this function
fun <T: Money> transfer(
    transferor: Account<T>,
    transferee: Account<T>,
    input: T
) {
    transferor.withdraw(input.amount)
    transferee.deposit(input)
}

// TODO: use type constraints and type projections to update this function
fun <T: Money> intlTransfer (
    transferor: Account<T>,
    transferee: Account<T>,
    converter:  Converter<T>,
    input: T
) {
    val funds = transferor.withdraw(input.amount)
    val convertedFunds = converter.convert(funds)
    transferee.deposit(convertedFunds)
}
