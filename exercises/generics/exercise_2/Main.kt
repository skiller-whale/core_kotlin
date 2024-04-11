import pack.card.*
import pack.french.*
import pack.german.*

fun main() {
    val frenchPack = Pack<FrenchCard>(::buildFrenchPack)
    val germanPack = Pack<GermanCard>(::buildGermanPack)

    println("After shuffling, the top four French cards are:")
    frenchPack.shuffle()
    frenchPack.printCards(4)

    println("\nAfter shuffling, the top four German cards are:")
    germanPack.shuffle()
    germanPack.printCards(4)
}
