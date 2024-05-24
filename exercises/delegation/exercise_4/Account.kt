// <<< DO NOT EDIT THIS CODE >> //
package card.account

public class Account(private var balancePence: Long) {
    private fun deposit(amountPence: Long) {
        balancePence += amountPence
    }

    private fun withdraw(amountPence: Long): Boolean {
        if (amountPence <= balancePence) {
            balancePence -= amountPence
            return true
        }
        return false
    }

    public fun transfer(to: Account, amountPence: Long) {
        if (withdraw(amountPence)) { to.deposit(amountPence) }
    }

    public fun showBalance(): String = "%,d".format(balancePence / 100)
}
