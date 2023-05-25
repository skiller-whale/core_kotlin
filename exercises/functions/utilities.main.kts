import java.io.File

val PATH = "${__FILE__.getAbsoluteFile().parent}"

// Exercises 2 and 3 data
val text = File("${PATH}/../data/flatland.txt")
val flatland: Array<String> = text.readText().split("[.,;!?()'\"\n -]+".toRegex()).toTypedArray()

// Exercise 4 comparison function for cards
fun <T : Enum<T>, K : Enum<K>> sortCards(cards: Array<out Pair<T, K>>) = cards.sortedWith(compareBy({ it.first }, { it.second }))
