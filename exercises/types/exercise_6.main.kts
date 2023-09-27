package org.sudoku

/* SUDOKU
 * ------
 *
 * The following code is designed to validate a Sudoku grid.
 * A grid is valid if it has no duplicate values in any rows, columns, or boxes.
 *
 * Look at the type for each documented function.
 * Try to define some type aliases to make this code more readable.
 * You don't need to understand how these functions work.
 */

// TODO: define your type aliases here

val BOXSIZE: Int = 3             // A box is 3x3
val GRIDSIZE: Int = BOXSIZE * 3  // A grid is 9x9

/**
  * Validate a grid by checking there are no duplicate values in any rows, columns, or boxes.
  *
  * @param a grid, which is a list of rows of values
  * @return a Boolean (e.g., true if the grid is valid)
  */
fun valid(grid: List<List<Char>>) = rows(grid).all { noDuplicates(it) } &&
                                    cols(grid).all { noDuplicates(it) } &&
                                    boxs(grid).all { noDuplicates(it) }

/**
  * Check whether a list of values has any duplicates.
  *
  * @param a list of values (e.g., a row, a column, or a box)
  * @return a Boolean (e.g., true if the list has no duplicates)
  */
fun noDuplicates(list: List<Char>): Boolean {
    val noDots = list.filter { it != '.' }
    return noDots.size == (noDots.toSet()).size
}

/**
  * An example Sudoku grid.
  * This is a list of rows of values, and each Char is a value.
  */
val grid: List<List<Char>> = listOf(
    listOf('2','.','.','.','.','1','.','3','8'),
    listOf('.','.','.','.','.','.','.','.','5'),
    listOf('.','7','.','.','.','6','.','.','.'),
    listOf('.','.','.','.','.','.','.','1','3'),
    listOf('.','9','8','1','.','.','2','5','7'),
    listOf('3','1','.','.','.','.','8','.','.'),
    listOf('9','.','.','8','.','.','.','2','.'),
    listOf('.','5','.','.','6','9','7','8','4'),
    listOf('4','.','.','2','5','.','.','.','.'),
)

/**
  * A function to print a Sudoku grid.
  *
  * @param a grid
  */
fun printGrid(grid: List<List<Char>>) {
    (grid.indices).forEach { i ->
        (grid.indices).forEach { j -> print(grid[i][j].toString().plus(" ")) }
        println()
    }
    println()
}

// ====================================================================================
// <<< DO NOT EDIT THIS CODE >> //
// ====================================================================================

fun transpose(grid: List<List<Char>>) = (grid[0].indices).map { i -> (grid.indices).map { j -> grid[j][i] } }

fun transform(grid: List<List<Char>>) = grid.map { it.chunked(BOXSIZE) }.map { cols(it) }.flatten()

fun terraform(xs: List<List<Char>>) = xs.chunked(GRIDSIZE).map { cols(it) }.flatten()

val rows = { grid: List<List<Char>> -> grid }                       // Get rows from grid
val cols = { grid: List<List<Char>> -> transpose(grid) }            // Get columns from grid
val boxs = { grid: List<List<Char>> -> terraform(transform(grid)) } // Get boxes from grid

printGrid(grid)
val validGrid = if (valid(grid)) "Sudoku grid is valid" else "Sudoku grid is not valid!"
println(validGrid)
