// <<< DO NOT EDIT THIS CODE >> //
package data.csvparser

import java.io.File
import java.io.File.*
import java.io.InputStream
import java.nio.file.Paths

class CsvParser {
    // Get exercise data
    private val path = Paths.get("").toAbsolutePath().toString()

    private fun getData(str: String) = File("${path}/../../data/$str")

    // Parse a CSV file into a plain table
    @Suppress("UNUSED_VARIABLE")
    public fun parseToTable(str: String): List<List<String>> {
        val input       = getData(str)
        val inputStream = input.inputStream()
        val reader      = inputStream.bufferedReader()
        val header      = reader.readLine()
        return reader.lineSequence().map { it.split(",") }.toList()
    }

    public fun <T> getColumns(rows: List<List<T>>) = transpose(rows)

    // Transpose any matrix (two-dimensional array)
    private fun <T> transpose(matrix: List<List<T>>): List<List<T>> {
        return (matrix[0].indices).map { i -> (matrix.indices).map { j -> matrix[j][i] } }
    }
}
