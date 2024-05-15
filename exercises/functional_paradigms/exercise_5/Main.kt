import data.csvparser.*
import data.employee.*

/* Exercise 5: Fold
 * ----------------
 *
 * Implement the `getQuarterlyIncrements()` function using a fold.
 * This should take an `Employee` and return a list that adds each
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

    employees.slice(0..3).forEach { employee ->
        print("${employee.name} quarterly sales: ")
        getQuarterlyIncrements(employee).also(::println) }
}

// TODO: define the `getQuarterlyIncrements()` function
