package com.noovosoft.training.tddjavacrash.lab1

val NOT_WORD_CHARS = Regex("\\W+")

fun isPalindrome(userInput: String): Boolean {
    val processedInput = userInput.replace(NOT_WORD_CHARS, "").toLowerCase()
    return processedInput == processedInput.reversed()
}
