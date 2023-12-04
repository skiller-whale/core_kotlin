/* Exercise 4 : The Companion Object
 * ---------------------------------
 *
 * This class uses `randomWord()` from the `Utility` class to generate a word
 * for each game. However, it does not keep track of which words have been used.
 * So a player might have to guess the same word if they play consecutive games.
 *
 *   PART 1: Update the game so that it will not repeat a word after it has been used.
 *   Hint: you might also need an `init` block.
 *
 *   PART 2 (Extra): 'reset' the used words after all options have been played.
 *
 * Hint: you can use `Utility().wordsLength` to get the length of the list used
 * to draw random words for the game. The method `clear()` will also remove
 * every element in a mutable list or set.
 */

class Hangman() {
    private var answer           = Utility().randomWord()
    private val guesses          = mutableListOf<Char>()
    private val incorrectGuesses = mutableListOf<Char>()
    private var difficulty       = 10
      private set(value) = when {
        (value <= 0)  -> throw Exception("Please provide a positive value")
        (value <= 18) -> field = value
        else          -> throw Exception("The game is too easy!")
      }

    // TODO: define a companion object to track the used words
    // You might also want an `init` block for parts 1 and 2

    public val isWon get()  = currentAnswer == answer
    public val isLost get() = remainingGuesses == 0

    // Get number of guesses remaining.
    public val remainingGuesses: Int
      get() = difficulty - incorrectGuesses.size

    // Get letters guessed (behind immutable interface).
    public val lettersGuessed: List<Char>
      get() = guesses

    // Get state of current answer.
    public val currentAnswer: String
      get() = answer.toCharArray().map { letter ->
        if (guesses.contains(letter)) letter else '*' }.joinToString("")

    public fun selectDifficulty(numberOfGuesses: Int) {
        difficulty = numberOfGuesses
    }

    public fun guessLetter(letter: Char) {
        guesses.add(letter)
        if (!answer.contains(letter)) {
            incorrectGuesses.add(letter)
        }
    }

    public fun playGuess(guess: Char): String {
      return when (!(lettersGuessed).contains(guess)) {
        true -> { guessLetter(guess); "You guessed ${guess}" }
        false -> "You have already guessed that!"
      }
    }
}
