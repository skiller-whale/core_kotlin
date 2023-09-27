@file:Import("utilities.main.kts")

/* REMOVING ELEMENTS FROM MUTABLE LISTS
 * ------------------------------------
 *
 * 1. Remove "Tinker, Sailor, Soldier, Spy" from its list and assign it to the variable `favouriteSpyNovel`.
 *
 * 2. Update the function `removeGenre` so that it removes every list from `bookStore` that has the specified genre.
 *
 */

val bookStore: MutableList<MutableList<String>> = mutableListOf(
    mutableListOf("Science-Fiction", "2001: A Plaice Codyssey", "Children of Cod", "The Fishpossessed"),
    mutableListOf("Fantasy", "A Clash of Fins", "A Wizard of Earthsea", "Dune"),
    mutableListOf("Nonfiction", "Waiting for Cod-ot", "Freakonomics", "The Guns of August"),
    mutableListOf("Spy", "Tinker, Sailor, Soldier, Spy", "The Miernik Dossier", "The Company"),
    mutableListOf("Computer Science", "Algae-rithms", "Sea++ Programming", "The Joy of Kotlin"),
)

/* <<< TODO: YOUR CODE HERE >>> */
val favouriteSpyNovel = ""

fun removeGenre(xs: MutableList<MutableList<String>>, genre: String) = xs

/* <<< DO NOT EDIT THIS CODE >>> */
val searchGenre = "Nonfiction"
println("\nMy favourite spy novel is $favouriteSpyNovel.")
println("\nRemoving $searchGenre books...")
removeGenre(bookStore, searchGenre)
bookStore.forEach { sublist -> printStock(sublist) }
