/* Exercise 2: Properties and Initialisation
 * -----------------------------------------
 *
 * Currently, each customer is represented as a pair of Strings.
 *
 * 1. Re-factor this code to use a Customer class with properties for a first name and last name.
 * 2. Use an init block to validate each property so that empty names are not allowed.
 *    Hint: `str.isBlank()` will return `true` if `str` is empty or contains only whitespace.
 * 3. Assign instances of Customer to the variables.
 * 4. Edit the `println` calls to get the properties of each customer.
 */

fun main() {
    // TODO: update these variable assignments
    val customer1 = Pair("Tuna", "Turner")
    val customer2 = Pair("Christian", "Whale")
    val customer3 = Pair("", "")

    // TODO: update these `println` calls
    println("customer1 is called ${customer1.first} ${customer1.second}")
    println("customer2 is called ${customer2.first} ${customer2.second}")
    println("customer3 is called ${customer3.first} ${customer3.second}")
}

// TODO: add properties to this class and some initialisation logic
class Customer
