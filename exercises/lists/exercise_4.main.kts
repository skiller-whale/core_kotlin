@file:Import("utilities.main.kts")

/* SLICING LISTS: PART 1
 * ---------------------
 *
 * Update the definitions of the variables below.
 *
 * In each case, define the value described by the comment above the variable.
 *
 * The data for this exercise is stored in the variable `commonWords: List<String>`.
 */

// The ten most common words
val tenMostCommonWords = ""

// The 120th, 360th, and 600th most common words
val trioOfCommonWords = ""

// The 3 least common words in ascending frequency order
val leastThreeCommonAscending = ""

// The second, third, and fourth letters of the least common word
val lettersOfLeastCommon = ""

println("""
    The ten most common words are:
     ${tenMostCommonWords}


    The 120th, 360th, and 600th most common words are:
     ${trioOfCommonWords}


    The 3 least common words in ascending frequency order are:
     ${leastThreeCommonAscending}


    The second, third, and fourth letters of the least common word are:
     '${lettersOfLeastCommon}'
    """.trimFormat()
)

/* <<< DO NOT EDIT THIS CODE >>> */
assert(tenMostCommonWords == exercise4[0]) {"`tenMostCommonWords` is not implemented correctly\n$hint"}
assert(trioOfCommonWords == exercise4[1]) {"`trioOfCommonWords` is not implemented correctly\n$hint"}
assert(leastThreeCommonAscending == exercise4[2]) {"`leastThreeCommonAscending` is not implemented correctly\n$hint"}
assert(lettersOfLeastCommon == exercise4[3]) {"`lettersOfLeastCommon` is not implemented correctly\n$hint"}

/* SLICING LISTS: PART 2
 * ---------------------
 *
 * Update the line containing 'println(secretCode)' so that it prints the sequence of this
 * string starting with the 11th last letter, moving back to the start of the string in steps of 3.
 */

val secretCode: String = "!ZagFenaZiahcnsimHlatSMF JAdwteobrXaeK trgsksaZbMWm AOeWrvhP'HAunyoVGYx kNvxbhfm"

print("\nThe secret code is: ")
println(secretCode)
