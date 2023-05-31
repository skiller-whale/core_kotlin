@file:Import("utilities.main.kts")

/* INTRODUCTION TO LISTS: PART 1
 * -----------------------------
 *
 * Update `catNames` so that its type signature is more precise, and change its definition so that it is a list containing:
 *
 *      "Catpurrnicus", "Shakespaw", "Emily Lickinson", and "Oedipuss"
 *
 * Update the variable `catNamesLength` so that `0` is replaced with the number of names in catNames.
 *
 * Don't just hardcode the number 4.
 */

val catNames: List<Any> = listOf()

val catNamesLength = 0

println("The shortlist of cat names contains ${catNamesLength} names:")
println(catNames)

/* INTRODUCTION TO LISTS: PART 2
 * -----------------------------
 *
 * Add a type signature to petNames.
 *
 * Create a sublist [Cat names, [Catpurnicus, Shakespaw, ...]] in petNames.
 *
 *  HINT: use the `catNames` variable.
 */

val petNames = listOf(
    // TODO: Create a new sublist here
    listOf("Dog names", listOf("Bark Wahlberg", "Droolius Caesar", "Dogstoyevsky", "Jack Spaniels")),
    listOf("Rabbit names", listOf("David Hasselhop", "Rabbit De Niro")),
    listOf("Duck names", listOf("Eggamemnon", "Wingston Churchbill")),
)

/* <<< DO NOT EDIT THIS CODE >>> */
println("\nThe list of pet names includes:")
petNames.forEach { sublist -> sublist.printPets() }
