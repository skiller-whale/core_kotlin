/*------------------------------------------------------------------------*/
/* -- Client code to run a game using its API -- */

fun main() {
    val newGame = Game()
    newGame.setDifficulty()
    newGame.runGame()
}

class Game() {
    val game = Hangman()

    fun setDifficulty() {
        print("Please enter a number between 1 and 18 to set the difficulty: ")
        val guesses: Int = java.util.Scanner(System.`in`).nextInt()
        // TODO: set the game difficulty here using the `guesses` input
    }

    tailrec fun runGame() {
        printState()
        when {
            game.isLost -> println("Sorry! You have lost")
            game.isWon  -> println("Congratulations, you won!")
            else        -> { // Run game in loop
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
        println("Letters guessed: ${game.allGuesses}")
        println("You have ${game.remainingGuesses} remaining guesses.")
    }
}
