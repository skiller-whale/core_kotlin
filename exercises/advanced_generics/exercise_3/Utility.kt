// <<< DO NOT EDIT THIS CODE >> //
package money.utility

import money.currency.*

/* This package defines some utility functions to convert between currencies.
 * The `lookupConversion()` function only simulates a conversion rate and is
 * not accurate.
 */

fun interface Converter<K> {
    fun convert(from: Money): K
}

val gbpConverter: Converter<GBP> = Converter { from: Money ->
    val conversionRate = lookupConversion(from, GBP())
    GBP(from.amount * conversionRate)
}

val usdConverter: Converter<USD> = Converter { from: Money ->
    val conversionRate = lookupConversion(from, USD())
    USD(from.amount * conversionRate)
}

val jpyConverter: Converter<JPY> = Converter { from: Money ->
    val conversionRate = lookupConversion(from, JPY())
    JPY(from.amount * conversionRate)
}

// Simulate a request to get the conversion rate between two currencies
fun lookupConversion(from: Money, to: Money): Int {
    println("Getting conversion from ${from.type} to ${to.type}...")
    return (0..8).random()
}
