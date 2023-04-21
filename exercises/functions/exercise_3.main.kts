import java.io.File

/* DEFAULT PARAMETER VALUES
 * ------------------------
 *
 * 1. Define a function called `compareShapes`, which expects the parameters:
 *
 *      * `shapes`, which is an array of shape names
 *      * `ignoreCase` which has the default value of `true`
 *      * `text` which has the default value of `flatland`
 *
 * This function should loop through shapes, and call `printOccurrences` for
 * each one, making use of the default values.
 *
 * Use compareShapes to compare the frequency of occurrences of shape names in Flatland.
 * You will need to use the `shapes` array defined below.
 */

val shapes: Array<String> = arrayOf("triangle", "triangles", "hexagon", "hexagons", "square", "squares")

/* <<< TODO: WRITE A FUNCTION TO COMPARE SHAPES >>> */


/* <<< DO NOT EDIT THIS CODE >>> */
fun printOccurrences(word: String, ignoreCase: Boolean, text: Array<String>) {
   var count: Int = 0
   text.forEach { if (word.equals(it, ignoreCase)) count++ }
   println("In Flatland, '${word}' occurs $count time(s).")
}

val text = File("${__FILE__.getAbsoluteFile().parent}/../data/flatland.txt")

val flatland: Array<String> = text.readText().split("[.,;!?()'\"\n -]+".toRegex()).toTypedArray()
print("\n")
compareShapes(shapes)
