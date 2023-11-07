@file:Import("utilities.main.kts")

/* ITERATING USING FOR LOOPS
 * -------------------------
 * Run this script to print an excerpt from 'Through the Looking Glass' by Lewis Carroll.
 *
 * This text is stored as a list of Strings in `lookingGlass`.
 * You will write `for`-loops to implement the following functions.
 *
 *      1. Implement `countOnes` to determine many occurrences of the word 'one' are
 *         in `lookingGlass` (i.e., what is the answer to the White Queen's sum?).
 *
 *      2. Implement `findContainers` to determine which strings in `lookingGlass` contain
 *         a substring from `substrings`.
 *
 *  HINT: You can use `str.contains(other)` to check whether `other` is a substring of `str`.
 */

fun countOnes(text: List<String>): Int {

    // 1. Your code goes here
    return 0

}

val substrings = listOf("ion", "gin", "lice", "vision", "thin")

fun findContainers(words: List<String>, substrings: List<String>): Array<String> {
    var containers: Array<String> = arrayOf()

    // 2. Your code goes here

    return containers
}

/* <<< DO NOT EDIT THIS CODE >>> */
println("${text.readText()}")
println("The answer to the White Queen's sum is: ${countOnes(lookingGlass)}\n")
print("The substrings are: $substrings")
print("\nThey are contained in: ")
findContainers(lookingGlass, substrings).distinct().forEach { print ("'${it}' ")}
println("")
