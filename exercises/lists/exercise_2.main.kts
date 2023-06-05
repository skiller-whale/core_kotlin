@file:Import("utilities.main.kts")

/* LIST INDEXING
 * -------------
 *
 * Update the definitions of the variables below.
 *
 * In each case, define the value described by the comment above the variable.
 *
 * The data for this exercise is stored in the variable `girlNames: List<String>`.
 */

// Total number of girls' names
val totalNumberNames = 0

// The most popular girl's name
val mostPopularName = ""

// The fourth least popular girl's name
val fourthLeastPopularName = ""

// The most popular girl's name longer than ten characters
val mostPopularLongerTen = ""

/* <<< DO NOT EDIT THIS CODE >>> */
println("""
    Total number of girls' names:
     ${totalNumberNames}


    The most popular girl's name was
     '${mostPopularName}'


    The fourth least popular girl's name was
     '${fourthLeastPopularName}'


    The most popular girl's name longer than ten characters was
     '${mostPopularLongerTen}'
    """.trimFormat()
)

assert(totalNumberNames == exercise2[0]) {"`totalNumberNames` is not implemented correctly\n$hint"}
assert(mostPopularName == exercise2[1]) {"`mostPopularName` is not implemented correctly\n$hint"}
assert(fourthLeastPopularName == exercise2[2]) {"`fourthLeastPopularName` is not implemented correctly\n$hint"}
assert(mostPopularLongerTen == exercise2[3]) {"`mostPopularLongerTen` is not implemented correctly\n$hint"}
