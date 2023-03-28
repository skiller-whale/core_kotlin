/* The `when` Keyword
 * ------------------
 *
 * The Direction class defines constants that represent directions on a compass.
 *
 * The 'reverse' function should take a Direction and 'rotate' it by 180 degrees, e.g., WEST -> EAST.
 *
 * Write a `when`-expression to implement this.
 */

enum class Direction {
    NORTH, SOUTH, EAST, WEST
}

fun reverse(direction: Direction): Direction = /* Your code goes here */


// Do not edit this code
fun padLeft(s: String?, n: Int): String {
    return "%${n}s".format(s)
}

assert(reverse(Direction.NORTH) == Direction.SOUTH)
assert(reverse(Direction.SOUTH) == Direction.NORTH)
assert(reverse(Direction.EAST) == Direction.WEST)
assert(reverse(Direction.WEST) == Direction.EAST)
println(padLeft("${reverse(Direction.SOUTH)}", 10))
println(padLeft("|", 8))
println("${reverse(Direction.EAST)} --+--> ${reverse(Direction.WEST)}")
println(padLeft("|", 8))
println(padLeft("${reverse(Direction.NORTH)}", 10))
