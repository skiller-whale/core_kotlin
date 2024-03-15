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

    // Get a sequence of lines that are read from the console
    // until `null` is returned. These are transformed to a list
    // so that `readInput` can be mapped over each input string
    generateSequence(::readLine)
      .let { seq -> seq.toList() }
      .map { str -> readInput(str) }
    lookLogs()
}

fun readInput(input: String?) =
    input?.let {
        when {
            it.isEmpty() -> lookLogs() // Loop back
            it.isBlank() -> lookLogs() // Loop back
            else         -> { searchLog("weather-${it}.log") }
        }
    }


// Search logs for some weather data
fun searchLog(logFileName: String) {
    val path    = Paths.get("").toAbsolutePath().toString()
    val logPath = "${path}/logs"
    File("${logPath}/${logFileName}").forEachLine { println(it) }
}

// Log a user's input to the weather REPL
public fun logInput(input: List<String?>) {
    val path = Paths.get("").toAbsolutePath().toString()
    val dest = File("${path}/logs/user-input.log")
    input.forEach { it?.let { dest.appendText("$it\n") } }
}
