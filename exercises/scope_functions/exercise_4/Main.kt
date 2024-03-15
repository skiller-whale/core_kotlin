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

// TODO: use `also` to add logging to this call chain
tailrec fun lookLogs() {
    println("\nEnter a city to view its weather forecast.")
    print(">> ")
    readlnOrNull()
      ?.let { it.replace("\\s".toRegex(), "") }
      .run { searchLog("weather-${this}.log")  }
    lookLogs()
}

// Search logs for some weather data
fun searchLog(logFileName: String) {
    val path    = Paths.get("").toAbsolutePath().toString()
    val logPath = "${path}/logs"
    File("${logPath}/${logFileName}").forEachLine { println(it) }
}

// Log a user's input to the weather REPL
public fun logInput(input: String) {
    val path = Paths.get("").toAbsolutePath().toString()
    val dest = File("${path}/logs/user-input.log")
    dest.appendText("$input\n")
}
