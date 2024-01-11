import kotlin.reflect.full.*

fun main() {
        // Check that Account has a ternary constructor
        val accountParams  = Account::class.primaryConstructor?.parameters
        val accountCorrect = accountParams?.size == 3

        // Check that Savings has a quaternary constructor
        val savingsParams  = Savings::class.primaryConstructor?.parameters
        val savingsCorrect = savingsParams?.size == 4

        // Check that Current has a quinary constructor
        val currentParams  = Current::class.primaryConstructor?.parameters
        val currentCorrect = currentParams?.size == 5

        require (accountCorrect)
        { "The Account(..) constructor should have three parameters" }

        require (savingsCorrect)
        { "The Savings(..) constructor should have four parameters" }

        require (currentCorrect)
        { "The Current(..) constructor should have five parameters" }

        if (accountCorrect && savingsCorrect && currentCorrect) {
            println("Constructors defined with correct number of parameters")
        }
}
