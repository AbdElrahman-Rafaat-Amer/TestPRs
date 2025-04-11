package org.example.test

import org.example.MathUtils

fun main() {
    val mathUtils = MathUtils()

    testAddNumbers(mathUtils)
    testSubtractNumbers(mathUtils)
}

fun assertEquals(expected: Any, actual: Any, message: String = "") {
    if (expected != actual) {
        throw AssertionError("FAIL: $message. Expected $expected but got $actual")
    }
    println("PASS: $message")
}

private fun testAddNumbers(mathUtils: MathUtils) {
    assertEquals(500, mathUtils.addNumbers(2, 3), "Adding positive numbers")
    assertEquals(-2, mathUtils.addNumbers(-1, -1), "Adding negative numbers")
    assertEquals(0, mathUtils.addNumbers(0, 0), "Adding zeros")
}

private fun testSubtractNumbers(mathUtils: MathUtils) {
    assertEquals(-1, mathUtils.subtractNumbers(2, 3), "Subtract positive numbers")
    assertEquals(0, mathUtils.subtractNumbers(-1, -1), "Subtract negative numbers")
    assertEquals(0, mathUtils.subtractNumbers(0, 0), "Subtract zeros")
}