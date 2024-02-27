import data.csvparser.*
import data.table.*
import data.album.*

import java.io.File

fun main() {
	val parser            = CsvParser()
    val albumData: File   = parser.getData("album-sales-alt.csv")
    val albumTable: Table = readTable(albumData)

    // Do some transformations on the Columns
    // TODO (Optional): use a single variable and chain the transformations
    val trimmedTable   = transformTable(albumTable, ::removeWhitespace)
    val formattedTable = partialTransformTable(trimmedTable, listOf(1), ::toUpperCase)

    // Get the list of Rows before parsing into instances of the data class
    val rowTable = getRows(formattedTable)

    // TODO: use the `parseTable()` function to get a List<Album>
    val albums = TODO("Not implemented")
    albums.forEach { println(it) }
}
