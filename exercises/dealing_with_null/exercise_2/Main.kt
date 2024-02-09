import data.csvparser.*
import data.album.Album
import data.artist.Artist
import data.albumservice.*

import java.io.File

fun main() {
    // Get album data by parsing the CSV
    val parser                    = CsvParser()
    val albumData: File           = parser.getData("album-sales-collab.csv")
    val albums: List<Album?>      = parser.parse(albumData)
    val artists: Map<Int, Artist> = data.artist.artistTable

    // Perform some simple queries using the API
    val totalSales = AlbumService().calculateTotalSales(albums)

    println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ORCANIC RECORDS~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    print("Total sales: $totalSales")
    println("\n---------------------------------------------------------------------------")
    albums.forEach { println(AlbumService().displayAlbum(it, artists)) }
}
