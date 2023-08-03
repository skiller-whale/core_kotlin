package com.skillerwhale.main

import java.time.LocalDate
import kotlin.random.*
import java.util.Scanner

val current = LocalDate.now()

fun main() {
	val name: String = "Skiller Whale"
	println("Hello ${name}.\nThe current date is: ${current}.")
	println("Time to play a guessing game.")
	guessNumber()
}

fun guessNumber() {
	val random = (1..10).random()
	print("Enter a number between 1 and 10: ")
	var guess: Int = Scanner(System.`in`).nextInt()
	if (random == guess) {
		println("Congratulations! You correctly guessed $guess")
	} else {
		println("Sorry, the number was ${random}. Try again?")
	}
}

