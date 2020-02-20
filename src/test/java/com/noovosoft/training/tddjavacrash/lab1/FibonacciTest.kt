package com.noovosoft.training.tddjavacrash.lab1

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals

class FibonacciTest {

    @ParameterizedTest
    @MethodSource("Fibonacci numbers")
    fun `Recursive implementation of fibonacci number shows the respective index`(number: Int, expected: Int) {
        assertEquals(expected, fibonacciRecursive(number))
    }

    @ParameterizedTest
    @MethodSource("Fibonacci numbers")
    fun `Iterative implementation of fibonacci number shows the respective index`(number: Int, expected: Int) {
        assertEquals(expected, fibonacciIterative(number))
    }

    companion object {
        @JvmStatic
        fun `Fibonacci numbers`(): Stream<Arguments> =
                Stream.of(
                        Arguments.of(0, 0),
                        Arguments.of(1, 1),
                        Arguments.of(2, 1),
                        Arguments.of(3, 2),
                        Arguments.of(11, 89),
                        Arguments.of(13, 233)
                )
    }
}
