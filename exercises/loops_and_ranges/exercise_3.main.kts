@file:Import("utilities.main.kts")

/* ITERATING THROUGH INDICES
 * -------------------------
 * The code below iterates over an array `words` that contains some common English words.
 * It finds each anagram of the searchWord, and prints it along with its position in the array.
 *
 *     1. Refactor this code to use `words.withIndex()` or `words.forEachIndexed`.
 *
 *     2. How many anagrams of 'kale' are there?
 */

val searchWord = "loop" // Anagram subject

fun getAnagrams(words: Array<String>, searchWord: String): Array<Pair<Int, String>> {
    var anagrams: Array<Pair<Int, String>> = arrayOf()

    for (index in words.indices) {
        val word = words[index]
        if (word != searchWord && isAnagram(word, searchWord))
            anagrams += Pair(index, word)
    }
    return anagrams
}

/* <<< DO NOT EDIT THIS CODE >>> */
println("Anagrams of '${searchWord}'...")
getAnagrams(words, searchWord).forEach { println("'${it.second}', at position ${it.first}") }
