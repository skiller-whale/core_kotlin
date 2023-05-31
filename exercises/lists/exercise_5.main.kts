@file:Import("utilities.main.kts")

/* TAKING AND DROPPING LISTS: PART 1
 * ---------------------------------
 *
 * Update the definitions of the variables below.
 *
 * In each case, define the value described by the print statement that uses the variable.
 */

val firstSequenceShorterFour = ""

val lengthFirstSequenceShorterEight = ""

println("""
    The first consecutive sequence of common words shorter than four characters is
     ${firstSequenceShorterFour}


    The length of the first consecutive sequence of common words shorter than eight characters is
     ${lengthFirstSequenceShorterEight}
    """.trimFormat()
)

/* <<< DO NOT EDIT THIS CODE >>> */
assert(firstSequenceShorterFour == exercise5[0]) {"`firstSequenceShorterFour` is not implemented correctly"}
assert(lengthFirstSequenceShorterEight == exercise5[1]) {"`lengthFirstSequenceShorterEight` is not implemented correctly"}

/* TAKING AND DROPPING LISTS: PART 2
 * ---------------------------------
 *
 * Implement the 'splitAt' function. This takes an integer n, and a list, and
 * should split the list at the nth index. For example:
 *
 *      splitAt(3, listOf(1, 2, 3, 4, 5, 6, 7))
 *
 *      = [[1, 2, 3, 4], [5, 6, 7]]
 *
 * The function should return a list containing two lists.
 */

fun <T> splitAt(n: Int, lst: List<T>): List<List<T>> {
    // TODO: edit this line only
    return listOf()
}


/* <<< DO NOT EDIT THIS CODE >>> */
println(lineSeparator)
println("numbers = $numbers\n")
println("The function call splitAt(3, numbers) yields: ${splitAt(3, numbers)}\n")
assert(splitAt(3, numbers) == exercise5[2])
{"splitAt is not implemented correctly."}
