package org.types

/* Floating Point Types
 * --------------------
 *
 * Read this code.
 * Can you predict the values for `divideByZero` and `zeroByZero`?
 * Look at the provided hint, and put your answers in the box on the slide.
 *
 * Run this code.
 * Why does the calculation for divideByZeroInt cause an error?
 */

val divideByZero = 1.0F / 0.0F
val zeroByZero   = 0.0F / 0.0F
println("divideByZero is ${divideByZero}.")
println("zeroByZero is ${zeroByZero}.")

// // Uncomment this code for a hint about the above...
// val divisors = listOf(0.1, 0.01, 0.001, 0.0001)
// divisors.forEach { println("Dividing 1 by ${it.toString()} == ${1/it}") }

val divideByZeroInt = 1 / 0
println("divideByZeroInt is ${divideByZeroInt}.")
