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
    // TODO: use `run` to simplify the calls to `logTemperature()`
    val weatherLogger = WeatherLogger()
    cities.map { city -> weatherLogger.logTemperature(city) }

    lookLogs()
}

tailrec fun lookLogs() {
    println("\nEnter a city to view its weather forecast.")
    print(">> ")
    readLine().let { searchLog("weather-${it}.log") }
    lookLogs()
}


fun searchLog(logFileName: String) {
    val path    = Paths.get("").toAbsolutePath().toString()
    val logPath = "${path}/logs"
    File("${logPath}/${logFileName}").forEachLine { println(it) }
}
