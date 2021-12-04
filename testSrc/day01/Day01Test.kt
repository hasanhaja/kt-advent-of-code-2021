package day01

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Day01Test {
    @Test
    fun testSum() {
        val expected = 42
        assertEquals(expected, 40+2)
    }

    @Test
    fun `should also pass`() {
        assertEquals(2, 2)
    }
}
