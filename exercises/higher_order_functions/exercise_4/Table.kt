package data.table

import data.album.*
import data.csvparser.*

import java.io.File

/* Exercise 4: Higher-Order Idioms
 * -------------------------------
 *
 * PART 1: define the `parseTable()` function, using the converter
 * `Album.Converter::from` in the `Album` class. Update `Main`.
 *
 * PART 2: re-define `transformTable()` and `partialTransformTable()`.
 * Update the function calls in `Main` to use a 'chain' style.
 */

// TODO (PART 1): define the `parseTable()` function

// TODO (PART 2): Update this function so it can be called with a receiver
public fun transformTable(table: Table, transform: (Value) -> Value): Table {
    return table.map { column -> transformColumn(column, transform) }
}

// TODO (PART 2): Update this function so it can be called with a receiver
public fun partialTransformTable(table: Table, columns: List<Int>, transform: (Value) -> Value): Table {
    return table.mapIndexed {
        index, column -> if (columns.contains(index)) transformColumn(column, transform) else column }
}

private fun transformColumn(column: Column, transform: (Value) -> Value): Column {
    return column.map(transform)
}

//----------------------------------------------------------------------
// -- Outline

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

// Some functions for Value transformations

public fun removeWhitespace(value: Value): Value = value.trim()

public fun regexReplace(value: Value, old: Char, new: Char): Value = value.replace(old, new)

public fun toLowerCase(value: Value): Value = value.lowercase()

public fun toUpperCase(value: Value): Value = value.uppercase()
