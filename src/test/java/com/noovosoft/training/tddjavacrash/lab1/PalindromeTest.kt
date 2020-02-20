package com.noovosoft.training.tddjavacrash.lab1

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class PalindromeTest {
    @ParameterizedTest
    @MethodSource("palindromes")
    fun `Given string is a palindrome`(input: String) {
        assertTrue(isPalindrome(input))
    }

    @ParameterizedTest
    @MethodSource("not palindromes")
    fun `Given string is not a palindrome`(input: String) {
        assertFalse(isPalindrome(input))
    }

    companion object {
        @JvmStatic
        fun palindromes() = listOf("", "a", "Aa", "c!@iv(&i.c,", "A dog! A panic in a pagoda.", "A car, a man, a maraca.")

        @JvmStatic
        fun `not palindromes`() = listOf("dsf", "sda")
    }
}
