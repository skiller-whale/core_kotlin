// <<< DO NOT EDIT THIS CODE >> //
import table.orders.*

import java.util.Hashtable

fun main() {
    val ordersTable = Orders(Hashtable<String, Int>())
    ordersTable.clearLogs()

    // Add and log some individual orders
    ordersTable.put("Table", 1)
    ordersTable.put("Chair", 1)

    // Add and log a group of orders
    ordersTable.putAll(mapOf(
        "Hoover" to 1,
        "Leafblower" to 1,
        "Cement" to 2))
}
