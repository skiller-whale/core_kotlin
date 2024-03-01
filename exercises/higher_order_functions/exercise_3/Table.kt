package data.table

import data.csvparser.*

import java.io.File
import java.io.File.*

/* Exercise 3: Lambda Functions
 * ----------------------------
 *
 * This code defines a DSL for doing some basic operations on plain
 * CSV data, like applying transformation functions to columns.
 *
 * PART 1: define `transformTable()`, a higher-order function.
 *
 * PART 2: define the `partialTransformTable()` function.
 */

// TODO: define the higher-order `transformTable()` function

// TODO: define the higher-order `partialTransformTable()` function

// TODO: define the higher-order `transformColumn()` function

// Some functions for Value transformations

public fun removeWhitespace(value: Value): Value = value.trim()

public fun regexReplace(value: Value, old: Char, new: Char): Value = value.replace(old, new)

public fun toLowerCase(value: Value): Value = value.lowercase()

public fun toUpperCase(value: Value): Value = value.uppercase()

//----------------------------------------------------------------------
// -- Outline of the code

// A CSV table is initially parsed as a list of columns
typealias Table = List<Column>

// Each Column and Row is a list of String values
typealias Column = List<Value>
typealias Row    = List<Value>
typealias Value  = String

// Read a CSV file and return a Table, built as a List<Column>
public fun readTable(csv: File): Table {
    val parsedTable = CsvParser().parseToTable(csv)
    return transpose(parsedTable)
}

// Transform a Table into a List<Row>
public fun getRows(table: Table): List<Row> = transpose(table)

// Transform a List<Row> into a Table
public fun getColumns(rows: List<Row>): Table = transpose(rows)

// Transpose any matrix (two-dimensional array)
private fun <T> transpose(matrix: List<List<T>>): List<List<T>> {
    return (matrix[0].indices).map { i -> (matrix.indices).map { j -> matrix[j][i] } }
}
