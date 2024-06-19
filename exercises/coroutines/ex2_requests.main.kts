// The fake_requests module is used to fake slow web requests
@file:Import("fake_requests.kts")
import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

/**
EXERCISE 2 - REQUESTS
================================

The code in `fake_requests.kts` defines a function that retrieves data from a URL.
It currently only supports the url `http://shakespeare.com/quote` and returns a single Shakespeare quote. 
It simulates a real-world URL delay (between 1 and 2 seconds).

    ```
    suspend fun get(url: String): String;
    ```

There's an example usecase below.
You will now refactor this code to use suspending functions.

* Define a function called `printQuote`. It should call `get` and print the quote appropriately.
* Define a function called `main`. It should run `10` coroutines that call `printQuote`.

* Once done with the above, have a single call to `main` at the end of this file:

    ```
    val totalTime = measureTimeMillis { main() }
    println("All done in ${totalTime}s")
    ```
**/

val totalTime = measureTimeMillis {
    runBlocking {
        launch {
            val quote = get("http://shakespeare.com/quote")
            println(quote)
        }
    }
}

println("All done in ${totalTime}s")
