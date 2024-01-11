fun main() {
    val sealionCurrent = Current(23984753, 397646, 4893407L, 1098234823048723L, 3481)
    val sealionSavings = Savings(23984754, 397646, 3619183L, 1.08)

    println("OrcaBank: Giving Your Money Porpoise")
    println("************************************")

    println("\nCurrent Account: SeaLion Dion")
    println("-------------------------------")
    println("Balance:\t£${sealionCurrent.balancePence / 100.0}")
    println("Account Number:\t${sealionCurrent.accountNumber}")
    println("Sort Code:\t${sealionCurrent.sortCode}")
    println("Debit Card:\t${sealionCurrent.debitCardNumber}")
    println("PIN:\t\t${sealionCurrent.pin}\n")

    println("\nSavings Account: SeaLion Dion")
    println("-------------------------------")
    println("Balance:\t£${sealionSavings.balancePence / 100.0}")
    println("Account Number:\t${sealionSavings.accountNumber}")
    println("Sort Code:\t${sealionSavings.sortCode}")
    println("Interest:\t£${sealionSavings.getInterest()}\n")
}
