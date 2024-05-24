package table.orders

import table.forwarding.*

import java.io.File
import java.nio.file.Paths
import java.time.LocalDate
import java.util.Hashtable

/* Exercise 2: Delegation
 * ----------------------
 *
 * Define a wrapper class `ForwardingTable<K, V>` that extends
 * the `MutableMap<K, V>` interface. This should use a Java hashtable
 * instance as a delegate.
 *
 * The `Orders` class can then inherit from the forwarding class.
 */

class Orders : Hashtable<String, Int>() {
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
