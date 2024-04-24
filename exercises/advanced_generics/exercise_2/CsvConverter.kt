package data.converter

import data.interfaces.*

/* Exercise 2: Generic Type Constraints: Multiple Upper Bounds
 * -----------------------------------------------------------
 *
 * Use multiple type constraints on the parameter for the
 * `CsvConverter<T>` rather than one constraint in a combined interface.
 */

class CsvConverter<T: Serializable<T>> {
    // Convert an input to a CSV table
    fun toCsv(input: List<T>): List<String> {
        return input.map { it -> it.encode() }
    }

    // Convert a CSV table to a list of data class instances
    fun fromCsv(csv: List<String>, decoder: Decodable<T>): List<T> {
        return csv.map { it -> decoder.decode(it) }
    }
}
