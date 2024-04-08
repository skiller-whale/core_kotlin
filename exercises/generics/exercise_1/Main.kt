package pack.functions

import pack.card.*
import kotlin.random.Random

/* Generic Functions
 * -----------------
 *
 * Update the functions `shuffle()` and `drawCard()` so that they are generic.
 */

fun main() {
    val cards: MutableList<PlayingCard> = buildDeck()

    println("The top four cards are:")
    printCards(cards, 4)

    println("\nAfter shuffling, the top four cards are:")
    shuffle(cards).let { printCards(it, 4) }

    println("\nThe random card drawn is:")
    drawCard(cards).let(::println)
}

// TODO: update this function to make it generic
fun shuffle(pack: MutableList<PlayingCard>): MutableList<PLayingCard> {
    return pack.apply { shuffle() }
}

// TODO: update this function to make it generic
fun drawCard(pack: MutableList<PlayingCard>): PlayingCard {
    val random = Random.nextInt(pack.size)
    return pack.removeAt(random)
}

// Build a deck of cards
fun buildDeck(): MutableList<PlayingCard> {
    return mutableListOf<PlayingCard>().apply {
        Suit.values().forEach { suit ->
            Rank.values().forEach { rank ->
                this += Pair(rank, suit)
            }
        }
    }
}

// Print some cards
fun printCards(pack: List<PlayingCard>, n: Int) {
    require(n <= pack.size) { "Cannot print more cards" }
    pack.slice(0 until n).also(::println)
}
