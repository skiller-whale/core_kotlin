/* Exercise 3: Encapsulation and Setters
 * -------------------------------------
 *
 * PART 1: if you look in `Main.kt`, you will see that the user has access
 * to `allGuesses` in the `printState()` function. So, they could accidentally
 * mutate this data, since `allGuesses` is a mutable list.
 *
 *  Fix this by ensuring that the user can only access an immutable list.
 *  Do not change the type or implementation of `allGuesses`, although you
 *  may change its visibility.
 *
 * PART 2: Update this code so that the `difficulty` property has a setter.
 * This should accept values between 1 and 18 (inclusive) but throw an error
 * when given values outside of this range.
 *
 * You should also update `Main.kt` so that players have the ability to
 * set the difficulty of a game before they start. Consider how users should
 * set this property as part of the API design.
 */

class Hangman() {
    private val answer: String   = Utility().randomWord()
    public val allGuesses        = mutableListOf<Char>()
    private val incorrectGuesses = mutableListOf<Char>()

    // TODO: implement a setter for this property with input validation
    private val difficulty       = 10

    public val isWon get()  = currentAnswer == answer
    public val isLost get() = remainingGuesses == 0

    // Get number of guesses remaining.
    public val remainingGuesses: Int
      get() = difficulty - incorrectGuesses.size

    // Get state of current answer.
    public val currentAnswer: String
      get() = answer.toCharArray().map { letter ->
        if (allGuesses.contains(letter)) letter else '*' }.joinToString("")

    public fun guessLetter(letter: Char) {
        allGuesses.add(letter)
        if (!answer.contains(letter)) {
            incorrectGuesses.add(letter)
        }
    }

    public fun playGuess(guess: Char): String {
      return when (!(allGuesses).contains(guess)) {
        true -> { guessLetter(guess); "You guessed ${guess}" }
        false -> "You have already guessed that!"
      }
    }
}
