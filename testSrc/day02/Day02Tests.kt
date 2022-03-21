package day02

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Day02Tests {
    private val course = listOf("forward 5", "down 5", "forward 8", "up 3", "down 8", "forward 2")

    @Test
    fun `should multiply to 150`() {
        val horizontal = 10
        val depth = 150
        assertEquals(150, horizontal*depth)
    }
}