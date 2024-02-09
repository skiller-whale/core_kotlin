package data.albumservice

import data.album.*

// An API to do some simple queries on the `Album` data class

public class AlbumService {

    public fun getAllTitles(list: List<Album?>): List<String> {
        return list.map { album -> album.title }
    }

    public fun getUniqueGenres(list: List<Album?>): Set<String> {
        return list.map { album -> album.genre }.toSet()
    }

    public fun getUniqueLabels(list: List<Album?>): Set<String> {
        return list.map { album -> album.recordLabel }.toSet()
    }

    // PART 2: define the display functions here
    // These should ignore `null` values

    public fun displayTitles(list: List<Album?>) {
        val albumTitles = getAllTitles(list)
        albumTitles.forEach { title -> println(title) }
    }

    public fun displayUniqueGenres(list: List<Album?>) {
        // TODO: define this function
    }

    public fun displayUniqueLabels(list: List<Album?>) {
        // TODO: define this function
    }

    // PART 3: define `calculateTotalSales` here
}
