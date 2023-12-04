/* Exercise 2: Encapsulation and Getters
 * -------------------------------------
 *
 * The following code contains a class that implements the game 'Hangman'.
 * However, there are some problems with this implementation, and its API.
 * Run the game:
 *
 *     1. What do you notice is wrong with `currentAnswer`?
 *        Fix this property using a getter.
 *
 *     2. If you look in `Main`, the client code is having to calculate
 *        the remaining number of guesses as a game progresses, and whether
 *        a game is lost.
 *
 *        Re-factor the code so that `remainingGuesses` and `isLost` are
 *        public properties of the `Hangman` class.
 *
 *        After doing this, you should also hide two properties in the
 *        implementation that do not need to be part of the API.
 */

class Hangman(public val difficulty: Int = 10) {
    private val answer           = Utility().randomWord()
    private val guesses          = mutableListOf<Char>()
    public val incorrectGuesses  = mutableListOf<Char>()
    public val isWon get()       = currentAnswer == answer
    // TODO: define the `isLost` property

    // TODO: define the `remainingGuesses` property

    // Get letters guessed (behind an immutable interface).
    public val lettersGuessed: List<Char>
      get() = guesses

    // Get state of current answer, e.g., "k*tl*n"
    public val currentAnswer: String = answer.toCharArray().map { letter: Char ->
        if (guesses.contains(letter)) letter else '*' }.joinToString("")

    // Update guesses based on the input.
    fun guessLetter(letter: Char) {
        guesses.add(letter)
        if (!answer.contains(letter)) {
            incorrectGuesses.add(letter)
        }
    }

    fun playGuess(guess: Char): String {
      return when (!(lettersGuessed).contains(guess)) {
        true -> { guessLetter(guess); "You guessed ${guess}" }
        false -> "You have already guessed that!"
      }
    }
}
