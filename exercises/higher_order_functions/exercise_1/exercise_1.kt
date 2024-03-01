/* Exercise 1: Higher-Order Functions
 * ----------------------------------
 *
 * Define the `andThen()` function.
 */

// TODO: define the `andThen()` function

fun square(x: Int): Int = x*x

fun isEven(x: Int): Boolean = x % 2 == 0

fun main() {
    val squareEven = andThen(::square, ::isEven)
    squareEven(28736).also(::println)
    squareEven(8).also(::println)
}
