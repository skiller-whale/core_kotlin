package data.album

data class Album(
    val artistId:    Int,
    val title:       String,
    val genre:       String,
    val recordLabel: String,
    val totalSales:  Int
) {
    override fun toString(): String {
        return "[${artistId}]\t${title} " +
        "[g] $genre [l] $recordLabel\n\tTotal sales: $totalSales\n"
    }

    // A (simplified) method to construct class instances from CSV rows
    companion object Converter {
        fun from(row: List<String>): Album {
            val (artistId, title, genre, recordLabel, totalSales) = row
            return Album(
                artistId.toInt(),
                title,
                genre,
                recordLabel,
                totalSales.toInt(),
            )
        }
    }
}
