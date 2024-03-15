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
    print(">> ")

    // TODO: update this code to use `readlnOrNull()` then
    // build a call chain with `let` that also handles the nullability
    val input = readln().run { this.replace("\\s".toRegex(), "") } // Remove whitespace
    searchLog("weather-${input}.log") // Search for weather
    lookLogs()
}

// Search logs for some weather data
fun searchLog(logFileName: String) {
    val path    = Paths.get("").toAbsolutePath().toString()
    val logPath = "${path}/logs"
    File("${logPath}/${logFileName}").forEachLine { println(it) }
}
