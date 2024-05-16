import functions.fibonacci.*

fun main() {
    // Fibonacci functions
    val timeFib        = measureTime(::fib)
    val timeTailFib    = measureTime(::tailFib)

    // Values to test Fibonacci functions
    val smallValue = 48L
    val largeValue = 48000L

    // Tail Recursion is faster
    println("Recursive Fibonacci Functions")
    println("-----------------------------")

    print("fib(${smallValue})        ==> ")
    timeFib(smallValue).also(::println)

    print("tailFib(${smallValue})    ==> ")
    timeTailFib(smallValue).also(::println)

    // TODO: Uncomment then run this code
    // You should get an overflow error because the function does not
    // use `tailrec`. Update the tail recursive function in `Fibonacci.kt` to
    // be tail call optimised with `tailrec`

    // timeTailFib(largeValue)
}
