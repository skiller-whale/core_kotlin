import cards.*

fun main() {
    val card1: Visa = Visa(
        "1290837401298347",
        "3020-09-11",
        "431",
    )

    val card2: Visa = Visa(
        "9802374058453259",
        "2034-10-22",
        "292",
    )

    //<<< TODO: Uncomment this code >>> //

    // val card3: ClamericanExpress = ClamericanExpress(
    //         "2468135746803579",
    //         "3023-12-08",
    //         "1439",
    //     )

    // val card4: ClamericanExpress = ClamericanExpress(
    //         "0123456789101112",
    //         "3022-03-01",
    //         "9922",
    //     )

    println("\n---------------------------------------------------------------------------\n")
    PaymentProcessor(23046, card1).call()
    PaymentProcessor(25000, card2).call()

    //<<< TODO: Uncomment this code >>> //
    // PaymentProcessor(12000, card3).call()
    // PaymentProcessor(19283, card4).call()
    println("---------------------------------------------------------------------------\n")
}
