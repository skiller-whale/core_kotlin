package city

import weatherrequest.*

class City(val name: String = "") {

    private val weatherRequest = WeatherRequest()

    val temperature = weatherRequest.getTemperature(name)

    // TODO: use `run` to simplify the definition of `date`, and define `date` without
    // introducing the new `randomDate` variable
    private val randomDate = weatherRequest.createRandomDate(2024, 2072)
    val date = if (weatherRequest.isValid(randomDate)) randomDate else error("Date not valid")
}
