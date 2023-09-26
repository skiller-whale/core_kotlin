package org.types

/* Declaring and Initialising Variables
 * ------------------------------------
 *
 * Run this code, and look at the compilation errors.
 * Define and initialise the missing variables so that the code
 * compiles and runs. Their values are specified by the expected output.
 */

// TODO: define and initialise the missing variables

// <<< DO NOT EDIT THIS CODE >>> //
val words = mutableListOf<String>("Seriously", "Honestly", "Fundamentally")
words.add(question)
question = words.joinToString(separator = ", ")
val secret = Pair(question, answer)
println("Question: ${secret.first}")
println("Answer: ${secret.second} (${isCorrect})")
