import pack.card.*
import pack.french.*
import pack.german.*

fun main() {
    val frenchPack = Pack<FrenchCard>(::buildFrenchPack)
    val germanPack = Pack<GermanCard>(::buildGermanPack)

    println("After shuffling, the top four French cards are:")
    frenchPack
      .apply { shuffle() }
      .also  { it.printCards(4) }

    println("\nAfter shuffling, the top four German cards are:")
    germanPack
      .apply { shuffle() }
      .also  { it.printCards(4) }
}
