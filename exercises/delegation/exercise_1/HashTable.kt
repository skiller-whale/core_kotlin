import java.io.File
import java.nio.file.Paths
import java.time.LocalDate
import java.util.Hashtable

/* Exercise 1: Implementation Inheritance
 * --------------------------------------
 *
 * If you run this code, you'll see that each order is logged twice.
 * Why is this? Is this a problem with implementation inheritance?
 */

// The `Orders` class is as a wrapper around a `Hashtable<String, Int>`. It is
// designed to add logging functionality to the `put()` and `putAll()` functions
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
        path.appendText("-- Quantity: ${order.second}".padEnd(20))
        path.appendText("-- ${LocalDate.now()}".padEnd(8))
    }

    fun clearLogs() { logPath.writeText("-- Skiller Whale --") }
}
