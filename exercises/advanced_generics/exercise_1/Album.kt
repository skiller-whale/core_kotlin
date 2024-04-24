package data.album

import data.interfaces.*

data class Album(
    val artistId:    Int,
    val title:       String,
    val genre:       String,
    val recordLabel: String,
    val totalSales:  Int
): Serializable<Album> {
    // A (simplified) function to construct a class instance from
    // a comma-separated String, e.g., "Cod A, Radiohead, Eel-ectronic, ..."
    override fun decode(input: String): Album {
        val (artistId, title, genre, recordLabel, totalSales) = input.split(",")
        return Album(
            artistId.toInt(),
            title,
            genre,
            recordLabel,
            totalSales.toInt(),
        )
    }

    // A (simplified) function to convert a class instance into a String
    override fun encode(): String {
        return mutableListOf<String>(
            artistId.toString(),
            title,
            genre,
            recordLabel,
            artistId.toString()
        ).joinToString(",")
    }
}
