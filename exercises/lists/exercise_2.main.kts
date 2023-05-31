@file:Import("utilities.main.kts")

/* LIST INDEXING
 * -------------
 *
 * Update the definitions of the variables below.
 *
 * In each case, define the value described by the print statement that uses the variable.
 */

val totalNumberNames = 0

val mostPopularName = ""

val fourthLeastPopularName = ""

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

assert(totalNumberNames == exercise2[0]) {"`totalNumberNames` is not implemented correctly"}
assert(mostPopularName == exercise2[1]) {"`mostPopularName` is not implemented correctly"}
assert(fourthLeastPopularName == exercise2[2]) {"`fourthLeastPopularName` is not implemented correctly"}
assert(mostPopularLongerTen == exercise2[3]) {"`mostPopularLongerTen` is not implemented correctly"}
