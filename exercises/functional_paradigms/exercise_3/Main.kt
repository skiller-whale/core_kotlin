import data.csvparser.*
import data.employee.*

/* Exercise 3: Fold
 * ----------------
 *
 * 1. Define the `countSales()` function using a fold.
 * This should take a `List<Double>` and a `Double` value and
 * count how many elements in the list are greater than the value.
 *
 * 2. EXTRA: implement the `getQuarterlyIncrements()` function using a fold.
 * This should take an `Employee` and return a List<Double> that adds each
 * adjacent element in the employee's `List<Sales>` from left to right:
 *
 *      [1.0, 2.0, 3.0, 4.0] ==> [1.0, 3.0, 6.0, 10.0]
 *
 * This is useful to get incremental updates for an employee's sales for
 * each quarter, i.e., Q1, then Q1 + Q2, then Q1 + Q2 + Q3, etc.
 *
 * Hint: you might want to define a helper function to pass to the fold.
 */

fun main() {
    val parser    = CsvParser()
    val csvTable  = parser.parseToTable("employee-sales.csv")
    val employees = csvTable.map(Employee.Converter::toEmployee)

    // // TODO: Uncomment this code after defining `countSales()`
    // val (_, values) = employees.flatMap { it.sales }.unzip()
    // val limit       = 34000.00
    // val largeSales  = countSales(values, limit)
    // println("There were $largeSales sales over £$limit")

    // // TODO: Uncomment this code after defining `getQuarterlyIncrements()`
    // employees.slice(0..3).forEach { employee ->
    //     print("${employee.name} incremental sales: ")
    //     getQuarterlyIncrements(employee).also(::println) }
}

// TODO: define the `countSales()` function using `fold()`

// TODO: define the `getQuarterlyIncrements()` function using `fold()`
