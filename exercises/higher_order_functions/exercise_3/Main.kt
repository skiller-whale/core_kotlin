import data.csvparser.*
import data.table.*

import java.io.File

fun main() {
	val parser            = CsvParser()
    val albumData: File   = parser.getData("album-sales-alt.csv")
    val albumTable: Table = readTable(albumData)

    // Do some transformations on the Columns
    val trimmedTable = transformTable(albumTable, ::removeWhitespace)
    val upperTitles  = partialTransformTable(trimmedTable, listOf(1), ::toUpperCase)

    // Get the list of Rows before pretty printing the table
    getRows(upperTitles).also(::pprintTable)
}

public fun <T> pprintTable(table: List<List<T>>) {
    table.map(::pprintRow)
}

private fun <T> pprintRow(row: List<T>) {
   row.map { value -> print("${value}, ")}
   println("")
}
