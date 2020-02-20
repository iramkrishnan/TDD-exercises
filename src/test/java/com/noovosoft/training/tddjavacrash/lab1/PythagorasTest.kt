package com.noovosoft.training.tddjavacrash.lab1

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals

class PythagorasTest {
    @ParameterizedTest
    @MethodSource("Pythagorean triplets")
    fun `Hypotenuse is calculated`(firstSide: Double, secondSide: Double, expected: Double) {
        assertEquals(expected, pythagoras(firstSide, secondSide))
    }

    companion object {
        @JvmStatic
        fun `Pythagorean triplets`() =
                Stream.of(
                        Arguments.of(3, 4, 5),
                        Arguments.of(13, 84, 85),
                        Arguments.of(0, 0, 0),
                        Arguments.of(0, 1, 1),
                        Arguments.of(-3, -4, 5)
                )
    }
}
