@file:Import("utilities.main.kts")

/* GETTING LIST INDICES
 * --------------------
 *
 * Update the definitions of the variables below.
 *
 * In each case, define the value described by the text in the print statement that uses the variable.
 */

val popularityOfGlenda = 0

val nameAfterHilary = ""

val firstNameShorterFour = 0

println("""
    The popularity of the name 'Glenda' was
     ${popularityOfGlenda}th


    After 'Hilary', the next most popular name was
     '${nameAfterHilary}'


    The popularity of the first name shorter than four characters was
     ${firstNameShorterFour}th
    """.trimFormat()
)

assert(popularityOfGlenda == exercise3[0]) {"`popularityOfGlenda` is not implemented correctly"}
assert(nameAfterHilary == exercise3[1]) {"`nameAfterHilary` is not implemented correctly"}
assert(firstNameShorterFour == exercise3[2]) {"`firstNameShorterFour` is not implemented correctly"}
