import java.io.File

// ======================================================================
// Exercise Data

val PATH = "${__FILE__.getAbsoluteFile().parent}"

val exerciseData1 = File("${PATH}/../data/popular_female_names_1990s.txt")
val bufferedReader1 = exerciseData1.bufferedReader()
val girlNames: List<String> = bufferedReader1.readLines()

val exerciseData2 = File("${PATH}/../data/common_words.txt")
val bufferedReader2 = exerciseData2.bufferedReader()
val commonWords: List<String> = bufferedReader2.readLines()

// ======================================================================
// Utility Functions and Values

fun <T> List<T>.printPets() = println("${this.first()}: ${this.last()}")

fun String.trimFormat() = this.trimIndent().replace(Regex("(\n*)\n"), "$1")

val lineSeparator = "\n${"*".repeat(86)}\n"

// ======================================================================
// Answers for exercises

val exercise2: List<Any> = listOf(1565, "Jessica", "Moira", "Christopher")

val exercise3: List<Any> = listOf(1285, "Stephany", 64)

val exercise4: List<Any> = listOf(
    listOf("the", "of", "to", "and", "a", "in", "is", "it", "you", "that"),
    listOf("every", "step", "jump"),
    listOf("neck", "shell", "teeth"),
    "eck",
)

val numbers: List<Int> = listOf(109, 283, 47, 1209, 8, 471, 90, 241)
val exercise5: List<List<Int>> = listOf(listOf(109, 283, 47, 1209), listOf(8, 471, 90, 241))
