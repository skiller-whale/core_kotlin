import java.io.File

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
 *  HINT: You can use `str.contains(other, ignoreCase = true)` to check whether
 *  `other` is a substring of `str`, ignoring character case.
 */

fun countOnes(text: List<String>): Unit {
    print("The answer to the White Queen's sum is: ")

    // 1. Your code goes here

}

fun findContainers(text: List<String>): Unit {
    val substrings = arrayOf("Ion", "Gin", "Lice", "Vision", "Thin")
    println("\nThe substrings are contained in:")
    var containers: Array<String> = arrayOf()

    // 2. Your code goes here

    containers.distinct().forEach { print("'${it}' ") }
}

/* <<< DO NOT EDIT THIS CODE >>> */

val text = File("${__FILE__.getAbsoluteFile().parent}/../data/looking_glass.txt")
println("${text.readText()}\n")
val lookingGlass = text.readText().split("[.,!?\\s]+".toRegex())
countOnes(lookingGlass)
findContainers(lookingGlass)
