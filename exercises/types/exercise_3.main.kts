package org.types

/* Unsigned Integer Types
 * ----------------------
 *
 * Run the code below and look at the output.
 * It's incorrect, because the units have been mixed up.
 *
 * Change the units so that the program gives the correct output.
 *   - Only edit golfBallsOnFootballPitch;
 *   - Note that there are 1000m in a meter.
 *
 * What steps are required to avoid overflow?
 */

// <<< DO NOT EDIT THIS CODE >>> //
val (footballPitchLengthM, footballPitchWidthM) = listOf<UByte>(105U, 68U) // in meters
val golfballDiameterMm: UByte = 44U // in millimeters

// TODO: change this line
val golfballsOnFootballPitch: UInt = (footballPitchLengthM / golfballDiameterMm) * (footballPitchWidthM / golfballDiameterMm)

println("You can fit $golfballsOnFootballPitch golf balls on a football pitch")
assert(golfballsOnFootballPitch == 3686370U) {"`golfballsOnFootballPitch` is not implemented correctly"}
