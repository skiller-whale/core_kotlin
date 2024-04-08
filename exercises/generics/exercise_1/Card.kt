// <<< DO NOT EDIT THIS CODE >> //
// This code defines a type and some `enum` classes for a simple kind of
// playing card consisting of a Suit and a Rank, e.g., Eight of Hearts
package pack.card

typealias PlayingCard = Pair<Rank,Suit>

enum class Suit {
    CLUBS, DIAMONDS, HEARTS, SPADES
}

enum class Rank {
    TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, KNAVE, QUEEN, KING, ACE
}
