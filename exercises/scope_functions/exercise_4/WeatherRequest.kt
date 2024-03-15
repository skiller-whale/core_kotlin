/* <<< DO NOT EDIT THIS CODE >>>> */
/* This class simulates requests to a website which returns some weather data */

package weatherrequest

import java.util.Random
import java.time.LocalDate
import java.util.concurrent.ThreadLocalRandom

public class WeatherRequest {
    private val expectedURL: String = "http://weather.com/"

    // Simulate getting some weather forecast for a city
    public fun getTemperature(city: String): Int {
        println("Getting forecast for $city from ${expectedURL}...")
        return (0..40).random()
    }

    public fun isValid(date: LocalDate): Boolean {
        val startDate   = LocalDate.parse("2024-01-01")
        val endDate     = LocalDate.parse("2072-12-31")
        val isDateValid = !(date.isBefore(startDate) || date.isAfter(endDate))
        return isDateValid
    }

    // Could simplify this using `with`?
    public fun createRandomDate(startYear: Int, endYear: Int): LocalDate {
        val day: Int   = ThreadLocalRandom.current().nextInt(1, 29);
        val month: Int = ThreadLocalRandom.current().nextInt(1, 13);
        val year: Int  = ThreadLocalRandom.current().nextInt(startYear, endYear + 1);
        return LocalDate.of(year, month, day);
    }
}
