// <<< DO NOT EDIT THIS CODE >> //
package data.csvparser

import java.io.File
import java.io.File.*
import java.io.InputStream
import java.nio.file.Paths

class CsvParser {
    // Get exercise data
    private val path = Paths.get("").toAbsolutePath().toString()

    public fun getData(str: String) = File("${path}/../../data/$str")

    // Parse a CSV file into a plain table
    @Suppress("UNUSED_VARIABLE")
    public fun parseToTable(input: File): List<List<String>> {
        val inputStream = input.inputStream()
        val reader      = inputStream.bufferedReader()
        val header      = reader.readLine()
        return reader.lineSequence().map { it.split(",") }.toList()
    }
}
