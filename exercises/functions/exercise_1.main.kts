/* FUNCTION PARAMETERS AND RETURNING VALUES
 * ----------------------------------------
 *
 *  1. Define a function 'replicate'. This should take a String s, an integer n, and
 *     produce an array containing n occurrences of s.
 *
 *     HINT 1: for any type T, an array of Ts has type Array<T>.
 *
 *     HINT 2: use `arrayOf()` to create an empty array, which can be mutated using `=`.
 *
 *  2. Define a function 'printStars'. This should take an integer n and produce a grid
 *     that displays stars left-aligned in a triangle. For example, printStars(4):
 *
 *      *
 *      **
 *      ***
 *      ****
 *
 *      HINT: use the 'replicate' function.
 */

/* <<< TODO: DEFINE REPLICATE AND PRINTSTARS >>> */

/* <<< DO NOT EDIT THIS CODE >>> */
val testArray = Array(4) { "*" }
assert(testArray contentEquals replicate("*",4)) {"replicate(s, n) is not replicating s n times"}
printStars(8)
