package com.noovosoft.training.tddjavacrash.lab1

fun factorial(number: Long): Long {
    return if (number == 0L) 1
    else if (number < 0) -1
    else number * factorial(number - 1)
}
