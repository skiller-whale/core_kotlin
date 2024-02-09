import data.csvparser.*
import data.album.Album
import data.albumservice.*

import java.io.File

fun main() {
    // Get album data by parsing the CSV
    val parser               = CsvParser()
    val albumData: File      = parser.getData("album-sales.csv")
    val albums: List<Album?> = parser.parse(albumData)

    // TODO: initialise this variable by calling `calculateTotalSales` on `albums`
    // Then, uncomment the `print` function for total sales
    val totalSales = TODO("totalSales is not defined")

    println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ORCANIC RECORDS~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    // // TODO: Uncomment this function
    // print("Total sales: $totalSales")
    println("\n---------------------------------------------------------------------------")
    println("Album titles:")
    AlbumService().displayTitles(albums)

    println("\n---------------------------------------------------------------------------")
    println("Genres:")
    AlbumService().displayUniqueGenres(albums)

    println("\n---------------------------------------------------------------------------")
    println("Labels:")
    AlbumService().displayUniqueLabels(albums)
}
