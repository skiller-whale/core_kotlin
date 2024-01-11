fun main() {
    val sealionDion     = mutableListOf<Account>()
    val dolphinLundgren = mutableListOf<Account>()
    sealionDion.add(Current(23984753, 397646, 4893407, 1098234823048723L, 3481))
    sealionDion.add(Savings(23984754, 397646, 3619183L, 1.08))
    dolphinLundgren.add(Current(73489597, 209384, 2093818, 2390847502938751L, 2397))
    dolphinLundgren.add(Savings(73489598, 209384, 4187144, 1.11))

    println("OrcaBank: Giving Your Money Porpoise")
    println("************************************\n")

    println("SeaLion Dion")
    println("-----------------")
    printCustomerInfo(sealionDion)
    println("-----------------\n")

    println("Dolphin Lundgren")
    System.out.println("-----------------")
    printCustomerInfo(dolphinLundgren)
    println("-----------------\n")
}
