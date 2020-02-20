package com.noovosoft.training.tddjavacrash.lab1

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class InputOutputData(val expectedObject: Aggregate, vararg val numbers: Float)

class TestAggregateFunction {
    @ParameterizedTest
    @MethodSource("Provide input array to test")
    fun `Aggregate of some numbers`(argument: InputOutputData) {
        assertEquals(argument.expectedObject, aggregateOperations(*argument.numbers))
    }

    companion object {
        @JvmStatic
        fun `Provide input array to test`() = listOf<InputOutputData>(
                InputOutputData(Aggregate(1.0f, 1.0f, 1.0f, 1), 1.0f),
                InputOutputData(Aggregate(1.0f, 1.0f, 1.0f, 2), 1.0f, 1.0f),
                InputOutputData(Aggregate(5.0f, 8.0f, 6.5f, 4), 5.0f, 6.0f, 7.0f, 8.0f)
        )
    }
}
