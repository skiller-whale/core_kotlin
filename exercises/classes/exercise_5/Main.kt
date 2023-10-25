/* Exercise 5: Using Multiple Classes
 * ----------------------------------
 *
 * 1. Define a 'password' property for the Customer class.
 *    Initialise it using `generate()` from the `PasswordGenerator` class.
 *
 * 2. The password returned by `generate()` is plaintext and not hashed.
 *    Use the `init` block to hash each password that is generated for a customer.
 *    Hint: the `Hasher` class has a member function `hash(plaintext)` that hashes
 *          a plaintext password, and returns the result as a hexadecimal string.
 */

fun main() {
    val customer1 = Customer("Tuna", "Turner")
    val customer2 = Customer("Christian", "Whale")

    // TODO: un-comment this code after you have defined the `password` property
    println("customer1 hashed password: ${customer1.password}")
    println("customer2 hashed password: ${customer2.password}")
}

class Customer(
    val firstName: String = "Plaiceholder",
    val surname: String = "Plaiceholder",
) {
    init {
        if (firstName.isBlank() || surname.isBlank()) {
            throw Exception("Please provide a non-empty name")
        }
    }
}
