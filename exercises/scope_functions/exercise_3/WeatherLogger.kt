package weatherlogger

import city.*
import weatherrequest.*

import java.time.LocalDate
import java.io.File
import java.nio.file.Paths

class WeatherLogger {
    private val path = Paths.get("").toAbsolutePath().toString()

    private fun generateLogPath(city: String) = File("${path}/logs/weather-${city}.log")

    private fun addTemperature(path: File, city: City) {
        path.writeText("Predicted temperature for ${city.name} at ${city.date}: ${city.temperature}\u00B0C")
    }

    // Write random temperature forecast
    public fun logTemperature(city: String) {
        val weather = City(city)
        val logPath = generateLogPath(city)
        addTemperature(logPath, weather)
    }
}
