package org.example

// File: MathUtils.kt
fun addNumbers(a: Int, b: Int): Int {
    return a + b
}

fun subtractNumbers(a: Int, b: Int): Int {
    return a - b
}

// File: MathUtilsTests.kt
fun main() {
    testAddNumbers()
}

private fun testAddNumbers() {
    // Test case 1: Positive numbers
    val result1 = addNumbers(2, 3)
    if (result1 != 5) {
        println("FAIL: 2 + 3 should be 5 but got $result1")
    } else {
        println("PASS: 2 + 3 = 5")
    }

    // Test case 2: Negative numbers
    val result2 = addNumbers(-1, -1)
    if (result2 != -2) {
        println("FAIL: -1 + -1 should be -2 but got $result2")
    } else {
        println("PASS: -1 + -1 = -2")
    }

    // Test case 3: Zero
    val result3 = addNumbers(0, 0)
    if (result3 != 0) {
        println("FAIL: 0 + 0 should be 0 but got $result3")
    } else {
        println("PASS: 0 + 0 = 0")
    }

    val sub1 = subtractNumbers(2, 3)
    println("sub1 $sub1")

    val sub2 = subtractNumbers(-1, -1)
    println("sub2 $sub2")

    val sub3 = subtractNumbers(0, 0)
    println("sub3 $sub3")
}