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

    public val properties get() = listOf(artistId, title, genre, recordLabel, totalSales)
}
