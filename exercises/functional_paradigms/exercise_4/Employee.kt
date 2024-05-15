// <<< DO NOT EDIT THIS CODE >> //
package data.employee

class Employee(
    val name: String,
    val sales: List<Sales>,
    val commissionRate: Double,
) {
    // Construct a class instance from a comma-separated `String` value
    companion object Converter {
        fun toEmployee(input: String): Employee {
            val (name, q1, q2, q3, q4, rate) = input.split(",")
            return Employee(
                name,
                listOf(Quarter.Q1 to q1.toDouble(),
                       Quarter.Q2 to q2.toDouble(),
                       Quarter.Q3 to q3.toDouble(),
                       Quarter.Q4 to q4.toDouble(),
                ),
                rate.toDouble(),
            )
        }
    }
}

// A quarter and the total value of sales for that quarter
typealias Sales = Pair<Quarter, Double>

enum class Quarter {
    Q1, Q2, Q3, Q4
}

operator fun <T> List<T>.component6() = this[5]
