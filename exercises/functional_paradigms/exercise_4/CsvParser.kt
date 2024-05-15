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

    // Parse a CSV file into a list of `String` values
    @Suppress("UNUSED_VARIABLE")
    public fun parseToTable(str: String): List<String> {
        val input       = getData(str)
        val inputStream = input.inputStream()
        val reader      = inputStream.bufferedReader()
        val header      = reader.readLine()
        return reader.lineSequence().map { it.split(",").joinToString().replace(" ", "") }.toList()
    }
}
