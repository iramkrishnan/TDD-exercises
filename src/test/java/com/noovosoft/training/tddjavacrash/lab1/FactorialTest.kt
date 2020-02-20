package com.noovosoft.training.tddjavacrash.lab1

import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals

class FactorialTest {
    @Test
    fun `Factorial of 0 is 1`() {
        assertEquals(1, factorial(0))
    }

    @ParameterizedTest
    @MethodSource
    fun `Factorial of a natural number`(inputNumber: Long, expected: Long) {
        assertEquals(expected, factorial(inputNumber))
    }

    @ParameterizedTest
    @MethodSource
    fun `Factorial of a negative number is invalid`(inputNumber: Long, expected: Long) {
        assertEquals(expected, factorial(inputNumber))
    }

    companion object {
        @JvmStatic
        fun `Factorial of a natural number`(): Stream<Arguments> =
                Stream.of(
                        Arguments.of(14, 87178291200),
                        Arguments.of(4, 24)
                )

        @JvmStatic
        fun `Factorial of a negative number is invalid`(): Stream<Arguments> =
                Stream.of(
                        Arguments.of(-3, -1),
                        Arguments.of(-123, -1)
                )
    }
}
