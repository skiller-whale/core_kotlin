@file:Import("utilities.main.kts")
import kotlin.random.Random

/* VARIADIC FUNCTIONS
 * ------------------
 *
 * The Card type represents playing cards in a deck.
 *
 * A Card is a pair of enum constants from Rank and Suit, e.g., (KING, DIAMONDS).
 *
 * The `pickWinner` function takes two cards and determines which is the winner.
 *
 *      1. A card 'wins' over another if it has a greater Rank.
 *         Precedence is determined by enum order, i.e., TWO < THREE < ... < ACE.
 *         For example, (QUEEN, SPADES) > (FOUR, CLUBS) so (QUEEN, SPADES) is the winner.
 *
 *      2. If two cards have the same rank, the tie break is resolved by comparing Suit.
 *         Precedence is determined by enum order, i.e., CLUBS < DIAMONDS < HEARTS < SPADES.
 *         For example, (EIGHT, DIAMONDS) > (EIGHT, CLUBS) so (EIGHT, DIAMONDS) is the winner.
 *
 * Update `pickWinner` so that it can select a winning card for n >= 1 arguments. The function should
 * have only one parameter, and you can use `require(array.size != 0)` in the function to ensure
 * that a winning card is only chosen among n >= 1 cards.
 *
 *  HINT: you can use `sortCards(array)` to sort the Cards in an array by ascending order.
 */

typealias Card = Pair<Rank,Suit>

enum class Suit {
    CLUBS, DIAMONDS, HEARTS, SPADES
}

enum class Rank {
    TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, KNAVE, QUEEN, KING, ACE
}

/* <<< TODO: UPDATE THE PICKWINNER FUNCTION >>> */
fun pickWinner(card1: Card, card2: Card): Card = when {
    (card1.first > card2.first) -> card1
    (card1.first < card2.first) -> card2
    (card1.second > card2.second) -> card1
    else -> card2
}

/* <<< DO NOT EDIT THIS CODE >>> */
fun buildDeck(): MutableList<Card> {
    var deck: MutableList<Card> = mutableListOf()
    for (suit in Suit.values()) {
        for (rank in Rank.values()) {
            deck += Pair(rank, suit)
        }
    }
    return deck
}

fun drawCard(deck: MutableList<Card>): Card {
    val random = Random.nextInt(deck.size)
    return deck.removeAt(random)
}

fun dealCards(n: Int, deck: MutableList<Card>): Array<Card> {
    require(n <= deck.size)
    val dealtCards = Array(n) { drawCard(deck) }
    return dealtCards
}

fun printGame(dealtCards: Array<Card>) {
    dealtCards.forEach { card -> println("$card was drawn") }
    println("${pickWinner(*dealtCards)} wins!")
}

val cardDeck = buildDeck()
val dealtCards = dealCards(8, cardDeck)
printGame(dealtCards)
