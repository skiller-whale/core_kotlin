/* Exercise 3: Default Values and Secondary Constructors
 * -----------------------------------------------------
 *
 * Currently, the primary constructor for Customer requires two Strings to be
 * passed to it to initialise an instance of the class.
 *
 * 1. Provide default "Plaiceholder" values for both properties so that this code compiles.
 * 2. Define an 'email' property, whose default value uses the firstName and lastName properties.
 * 3. Use the `init` block to format every email in lowercase.
 *    Hint: `str.lowercase()` will return a lowercase string value.
 * 4. Un-comment the `println` calls and check that your code is working properly.
 */

fun main() {
    val customer1 = Customer("Tuna", "Turner", "Tuna.TURNER@orca.com")
    val customer2 = Customer("Christian", "Whale")
    val customer3 = Customer()
    val customer4 = Customer(firstName = "Orca")

    // TODO: un-comment these `println` calls after defining the `email` property
    // println("customer1: ${customer1.firstName} ${customer1.lastName}, email: ${customer1.email}")
    // println("customer2: ${customer2.firstName} ${customer2.lastName}, email: ${customer2.email}")
    // println("customer3: ${customer3.firstName} ${customer3.lastName}, email: ${customer3.email}")
    // println("customer4: ${customer4.firstName} ${customer4.lastName}, email: ${customer4.email}")

    // <<< DO NOT EDIT THIS CODE >>> //
    checkAnswersCorrect(customer1, customer3) // Run requirements
}

class Customer(
    val firstName: String,
    val lastName: String,
    ) {
    init {
        if (firstName.isBlank() || lastName.isBlank()) {
            throw Exception("Please provide a non-empty name")
        }
    }
}


// <<< DO NOT EDIT THIS CODE >>> //
fun checkAnswersCorrect(customer1: Customer, customer3: Customer) {
    require(customer3.firstName == "Plaiceholder")
    {"No default value provided for `firstName`."}
    require(customer3.lastName == "Plaiceholder")
    {"No default value provided for `lastName`."}
    require(customer1.email == "tuna.turner@orca.com")
    {"Email for Tuna Turner is not lowercase. Check your initialisation logic."}
}
