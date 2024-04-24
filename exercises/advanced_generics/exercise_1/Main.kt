import data.album.*
import data.interfaces.*
import data.converter.*
import data.csvparser.*

fun main() {
    val parser       = CsvParser()
    val csvTable     = parser.getData("album-sales-generics.csv")
    val albumStrings = parser.parseToTable(csvTable)
    val albumConverter = CsvConverter<Album>()
    val decoder = Album(1093, "Cod A", "Eel-ectronic", "Atlantic", 4837)

    val albums = albumConverter.fromCsv(albumStrings, decoder)
    println("Albums decoded from CSV Strings:")
    println("--------------------------------")
    albums.forEach { album -> println(album) }

    val csvStrings = albumConverter.toCsv(albums)
    println("\nCSV Strings encoded from Albums:")
    println("---------------------------------")
    csvStrings.forEach { str -> println(str) }
}
