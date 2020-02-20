package com.noovosoft.training.tddjavacrash.lab1

data class Aggregate(var min: Float, var max: Float, val average: Float, var count: Int)

fun aggregateOperations(vararg numbers: Float): Aggregate {
    var sumOfNumbers = 0.0f
    val average: Float
    var min = numbers[0]
    var max = numbers[0]
    for (i in numbers) {
        sumOfNumbers += i
        if (i > max)
            max = i
        if (i < min)
            min = i
    }
    average = (sumOfNumbers / numbers.size.toFloat())
    return Aggregate(min, max, average, numbers.size)
}
