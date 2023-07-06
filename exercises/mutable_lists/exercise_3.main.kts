@file:Import("utilities.main.kts")

/* SUBLISTS AND MUTABILITY: PART 1
 * -------------------------------
 *
 * The code below defines a MutableList that stores some data on quarterly album sales for a record store.
 *
 *  1. Implement the `getTopFive` function to return the five best-selling albums from `quarterlySalesData`.
 *     Feel free to change its return type if needed.
 */

typealias AlbumData = Pair<String, Int>

// Album titles and the number of sales this quarter
var quarterlySalesData: MutableList<AlbumData> = mutableListOf(
    "Mezzanine" to 236,
    "Cod A" to 304,
    "The Bends" to 188,
    "How it Eels to Be Something On" to 147,
    "Siamese Bream" to 90,
    "Sounds of Seal-ence" to 163,
    "Tranquility Bass Hotel & Casino" to 81,
    "The Whaler" to 79,
    "The Velvet Underwater" to 45,
    "In the Court of the Crimson Fin" to 73,
)

fun getTopFive(sales: MutableList<AlbumData>): MutableList<AlbumData> {
    sales.sortByDescending { it.second } // sort albums by number of units sold

    // TODO: implement the rest of this function
}

/* <<< DO NOT EDIT THIS CODE >>> */
println("Sales Data (sorted descending)")
println("==============================\n")

val topSales = getTopFive(quarterlySalesData)

println("-- Total Album Sales for the Quarter:\n")
printAlbumData(quarterlySalesData)

println("\n-- Best-selling Albums for the Quarter:\n")
printAlbumData(topSales)


/* SUBLISTS AND MUTABILITY: PART 2
 * -------------------------------
 *
 * The following code defines some functions for the record store.
 *
 *  Uncomment the functions and print statements, then:
 *
 *      1. Run this code, then re-write `calculateMonthlyAverages` to fix any bugs identified by the assertion error.
 *
 *         HINT: feel free to change any type signatures. You may also want to edit PART 1 of this exercise.
 *
 *      2. Return to the slide instructions and follow the checklist.
 */

/* <<< TODO: Uncomment this code >>> */

// // Calculate average sales per month in the quarter for each album
// fun calculateMonthlyAverages(sales: MutableList<AlbumData>): MutableList<AlbumData> {
//     sales.forEachIndexed { index, albumData ->
//         sales[index] = albumData.copy(second = albumData.second / 3) }
//     return sales
// }

// fun getAlbumSales(sales: List<AlbumData>, album: String) = sales.filter { it.first == album }

// fun incrementAlbumSales(sales: MutableList<AlbumData>, album: String) {
//     sales.forEachIndexed { index, albumData -> if (albumData.first == album) {
//         sales[index] = albumData.copy(second = albumData.second + 1)
//     }}
// }

// fun estimateAnnualSales(sales: List<AlbumData>) = sales.map { it.first to it.second * 4 }


// /* <<< DO NOT EDIT THIS CODE >>> */
// val monthlyAverageTopFive = calculateMonthlyAverages(getTopFive(quarterlySalesData))
// val monthlyAverages = calculateMonthlyAverages(quarterlySalesData)

// println("\n-- Monthly Averages for Best-sellers:\n")
// printAlbumData(monthlyAverageTopFive)

// println("\n")
// assert(monthlyAverageTopFive == exerciseAnswersBestsellers)
// {"Monthly Averages for Best-sellers is inaccurate for Units sold${averagesAssertionError()}"}
