package com.skillerwhale.main

import java.util.Calendar

fun main() {
	printGreeting()
}

fun greeting() {
    var name: Char = "Skiller Whale"
    val now: Calendar = Calendar.getInstance()
    val time: Int = now.getTimeInMillis()
	println("Hello ${name}.\nThe current time in milliseconds is: ${time}.")
}

