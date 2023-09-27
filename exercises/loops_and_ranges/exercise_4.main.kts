@file:Import("utilities.main.kts")

/* RANGES AND ITERATION
 * --------------------
 * Run this script to print an excerpt from Euripides' play 'The Bacchae'.
 * Each string is currently scrambled; random letters occur at every odd index.
 *
 * Use a range expression to define the `buildCleanString` function.
 * This should take a string and remove letters occurring at odd indices.
 *
 *  HINT: You can use str.slice(range) to return a new string containing characters
 *  in 'str' which occur at the indices specified by 'range'.
 */

fun buildCleanString(string: String): String {

    // TODO: edit this line only
    return string
}

/* <<< DO NOT EDIT THIS CODE >>> */
println("DIONYSUS:")
formattedBacchae.forEach { string -> println(buildCleanString(string)) }
