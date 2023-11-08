/* Exercise 4: Member Functions
 * ----------------------------
 *
 * 1. Define a new `basket` property and initialise it to an empty set using `mutableSetOf()`.
 * 2. Define a member function `fullName` that returns a customer's first name and last name in a String.
 * 3. Define two member functions `addToBasket`:
 *    a. One should take a collection of Strings and add them all to a customer's basket;
 *    b. One should take a String and add it to a customer's basket.
 *    Hint: `MutableSet<T>.addAll()` will add a collection of items to a set.
 * 4. Refactor the `basket.add()` calls in `main()` to use `addToBasket`.
 */

fun main() {
    val customer1 = Customer("Tuna", "Turner")
    val customer2 = Customer("Christian", "Whale")
    val customer3 = Customer("Sealion", "Dion")

    // Do some shopping
    customer1.basket.add("In the Court of the Crimson Fin")
    customer1.basket.add("Cod A")
    customer2.basket.add("Mezzanine")
    customer2.basket.add("Dummy")
    customer2.basket.add("Boston")
    customer3.basket.add("Siamese Bream")

    println("${customer1.fullName()} purchased: ${customer1.basket}")
    println("${customer2.fullName()} purchased: ${customer2.basket}")
    println("${customer3.fullName()} purchased: ${customer3.basket}")

    // <<< DO NOT EDIT THIS CODE >>> //
    testFunctionsOverloaded()
}

class Customer(
    val firstName: String = "Placeholder",
    val lastName: String = "Placeholder",
) {
    init {
        if (firstName.isBlank() || lastName.isBlank()) {
            throw Exception("Please provide a non-empty name")
        }
    }
}

// <<< DO NOT EDIT THIS CODE >>> //
fun testFunctionsOverloaded() {
    Customer().addToBasket("Test")
    Customer().addToBasket(listOf("Test1", "Test2"))
}
