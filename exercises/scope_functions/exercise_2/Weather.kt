package city

import weatherrequest.*

class City(val name: String = "") {

    private val randomDate = WeatherRequest().createRandomDate(2024, 2072)

    // TODO: simplify this definition, and remove the separate definition for `randomDate`, using `run`
    val date = if (WeatherRequest().isValid(randomDate)) randomDate else error("Date not valid")

    val temperature = WeatherRequest().getTemperature(name)
}
