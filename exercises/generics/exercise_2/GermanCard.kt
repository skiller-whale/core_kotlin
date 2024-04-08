// <<< DO NOT EDIT THIS CODE >> //
// This code defines a type and some `enum` classes for German playing cards
package pack.german

typealias GermanCard = Pair<GermanRank, GermanSuit>

enum class GermanSuit {
    ACORNS, LEAVES, BELLS, HEARTS
}

// A typical German deck has 32 cards
enum class GermanRank {
    SEVEN, EIGHT, NINE, TEN, UNTER, OBER, KING, ACE
}

fun buildGermanPack(): MutableList<GermanCard> {
    return mutableListOf<GermanCard>().apply {
        GermanSuit.values().forEach { suit ->
            GermanRank.values().forEach { rank ->
                this += Pair(rank, suit)
            }
        }
    }
}
