package com.noovosoft.training.tddjavacrash.lab1

fun fizzBuzz(number: Int): Any {
    return if (number % 15 == 0) "FizzBuzz"
    else if (number % 3 == 0) "Fizz"
    else if (number % 5 == 0) "Buzz"
    else number
}