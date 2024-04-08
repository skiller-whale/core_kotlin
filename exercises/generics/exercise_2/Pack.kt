package pack.card

import pack.french.*
import pack.german.*
import kotlin.random.Random

/* Generic Classes
 * ---------------
 *
 * 1. Update the `Pack` class so that it is generic, to represent packs of
 *    different types of playing cards.
 *
 * 2. Add the existing functions to the class, and update them to
 *    work as member functions with the class properties and parameters
 */

class Pack(
    // TODO: replace `?` with a type variable
    private val build: () -> MutableList<?>,
) {
    // TODO: replace `?` with a type variable
    private val cards: MutableList<?> = build()
}

// TODO: add these functions to the class
fun <T> shuffle(pack: MutableList<T>): MutableList<T> {
    return pack.apply { shuffle() }
}

fun <T> drawCard(pack: MutableList<T>): T {
    val random = Random.nextInt(pack.size)
    return pack.removeAt(random)
}

fun <T> printCards(cards: List<T>, n: Int) {
    require(n <= cards.size) { "Cannot print more cards" }
    cards.slice(0 until n).also(::println)
}
