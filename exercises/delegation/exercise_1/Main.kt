fun main() {
    val ordersTable = Orders()
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
