// <<< YOU DO NOT NEED TO READ OR EDIT THE CODE IN THIS FILE >> //
package account

class CurrentAccount(private var balancePence: Long) : Account {
    override fun deposit(amountPence: Long) { balancePence += amountPence }

    override fun withdraw(amountPence: Long): Boolean {
        if (amountPence <= balancePence) {
            balancePence -= amountPence
            return true
        }
        return false
    }

    override fun transferTo(to: Depositable, amountPence: Long) {
        if (withdraw(amountPence)) { to.deposit(amountPence) }
    }

    override fun transferFrom(from: Withdrawable, amountPence: Long) {
        if (from.withdraw(amountPence)) { deposit(amountPence) }
    }

    override fun showBalance(): String = "%,d".format(balancePence / 100)
}

data class DebitCardData(
    override val cardHolderName: String,
    override val cardNumber: String,
    override val cvvNumber: String
) : CardData

fun main() {
    val account1 = CurrentAccount(10000000)
    val account2 = CurrentAccount(9000000)

    val cardData1 = DebitCardData("Sealion Dion", "1290837401298347", "431")
    val cardData2 = DebitCardData("Tuna Turner", "0123456789101112", "9922")

    val sealion: Card = DebitCard(cardData1, account1)
    val tuna:    Card = DebitCard(cardData2, account2)

    println("\nOrcaBank: Giving Your Money Porpoise")
    println("------------------------------------")
    println("${sealion.cardHolderName} -- Balance: £${sealion.showBalance()}")
    println("${tuna.cardHolderName}  -- Balance: £${tuna.showBalance()}")
    println("\nTransferring £100 from ${sealion.cardHolderName} to ${tuna.cardHolderName}")
    sealion.transferTo(tuna.getAccount(), 10000)
    println("\n${sealion.cardHolderName} -- Balance: £${sealion.showBalance()}")
    println("${tuna.cardHolderName}  -- Balance: £${tuna.showBalance()}")
}
