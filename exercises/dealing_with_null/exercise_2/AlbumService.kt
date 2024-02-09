package data.albumservice

import data.album.*
import data.artist.*

// An API to do some simple queries on the `Album` data class

public class AlbumService {

    public fun getAllTitles(list: List<Album?>): List<String?> {
        return list.map { album -> album?.title }
    }

    public fun getUniqueGenres(list: List<Album?>): Set<String?> {
        return list.map { album -> album?.genre }.toSet()
    }

    public fun getUniqueLabels(list: List<Album?>): Set<String?> {
        return list.map { album -> album?.recordLabel }.toSet()
    }

    // PART 1: re-write this function without using `filterNotNull()`
    public fun calculateTotalSales(list: List<Album?>): Int {
        return list.map { it?.totalSales }.filterNotNull().sum()
    }

    // PART 3: define the `displayCollab()` function


    public fun displayAlbum(album: Album?, artists: Map<Int, Artist>): String {
        return "[${album?.artistId}] ${album?.title} -- ${displayCollab(album, artists)}\n" +
        "Genre: ${album?.genre}, Label: ${album?.recordLabel}, Sales: ${album?.totalSales}\n"
    }
}
