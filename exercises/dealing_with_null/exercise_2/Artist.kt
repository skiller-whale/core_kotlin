// <<< DO NOT EDIT THIS CODE >>> //
package data.artist

data class Artist(
    val name: String,
    val albums: List<String>,
    val genre: String?,
) {
    override fun toString(): String {
        return "$name -- $genre \n" +
        "Albums: ${albums}\n"
    }
}

// A simple `Map` for `artistId`s and `Artist`s
// Suppose this is a snippet parsed from another CSV
public val artistTable: Map<Int, Artist> = mapOf(
    454  to Artist("Seafaring Pumpkins", listOf("Siamese Bream", "Fish"), "Indie"),
    6994 to Artist("Radio-seabed", listOf("Cod A", "The Bends"), "Alternative"),
    9492 to Artist("Simon and Karp-funkel", listOf("Sounds of Seal-ence"), "Rock"),
    6460 to Artist("Neutral Milk Hotel", listOf("In the Aeroplane Over the Sea"), "Indie"),
    2449 to Artist("The Whalers", listOf("The Whaling Whalers", "The Best of the Whalers"), "Sole Music"),
    4842 to Artist("Bob Marley", listOf("Ex-Cod-Us"), "Sole Music"),
    9494 to Artist("Massive Attack", listOf("Mezzanine"), "Eel-ectronic"),
    7227 to Artist("Taylor Swift", listOf("Nineteen Eighty-Brine"), "Pop"),
    8543 to Artist("David Bowie", listOf("Hunky Dory"), "Rock"),
    2109 to Artist("Stevie Manta-Ray Vaughan", listOf(""), "Rock"),
    7983 to Artist("ABBA", listOf("Waterloo", "Voyage"), "Rock"),
    5647 to Artist("Port-ishead", listOf("Dummy"), "Eel-ectronic"),
)
