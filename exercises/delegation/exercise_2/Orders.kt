package table.orders

import java.io.File
import java.nio.file.Paths
import java.time.LocalDate
import java.util.Hashtable

/* Exercise 2: Delegation
 * ----------------------
 *
 * Instead of inheriting from Hashtable, Order should accept a MutableMap as a
 * constructor parameter, with a default value of `Hashtable()`.
 *
 * The Orders class should then delegate its operations to the MutableMap
 * instance, rather than overriding inherited methods.
 *
 *
 *  Note: Don't worry about delegating any map operations other than `put` and
 *        `putAll`. This will be covered in a later exercise.
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
        path.appendText("-- Quantity: ${order.second}".padEnd(20))
        path.appendText("-- ${LocalDate.now()}".padEnd(8))
    }

    fun clearLogs() { logPath.writeText("-- Skiller Whale --") }
}
