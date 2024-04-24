import money.account.*
import money.currency.*
import money.transfer.*
import money.utility.*

fun main() {
    val acc1 = Account<GBP>(GBP(3279480L))
    val acc2 = Account<GBP>(GBP(5032498L))
    val acc3 = Account<USD>(USD(20984357L))

    println("OrcaBank: Giving Your Money Porpoise")
    println("------------------------------------")
    println("Account 1 (GBP): £${acc1.balance.amount / 100}")
    println("Account 2 (GBP): £${acc2.balance.amount / 100}")
    println("Account 3 (USD): $${acc3.balance.amount / 100}\n")

    println("Transferring £700 from Account 1 to Account 2:")
    transfer(acc1, acc2, GBP(70000L))
    println("Account 1 (GBP): £${acc1.balance.amount / 100}")
    println("Account 2 (GBP): £${acc2.balance.amount / 100}\n")

    println("Transferring £800 from Account 1 to Account 3:")
    intlTransfer(acc1, acc3, usdConverter, GBP(80000L))
    println("Account 1 (GBP): £${acc1.balance.amount / 100}")
    println("Account 3 (USD): $${acc3.balance.amount / 100}")

    // // TODO: Uncomment this code and check that the transfer
    // // is blocked by the compiler because it attempts an international
    // // transfer using the regular `transfer()` function
    // transfer(acc1, acc3, GBP(70000L))
}
