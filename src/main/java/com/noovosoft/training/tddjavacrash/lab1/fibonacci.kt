package com.noovosoft.training.tddjavacrash.lab1

fun fibonacciRecursive(number: Int): Int {
    return if (number == 0 || number == 1) number
    else fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2)
}

fun fibonacciIterative(number: Int): Int {
    var current = 0
    var next = 1
    for (i in 1..number) {
        val prev = current
        current = next
        next = prev + current
    }
    return current
}


