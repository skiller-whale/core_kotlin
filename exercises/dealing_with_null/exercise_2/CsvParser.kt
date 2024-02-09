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

    // Destructure up to six elements
    operator fun <T> List<T>.component6(): T = get(5)

    @Suppress("UNUSED_VARIABLE")
    public fun parse(input: File): List<Album?> {
        val inputStream = input.inputStream()
        val reader      = inputStream.bufferedReader()
        val header      = reader.readLine()
        return reader.lineSequence()
            .filter { it.isNotBlank() }
            .map {
                val (artistId, collabId, title, genre, recordLabel, totalSales) = it.split(',', ignoreCase = true, limit = 6)
                Album(
                    artistId.trim().toInt(),
                    collabId.format()?.toInt(),
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
