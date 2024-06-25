@file:Repository("https://repo.maven.apache.org/maven2/")
@file:DependsOn("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.1")

import kotlin.system.measureTimeMillis
import kotlinx.coroutines.*

/**
Exercise 3 - CONSTANTS
================================

This code calculates Euler's number (e) and PI. Currently it is waiting
    for both tasks before it stores the results in a file.

NOTE: You don't need to understand or edit the code that computes e or PI.

The issue at the moment is that those two operations aren't done concurrently.

* Refactor `computeConstants` to run the computation in parallel.

HINT 1: You will need to use `async` for both `e` and `pi`.
HINT 2: You will need to use an appropriate Dispatcher.
**/

/**
 * Compute pi using a Madhava-Leibniz series.
 *
 * @param it The number of iterations of the series.
 * @return pi
 */
fun computePI(iterations: Int): Double {

    var pi = 0.0
    var sign = 1

    for (i in 0..iterations) {
        pi += sign * 4.0 / (2 * i + 1)
        sign *= -1
    }

    return pi
}

/**
 * Computes Euler's constant using the series:
 *     1/0! + 1/1! + 1/2! + 1/3! + ...
 *
 * @param it The number of iterations.
 * @return e
 */
fun computeE(iterations: Int): Double {
    
    var e = 0.0
    var fact = 1.0

    for (i in 0..iterations) {
        if (i > 0) fact *= i
        e += 1 / fact
    }
    return e
}

// TODO: Your code goes here (refactor `computeConstants` to run the computation in parallel).
suspend fun computeConstants(): HashMap<String, Double> {
    return hashMapOf(
        "e"  to computeE(10_000_000),
        "pi" to computePI(100_000_000)
    )
}

val timeTaken = measureTimeMillis {
    runBlocking {
        launch {
            println(computeConstants())
        }
    }
}

println("Done in $timeTaken ms.")
