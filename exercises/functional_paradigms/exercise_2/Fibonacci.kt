package functions.fibonacci

// This package defines recursive and tail recursive Fibonacci functions
// There is also a decorator to measure how long a function takes to run

// Recursive Fibonacci Function
fun fib(num: Long): Long {
    return when (num) {
        0L   -> 0L
        1L   -> 1L
        else -> (fib (num - 1L)) + (fib (num - 2L))
    }
}

// Tail Recursive Fibonacci Function
// TODO: add the `tailrec` optimisation
fun tailFib(num: Long, a: Long = 0L, b: Long = 1L): Long {
    return when (num) {
        0L   -> a
        else -> tailFib(num - 1L, b, a + b)
    }
}

// Decorator to measure time for a function
fun <T> measureTime(func: (Long) -> T): (Long) -> String {
    return { num: Long ->
      val start  = System.currentTimeMillis()
      val result = func(num)
      val total  = System.currentTimeMillis() - start
      "$result (Time: $total milliseconds)"
    }
}
