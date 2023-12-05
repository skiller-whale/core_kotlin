/*------------------------------------------------------------------------*/
/* -- Client code to run a game using its API -- */

fun main() {
    PlayGame().runGame()
}

class PlayGame() {
    private val game = Hangman()

    private val remainingGuesses: Int
      get() = game.difficulty - game.incorrectGuesses.size

    tailrec fun runGame() {
        printState()
        when {
            remainingGuesses == 0 -> println("Sorry! You have lost")
            game.isWon            -> println("Congratulations, you won!")
            else                  -> { // Run game in loop
                print("Enter a letter or word: ")
                val input: Char = readln().single()
                game.playGuess(input).also(::println)
                runGame()
            }
        }
    }

    fun printState() {
        println()
        println("Current answer: ${game.currentAnswer}")
        println("Letters guessed: ${game.lettersGuessed}")
        println("You have ${remainingGuesses} remaining guesses.")
    }
}
