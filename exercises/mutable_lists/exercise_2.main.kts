@file:Import("utilities.main.kts")

/* REMOVING ELEMENTS FROM MUTABLE LISTS
 * ------------------------------------
 *
 * 1. Remove "Tinker, Tailor, Soldier, Spy" from its list and assign it to the variable `favouriteSpyNovel`.
 *
 * 2. Update the function `removeGenre` so that it removes the list from `bookStore` for a given genre.
 *
 */

val bookStore: MutableList<MutableList<String>> = mutableListOf(
    mutableListOf("Science-Fiction", "2001: A Plaice Codyssey", "Children of Cod", "The Fishpossessed"),
    mutableListOf("Fantasy", "A Clash of Fins", "A Wizard of Earthsea", "Dune"),
    mutableListOf("Nonfiction", "Waiting for Cod-ot", "Freakonomics", "The Guns of August"),
    mutableListOf("Spy", "Tinker, Tailor, Soldier, Spy", "The Miernik Dossier", "The Company"),
    mutableListOf("Computer Science", "Algae-rithms", "Sea++ Programming", "The Joy of Kotlin"),
)

/* <<< TODO: YOUR CODE HERE >>> */
val favouriteSpyNovel = ""

fun removeGenre(xs: MutableList<MutableList<String>>, genre: String) = xs

val searchGenre = "Nonfiction"

/* <<< DO NOT EDIT THIS CODE >>> */
println("\nMy facourite spy novel is $favouriteSpyNovel.")
println("\nRemoving $searchGenre books...")
removeGenre(bookStore, searchGenre)
bookStore.forEach { sublist -> printStock(sublist) }
