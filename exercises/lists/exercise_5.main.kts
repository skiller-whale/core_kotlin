@file:Import("utilities.main.kts")

/* TAKING AND DROPPING LISTS
 * -------------------------
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
assert(splitAt(3, numbers) == exercise5)
{"splitAt is not implemented correctly."}
