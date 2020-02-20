package com.noovosoft.training.tddjavacrash.lab1

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals

class PrimeFactorsTest {
    @ParameterizedTest
    @MethodSource("Candidates for prime factors")
    fun `Prime factors of given numbers`(expected: List<Int>, number: Int) {
        assertEquals(expected, primeFactors(number))
    }

    companion object {
        @JvmStatic
        fun `Candidates for prime factors`(): Stream<Arguments> =
                Stream.of(
                        Arguments.of(listOf<Int>(), -5),
                        Arguments.of(listOf<Int>(), 0),
                        Arguments.of(listOf(3, 5), 15),
                        Arguments.of(listOf(2, 2, 3), 12),
                        Arguments.of(listOf(3, 7, 7), 147)
                )
    }
}
