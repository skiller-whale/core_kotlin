// <<< DO NOT EDIT THIS CODE >> //
package data.utility

// Enable lists to be de-structured into six components
operator fun <T> List<T>.component6() = this[5]

// Get the sales columns and converts to `Double` values
fun List<List<String>>.getSalesData(): List<List<Double>> {
    require(this.size >= 6)
    return this.slice(1..5).map { it.map { it.toDouble() } }
}
