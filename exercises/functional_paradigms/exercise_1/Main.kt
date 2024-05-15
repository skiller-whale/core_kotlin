import java.io.File
import java.io.File.*
import java.nio.file.*
import java.nio.file.Paths

/* Exercise 1: Recursion
 * ---------------------
 *
 * Write a recursive function `getLogs()` to traverse a directory
 * structure printing the name of any log files
 *
 * Extra: update `getLogs()` so that each recursive function call also
 * builds a `String` of the path taken through the sub-directories. This
 * path should be printed with any log file like "<path>/logs.txt"
 */

fun main() {
    // Get absolute path for current directory
    val path = Paths.get("").toAbsolutePath()

    // TODO: update this function call to `getLogs()`
    getLogsLoop(path.toFile())
}

// TODO: define the recursive function `getLogs()`, which should
// be a non-imperative version of `getLogsLoop()`

fun getLogsLoop(input: File) {
    val stack = mutableListOf<File>()
    stack.add(input)

    // While the stack is not empty, pop the top element
    // If the item is a directory, push the sub-directories onto the stack
    // If the item is a file, print whether it contains logs or not
    while (stack.isNotEmpty()) {
        val item = stack.removeAt(0)
        when {
            (item.isDirectory()) -> {
                item.listFiles().forEach { stack.add(it) }
            }
            (item.isLog()) -> println("Logs: '${item.getName()}'")
            else -> println("No logs in '${item.getName()}'")
        }
    }
}

fun File.isLog(): Boolean {
    return this.getName().contains("logs", ignoreCase = true)
}
