/* Type Conversions
 * ----------------
 *
 * The following code tries to assign some existing variables to new ones.
 * Use type conversions to fix the errors in the code.
 */

val int1 = 42
val int2 = 4324585914
val int3 = 384400L
val int4 = 184

// TODO: edit these variables only
val meaningOfLife: Byte      = int1
val asciiForAsterisk: Byte   = int1
val distanceToNeptuneKm: Int = int2
val distanceToMoonKm: Int    = int3
val accountBalance: Float    = int4

// <<< DO NOT EDIT THIS CODE >>> //
println("The meaning of life is ${meaningOfLife}.")
println("The ASCII number for '*' is ${asciiForAsterisk}.")
println("The distance to Neptune from Earth is roughly ${distanceToNeptuneKm}km.")
println("The distance to the Moon from Earth is roughly ${distanceToMoonKm}km.")
println("Total balance in account: £${accountBalance}.")
