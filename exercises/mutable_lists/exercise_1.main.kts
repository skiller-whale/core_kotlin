@file:Import("utilities.main.kts")

/* ADDING TO MUTABLE LISTS
 * -----------------------
 *
 *  1. Add the string "The Sirens of Titan" to the second index position in the Science-Fiction sub-list.
 *
 *  2. Add a new textbook to the end of the Computer Science sub-list (e.g., "An Introduction to Sea#").
 *
 *  3. Add the collection fantasyBooks to bookStore so that it follows the Science-Fiction sub-list.
 *
 *  4. Run this code and check the slide instructions to make sure you have the correct output.
 */

val bookStore: MutableList<MutableList<String>> = mutableListOf(
    mutableListOf("Science-Fiction", "2001: A Plaice Codyssey", "Children of Cod", "The Fishpossessed"),
    mutableListOf("Nonfiction", "Waiting for Cod-ot", "Freakonomics", "The Guns of August"),
    mutableListOf("Spy", "Tinker, Tailor, Soldier, Spy", "The Miernik Dossier", "The Company"),
    mutableListOf("Computer Science", "Algae-rithms", "Sea++ Programming", "The Joy of Kotlin"),
)

val fantasyBooks = mutableListOf("Fantasy", "A Clash of Fins", "A Wizard of Earthsea", "Dune")

/* <<< TODO: YOUR CODE HERE >>> */


/* <<< DO NOT EDIT THIS CODE >>> */
println("\nThe bookstore stock includes:")
bookStore.forEach { sublist -> printStock(sublist) }
