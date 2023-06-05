@file:Import("utilities.main.kts")

/* GETTING LIST INDICES
 * --------------------
 *
 * Update the definitions of the variables below.
 *
 * In each case, define the value described by the comment above the variable.
 *
 * The data for this exercise is stored in the variable `girlNames: List<String>`.
 */

// The popularity of the name 'Glenda'
val popularityOfGlenda = 0

// The next most popular name after 'Hilary'
val nameAfterHilary = ""

// The popularity of the first name shorter than four characters
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

assert(popularityOfGlenda == exercise3[0]) {"`popularityOfGlenda` is not implemented correctly\n$hint"}
assert(nameAfterHilary == exercise3[1]) {"`nameAfterHilary` is not implemented correctly\n$hint"}
assert(firstNameShorterFour == exercise3[2]) {"`firstNameShorterFour` is not implemented correctly\n$hint"}
