package table.orders

import java.io.File
import java.nio.file.Paths
import java.time.LocalDate
import java.util.Hashtable

/* Exercise 3: Delegation using the `by` Keyword
 * ---------------------------------------------
 *
 * The Orders class below uses a `MutableMap` instance to store orders, and
 * logs whenever the put and putAll functions are called. However, it does not
 * implement any of the other functionality of a MutableMap, such as item
 * retrieval or iteration.
 *
 * If you run the code in `Main.kt`, you'll see that this causes errors.
 *
 * Make `Orders` implement the `MutableMap` interface through delegating to its
 * `map` property. Check that the code now runs successfully.
 */


class Orders(private val map: MutableMap<String, Int> = Hashtable()) {
    private val path    = Paths.get("").toAbsolutePath().toString()
    private val logPath = File("${path}/logs/orders.log")

    fun put(key: String, value: Int): Int? {
        logOrder(logPath, key to value)
        return map.put(key, value)
    }

    fun putAll(from: Map<out String, Int>) {
        from.forEach { k, v -> logOrder(logPath, k to v) }
        map.putAll(from)
    }

    private fun logOrder(path: File, order: Pair<String, Int>) {
        path.appendText("\nOrder: ${order.first}".padEnd(20))
        path.appendText("-- Quantity: ${order.second}".padEnd(20))
        path.appendText("-- ${LocalDate.now()}".padEnd(8))
    }

    fun clearLogs() { logPath.writeText("-- Skiller Whale --") }
}
