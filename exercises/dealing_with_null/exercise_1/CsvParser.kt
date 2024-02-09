// <<< DO NOT EDIT THIS CODE >> //
// This class simulates a CSV parser, although it is not parameterised
// to parse tables into any data type (only the `Album` type)
package data.csvparser

import data.album.Album

import java.io.File
import java.io.File.*
import java.io.InputStream
import java.nio.file.Paths

class CsvParser {
    // Update this so it goes to the data for exercises
    private val path = Paths.get("").toAbsolutePath().toString()

    public fun getData(str: String) = File("${path}/../../data/$str")

    @Suppress("UNUSED_VARIABLE")
    public fun parse(input: File): List<Album?> {
        val inputStream = input.inputStream()
        val reader      = inputStream.bufferedReader()
        val header      = reader.readLine()
        return reader.lineSequence()
            .filter { it.isNotBlank() }
            .map {
                val (artistId, title, genre, recordLabel, totalSales) = it.split(',', ignoreCase = true, limit = 5)
                Album(
                    artistId.trim().toInt(),
                    title.trim(),
                    genre.format(),
                    recordLabel.format(),
                    totalSales.format()?.toInt()
                )
            }.toList().map { generateNull(it) }
    }

    // Get empty strings in CSV to render as null
    private fun String.format(): String? {
        val str = this.trim()
        return if (str == "") null else str
    }

    // Get empty rows in CSV to render as null
    private fun generateNull(album: Album): Album? {
        return if (album.properties.all { it == null }) null else album
    }
}
