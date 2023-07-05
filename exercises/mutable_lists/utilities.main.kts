import java.io.File

// ======================================================================
// Exercise Data

val PATH = "${__FILE__.getAbsoluteFile().parent}"

// ======================================================================
// Utility Functions and Values

fun <T> printStock(xs: MutableList<T>) = println("${xs.first()}: ${xs.drop(1)}")

fun String.trimFormat() = this.trimIndent().replace(Regex("(\n*)\n"), "$1")

fun printAlbumData(xs: List<Pair<String, Int>>) {
    println("|Album title                      | Units sold |")
    println("|---------------------------------+------------|")
    xs.forEach { albumData -> println("|${albumData.first.padEnd(32)} | ${albumData.second.toString().padEnd(11)}|") }
}

fun averagesAssertionError(): String {
    println("Expected output for Monthly Best-seller Averages:\n")
    printAlbumData(exerciseAnswersBestsellers)
    return "."
}

// ======================================================================
// Exercise Answers

val exerciseAnswers3 = mutableListOf(
    "Cod A" to 304,
    "Mezzanine" to 236,
    "The Bends" to 188,
    "Sounds of Seal-ence" to 163,
    "How it Eels to Be Something On" to 147,
    "Siamese Bream" to 90,
    "Tranquility Bass Hotel & Casino" to 81,
    "The Whaler" to 79,
    "In the Court of the Crimson Fin" to 73,
    "The Velvet Underwater" to 45,
)

val exerciseAnswersBestsellers = listOf(
    "Cod A" to 101,
    "Mezzanine" to 78,
    "The Bends" to 62,
    "Sounds of Seal-ence" to 54,
    "How it Eels to Be Something On" to 49,
)

val exerciseAnswersEstimate = listOf(
    "Cod A" to 1216,
    "Mezzanine" to 944,
    "The Bends" to 752,
    "Sounds of Seal-ence" to 652,
    "How it Eels to Be Something On" to 588,
    "Siamese Bream" to 360,
    "Tranquility Bass Hotel & Casino" to 324,
    "The Whaler" to 316,
    "In the Court of the Crimson Fin" to 292,
    "The Velvet Underwater" to 180,
)
