package data.converter

import data.interfaces.*

/* Exercise 2: Generic Type Constraints: Multiple Upper Bounds
 * -----------------------------------------------------------
 *
 * Define a `CsvConverter<T>` class that contains both functions.
 *
 * Use type constraints to ensure that every function provided by this
 * class only works with values that are encodable and decodable.
 */

// TODO: define the `CsvConverter<T>` class and add type constraints

// Convert an input to a CSV table
fun <T> toCsv(input: List<T>): List<String> {
    return input.map { it -> it.encode() }
}

// Convert a CSV table to a list of data class instances
fun <T> fromCsv(csv: List<String>, decoder: Decodable<T>): List<T> {
    return csv.map { it -> decoder.decode(it) }
}
