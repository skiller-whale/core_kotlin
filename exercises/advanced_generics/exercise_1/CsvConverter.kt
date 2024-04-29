package data.converter

import data.interfaces.*

/* Exercise 1: Generic Type Constraints: Upper Bounds
 * --------------------------------------------------
 *
 * Update these functions so that they will work for any type `T` that
 * can be encoded and decoded with `String`.
 */

// Convert an input to a CSV table
fun toCsv(input: List<T>): List<String> {
    return input.map { it -> it.encode() }
}

// Convert a CSV table to a list of data class instances
fun fromCsv(csv: List<String>, decoder: Decodable<T>): List<T> {
    return csv.map { it -> decoder.decode(it) }
}
