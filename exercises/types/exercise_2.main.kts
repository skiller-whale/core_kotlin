package org.types

/* Integer Types
 * -------------
 *
 * Run the code below and look at the compilation errors.
 * Answer the questions on the slide.
 * Then, change the types so that the program compiles and runs.
 */

val (width, height, depth, litresInMCubed) = listOf<Short>(50, 25, 2, 1000)
val olympicSizePool: Short = width * height * depth * litresInMCubed
println("There is ${olympicSizePool}l of water in a regulation Olympic swimming pool.")

val distanceToJupiterKM: Int = 628730000
val distanceToNeptuneKM: Int = 4351400000
println("It would take about ${distanceToJupiterKM * 1000 / 7} average-size orcas to reach Jupiter.")
println("It would take about ${distanceToNeptuneKM * 1000 / 7} average-size orcas to reach Neptune.")

val averageWimbledon: Byte = 55000
val averageUSOpen: Int = 71001L
val averageRolandGarros: Int = 65000
val averageAustralianOpen: Long = 48000
println("Average number of tennis balls used at a grand slam tennis tournament: ${(averageWimbledon + averageUSOpen + averageRolandGarros + averageAustralianOpen) / 4}.")
