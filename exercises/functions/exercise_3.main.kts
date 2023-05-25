@file:Import("utilities.main.kts")

/* DEFAULT PARAMETER VALUES
 * ------------------------
 *
 * 1. Set default values for some of the parameters in `printOccurrences`.
 *
 * 2. Update the function calls below to use the default values.
 *    Aim to reduce the number of arguments passed to each function call as far as possible.
 */

/* <<< TODO: ADD DEFAULT VALUES TO THIS FUNCTION >>> */
fun printOccurrences(word: String, ignoreCase: Boolean, text: Array<String>) {
   var count: Int = 0
   text.forEach { if (word.equals(it, ignoreCase)) count++ }
   println("In Flatland, '${word}' occurs $count time(s).")
}

/* <<< TODO: EDIT THESE FUNCTION CALLS >>> */
printOccurrences("triangle", true, flatland)
printOccurrences(ignoreCase = true, word = "hexagon", text = flatland)
printOccurrences(text = flatland, word = "Triangles", ignoreCase = false)
printOccurrences("square", text = flatland, ignoreCase = true)
