/* ---------------------------------------------------------------------------*/
/* -- Utility functions -- */

// Do not edit this code
class Utility {
    private val PATH = java.nio.file.Paths.get("").toAbsolutePath().toString()
    private val words: List<String> = java.io.File("${PATH}/../../data/words_list.txt").bufferedReader().readLines()
    public val wordsLength get() = words.size
    public fun randomWord(): String = words.get((0..words.lastIndex).random())
}
