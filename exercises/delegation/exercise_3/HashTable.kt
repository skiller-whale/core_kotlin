package table.orders

import table.forwarding.*

import java.io.File
import java.nio.file.Paths
import java.time.LocalDate
import java.util.Hashtable

/* Exercise 3: Delegation using the `by` Keyword
 * ---------------------------------------------
 *
 * Update the forwarding table to use automatic delegation.
 * This should reduce the boilerplate in your code.
 *
 * Hint: you may also need to update the constructor for
 * the `Orders` class.
 */

class Orders : ForwardingTable<String, Int>() {
    private val path    = Paths.get("").toAbsolutePath().toString()
    private val logPath = File("${path}/logs/orders.log")

    override fun put(key: String, value: Int): Int? {
        logOrder(logPath, key to value)
        return super.put(key, value)
    }

    override fun putAll(from: Map<out String, Int>) {
        from.forEach { k, v -> logOrder(logPath, k to v) }
        super.putAll(from)
    }

    private fun logOrder(path: File, order: Pair<String, Int>) {
        path.appendText("\nOrder: ${order.first}".padEnd(20))
        path.appendText("-- Quantity: ${order.second}".padEnd(10))
        path.appendText("-- ${LocalDate.now()}".padEnd(8))
    }

    fun clearLogs() { logPath.writeText("-- Skiller Whale --") }
}
