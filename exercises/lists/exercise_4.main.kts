@file:Import("utilities.main.kts")

/* SLICING LISTS: PART 1
 * ---------------------
 *
 * Update the definitions of the variables below.
 *
 * In each case, define the value described by the print statement that uses the variable.
 */

val tenMostCommonWords = ""

val trioOfCommonWords = ""

val leastCommonAscending = ""

val lettersOfLeastCommon = ""

println("""
    The ten most common words are:
     ${tenMostCommonWords}


    The 120th, 360th, and 600th most common words are:
     ${trioOfCommonWords}


    The 3 least common words in ascending frequency order are:
     ${leastCommonAscending}


    The second, third, and fourth letters of the least common word are:
     '${lettersOfLeastCommon}'
    """.trimFormat()
)

/* <<< DO NOT EDIT THIS CODE >>> */
assert(tenMostCommonWords == exercise4[0]) {"`tenMostCommonWords` is not implemented correctly"}
assert(trioOfCommonWords == exercise4[1]) {"`trioOfCommonWords` is not implemented correctly"}
assert(leastCommonAscending == exercise4[2]) {"`leastCommonAscending` is not implemented correctly"}
assert(lettersOfLeastCommon == exercise4[3]) {"`lettersOfLeastCommon` is not implemented correctly"}

/* SLICING LISTS: PART 2
 * ---------------------
 *
 * Update the line containing 'println(secretCode)' so that it prints the sequence of this
 * string starting with the 11th last letter, moving back to the start of the string in steps of 3.
 */

val secretCode: String = "!ZagFenaZiahcnsimHlatSMF JAdwteobrXaeK trgsksaZbMWm AOeWrvhP'HAunyoVGYx kNvxbhfm"

print("\nThe secret code is: ")
println(secretCode)
