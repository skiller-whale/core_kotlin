/* Exercise 2: Higher-Order Functions
 * ----------------------------------
 *
 * Define the `memoizeFun()` function.
 *
 * HINT: use a Map<K, V>.
 */

// TODO: define `memoizeFun()`

fun slowSquare(x: Int): Int {
    (0..3).forEach { print("."); Thread.sleep(400) }
    return x*x
}

fun slowIsEven(x: Int): Boolean {
    (0..3).forEach { print("."); Thread.sleep(400) }
    return x % 2 == 0
}

fun <A, B, C> andThen(func1: (A) -> B, func2: (B) -> C): (A) -> C {
    fun inner(x: A) = func2(func1(x))
    return ::inner
}

fun main() {
    val squareEven = andThen(::slowSquare, ::slowIsEven)
    val memoize    = memoizeFun(squareEven)
    val testValue  = 83
    print("Computing whether the square of $testValue is even: ")
    memoize(testValue).also(::println)
    print("Computing whether the square of $testValue is even: ")
    memoize(testValue).also(::println)
}
