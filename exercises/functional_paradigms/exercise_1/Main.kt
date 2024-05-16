import data.csvparser.*
import data.utility.*

import kotlin.math.round

/* Exercise 1: Zip and Unzip
 * -------------------------
 *
 * Use `zip()` to build a new column using the existing columns
 * in the variables `q1`, `q2`, `q3`, `q4`, and `rates`.
 *
 * The commission for an employee is calculated by adding their
 * quarterly sales and then multiplying the total by their commission rate.
 */

fun main() {
    val parser   = CsvParser()
    val csvTable = parser.parseToTable("employee-sales.csv")
    val columns  = parser.getColumns(csvTable)

    // Get quarterly sales data and commission rates
    // as values of type `Double` from the CSV table
    val (q1, q2, q3, q4, rates) = columns.getSalesData()

    // TODO: use `zip()` to define a `commissions` variable.
    // This should be like a 'Commission' column in the table

    println("Employee Commission Earnings:")
    println("-----------------------------")
    val employeeCommissions = columns[0].zip(commissions)
    employeeCommissions.forEach { println("${it.first}: £${round(it.second)}") }
}
