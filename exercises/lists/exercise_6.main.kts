@file:Import("utilities.main.kts")

/* FILTERING LISTS
 * ---------------
 *
 * Update the definitions of the variables below.
 *
 * In each case, define the value described by the print statement that uses the variable.
 *
 * The data for this exercise is stored in the variable `commonWords: List<String>`.
 */

// The number of common words consisting of eight characters or more
val containingEight = ""

// Common words whose index is a multiple of 90
val indexNinety = ""

// The first ten common words with exactly six characters
val exactlySix = ""

println("""
    The number of common words consisting of eight characters or more is:
     ${containingEight}


    The common words whose index is a multiple of 90 are:
     ${indexNinety}


    The first ten common words with exactly six characters are:
     ${exactlySix}
    """.trimFormat()
)

/* <<< DO NOT EDIT THIS CODE >>> */
assert(containingEight == exercise6[0]) {"`containingEight` is not implemented correctly"}
assert(indexNinety == exercise6[1]) {"`indexNinety` is not implemented correctly"}
assert(exactlySix == exercise6[2]) {"`exactlySix` is not implemented correctly"}
