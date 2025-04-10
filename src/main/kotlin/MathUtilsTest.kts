import org.example.addNumbers
import org.example.subtractNumbers

fun runAllTests() {
    val tests = listOf(
        ::testAddNumbers,
        ::testSubtractNumbers,
    )

    tests.forEach { test ->
        println("\nRunning ${test.name}")
        test()
    }
}

fun main() = runAllTests()

fun assertEquals(expected: Any, actual: Any, message: String = "") {
    if (expected != actual) {
        throw AssertionError("FAIL: $message. Expected $expected but got $actual")
    }
    println("PASS: $message")
}

private fun testAddNumbers() {
    assertEquals(5, addNumbers(2, 3), "Adding positive numbers")
    assertEquals(-2, addNumbers(-1, -1), "Adding negative numbers")
    assertEquals(0, addNumbers(0, 0), "Adding zeros")
}

private fun testSubtractNumbers() {
    assertEquals(-1, subtractNumbers(2, 3), "Adding positive numbers")
    assertEquals(0, subtractNumbers(-1, -1), "Adding negative numbers")
    assertEquals(0, subtractNumbers(0, 0), "Adding zeros")
}