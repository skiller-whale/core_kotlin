package data.album

// PART 2: update the properties `genre`, `recordLabel`, and `totalSales` so
// that they are set to a default placeholder value if `null`

data class Album(
    val artistId:    Int,
    val collabId:    Int?,
    val title:       String,
    var genre:       String?,
    var recordLabel: String?,
    var totalSales:  Int?
) {
    public val properties get() = listOf(artistId, title, genre, recordLabel, totalSales)
}
