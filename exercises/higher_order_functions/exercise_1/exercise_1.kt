/* Exercise 1: Higher-Order Functions
 * ----------------------------------
 *
 * PART 1: define the `andThen` function.
 *
 * PART 2: define the `memoizeFun` function.
 *
 * HINT: use a Map<K, V>.
 */

// TODO: define the `andThen` function

// TODO: define the `memoizeFun` function

fun slowSquare(x: Int): Int {
    print("Computing square of $x")
    (0..6).forEach { print("."); Thread.sleep(200) }
    println("complete")
    return x*x
}

fun slowIsEven(x: Int): Boolean {
    print("Computing whether $x is even")
    (0..6).forEach { print("."); Thread.sleep(200) }
    println("complete")
    return x % 2 == 0
}

fun main() {
    val squareEven = andThen(::slowSquare, ::slowIsEven)
    val memoize    = memoizeFun(squareEven)
    memoize(83).also(::println)
    memoize(83).also(::println)
}
