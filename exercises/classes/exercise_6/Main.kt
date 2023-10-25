/* Exercise 6: Data Classes
 * ------------------------
 *
 * The `Album` class is used to represent individual copies of CDs in the online store.
 *
 * 1. Add a `pricePence` property of type Int to the Album constructor and update `equals()`.
 * 2. Re-write this code to use a data class to generate an `equals()` method.
 * 3. Run the code to check it is working properly.
 * 4. Add a `productID` property to the class outside of the primary constructor.
 *    This should just be a random number.
 *    Hint: you can generate this with `java.util.Random().nextInt(1000, 9999)`.
 * 5. Run the code to check it is still working as intended. If not, why?
 */

fun main() {
    val item1 = Album("In the Court of the Crimson Fin", "Fin Crimson" 799)
    val item2 = Album("Cod A", "Radiohead", 1199)
    val item3 = Album("Mezzanine", "Massive Attack", 999)
    val item4 = Album("Cod A", "Radiohead", 1199)
    val item5 = Album("Siamese Bream", "The Smashing Pumpkins", 1099)

    // <<< DO NOT EDIT THIS CODE >>> //
    assert(!(item1.equals(item4)))
    assert(!(item2.equals(item4)))
    assert(!(item3.equals(item5)))
    assert(item5.equals(item5))
}

data class Album(
    val title: String,
    val artist: String,
    // TODO: define a `pricePence` property
) {
    // TODO: define a `productID` property

    // TODO: update this method to check the `pricePence` property
    fun equals(album: Album): Boolean {
        return this.title  == album.title &&
               this.artist == album.artist &&
    }
}
