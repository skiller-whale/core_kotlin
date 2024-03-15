package city

import weatherrequest.*

class City(val name: String = "") {

    // Generate a random weather date
    val date = WeatherRequest().run {
        val randomDate = createRandomDate(2024, 2072)
        if (isValid(randomDate)) randomDate else error("Date not valid")
    }

    val temperature = WeatherRequest().getTemperature(name)
}
