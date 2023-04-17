/* Boolean Expressions
 * -------------------
 *
 * This code describes the logic for two light switches that control the same light.
 *
 * At the moment, the light will be on when either (or both) switches are up (`true`).
 *
 * Run the file to check that the light is off only when the upstairs and downstairs switches are both down.
 *
 * Update the definition for `lightOn` so that it returns `true` if exactly one switch is up, and `false` otherwise.
 */

fun lightOn(upstairsUp: Boolean, downstairsUp: Boolean): Boolean {
    // TODO: Edit this line only
    val on: Boolean = upstairsUp || downstairsUp

    return on
}

// Do not edit these print lines
println("Light switch positions          | Light on")
println("--------------------------------+---------")
println("upstairs Up, downstairs Up  \t  | ${lightOn(true, true)}")
println("upstairs Up, downstairs Down\t  | ${lightOn(true, false)}")
println("upstairs Down, downstairs Up\t  | ${lightOn(false, true)}")
println("upstairs Down, downstairs Down\t| ${lightOn(false, false)}")
