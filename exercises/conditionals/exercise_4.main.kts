import kotlin.random.Random

/* Using `when` for `if`-`else` `if`
 * ---------------------------------
 *
 * The Card type represents playing cards in a deck.
 *
 * A card is a pair of enum constants from Rank and Suit, e.g., (KING, DIAMONDS).
 *
 * The `pickWinner` function should take two cards and determine which is the winner.
 *
 *      1. A card 'wins' over another if it has a greater Rank.
 *         Precedence is determined by enum order, i.e., TWO < THREE < ... < ACE.
 *         For example, (QUEEN, SPADES) > (FOUR, CLUBS) so (QUEEN, SPADES) is the winner.
 *
 *      2. If two cards have the same rank, the tie break is resolved by comparing Suit.
 *         Precedence is determined by enum order, i.e., CLUBS < DIAMONDS < HEARTS < SPADES.
 *         For example, (EIGHT, DIAMONDS) > (EIGHT, CLUBS) so (EIGHT, DIAMONDS) is the winner.
 *
 * Write a `when` expression to implement this function.
 * If card = (SIX, HEARTS), then: card.first == SIX and card.second == HEARTS.
 */

typealias Card = Pair<Rank,Suit>

enum class Suit {
    CLUBS, DIAMONDS, HEARTS, SPADES
}

enum class Rank {
    TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, KNAVE, QUEEN, KING, ACE
}

fun pickWinner(card1: Card, card2: Card): Card = TODO() /* Your code goes here */


// Do not edit this code
fun buildDeck(): ArrayList<Card> {
    var deck: ArrayList<Card> = arrayListOf()
    for (suit in Suit.values()) {
        for (rank in Rank.values()) {
            deck += Pair(rank, suit)
        }
    }
    return deck
}

fun drawCard(deck: ArrayList<Card>): Card {
    val random = Random.nextInt(deck.size)
    return deck.removeAt(random)
}

var cardDeck = buildDeck()
val player1 = drawCard(cardDeck)
val player2 = drawCard(cardDeck)
println("Player 1 drew $player1")
println("Player 2 drew $player2")
println("${pickWinner(player1, player2)} wins!")
