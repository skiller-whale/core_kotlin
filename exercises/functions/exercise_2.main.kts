@file:Import("utilities.main.kts")

/* POSITIONAL AND KEYWORD ARGUMENTS
 * --------------------------------
 *
 * 1. This code attempts to count the number of occurrences of various shape names
 *    in an excerpt from 'Flatland', a novella by E. A. Abbott.
 *
 *    However, if you run this script, you should see various type errors.
 *
 *    If you aren't sure why these type errors happen, ask the coach for an explanation.
 *
 * 2. Without rearranging any arguments, add as few named arguments as possible to
 *    the function calls below so that they succeed.
 */

/* <<< DO NOT EDIT THIS CODE >>> */
fun printOccurrences(word: String, ignoreCase: Boolean, text: Array<String>) {
   var count: Int = 0
   text.forEach { if (word.equals(it, ignoreCase)) count++ }
   println("In Flatland, '${word}' occurs $count time(s).")
}

/* <<< TODO: EDIT THESE FUNCTION CALLS >>> */
printOccurrences("triangle", true, flatland)
printOccurrences(true, "hexagon", flatland)
printOccurrences(flatland, "Triangles", false)
printOccurrences("square", flatland, true)
