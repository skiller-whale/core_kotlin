import weatherlogger.*

import java.io.File
import java.nio.file.Paths

fun main() {
    val cities = listOf(
        "London",
        "Boston",
        "Berlin",
        "Madrid",
        "Tokyo",
        "Seoul",
        "Prague",
        "Kyoto",
    )
    WeatherLogger().run {
        cities.map { city -> logTemperature(city) }
    }
    lookLogs()
}

tailrec fun lookLogs() {
    println("\nEnter a city to view its weather forecast.")
    println("You can enter multiple cities on new lines, then search using:")
    println("  - 'Ctrl+D' (macOs and Linux)")
    println("  - 'Ctrl+X' then 'Return' (Windows)")
    print(">> ")
    generateSequence(::readLine)
      .let { seq -> seq.toList() }
      .map { str -> readInput(str) }
    lookLogs()
}

// TODO: define the `readInput()` function and use `let` to
// handle the nullability of the input String for `searchLog`
fun readInput(input: String?) = TODO("Not implemented")


// Search logs for some weather data
fun searchLog(logFileName: String) {
    val path    = Paths.get("").toAbsolutePath().toString()
    val logPath = "${path}/logs"
    File("${logPath}/${logFileName}").forEachLine { println(it) }
}
