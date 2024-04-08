// <<< DO NOT EDIT THIS CODE >> //
// This code defines a type and some `enum` classes for French playing cards
package pack.french

typealias FrenchCard = Pair<FrenchRank, FrenchSuit>

enum class FrenchSuit {
    CLUBS, DIAMONDS, HEARTS, SPADES
}

enum class FrenchRank {
    TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, KNAVE, QUEEN, KING, ACE
}

fun buildFrenchPack(): MutableList<FrenchCard> {
    return mutableListOf<FrenchCard>().apply {
        FrenchSuit.values().forEach { suit ->
            FrenchRank.values().forEach { rank ->
                this += Pair(rank, suit)
            }
        }
    }
}
