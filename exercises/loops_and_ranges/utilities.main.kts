import java.io.File

val PATH = "${__FILE__.getAbsoluteFile().parent}"

// Exercise 2 data
val text = File("${PATH}/../data/looking_glass.txt")
val lookingGlass = text.readText().split("[.,!?\\s]+".toRegex())

// Exercise 3 data
val words_list = File("${PATH}/../data/words_list.txt")
val bufferedReader = words_list.bufferedReader()
val words: Array<String> = (bufferedReader.readLines()).toTypedArray()

// Exercise 3 utility functions
fun String.sortWord(): String {
    val arr = this.toCharArray()
    return arr.sorted().joinToString("")
}

fun isAnagram(word1: String, word2: String): Boolean {
    // Check if word1 is an anagram of word2 (case-sensitive)
    return word1.sortWord() == word2.sortWord()
}

// Exercise 4 data
val bacchae = File("${PATH}/../data/bacchae.txt")
val formattedBacchae = bacchae.readText().split("[.!?]+".toRegex())
