import data.csvparser.*
import data.employee.*

/* Exercise 2: Map and FlatMap
 * ---------------------------
 *
 * Suppose you have a list of `Employee`s (deserialised from some CSV).
 *
 * Define the `sumSales()` function using a map function and without using
 * any loop. This should take an input list of employees and calculate the
 * total value of their sales.
 *
 * Hint: you may also use `unzip()` and `sum()`.
 */

fun main() {
    val parser    = CsvParser()
    val csvTable  = parser.parseToTable("employee-sales.csv")
    val employees = csvTable.map(Employee.Converter::toEmployee)

    println("Total value of quarterly sales:")
    println("-------------------------------")
    sumSales(employees).also { println("£${it}") }
}

// TODO: define the `sumSales()` function without using a loop
