package day01

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Day01Tests {
    private val measurements = listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)
    private val transformedMeasurements = listOf(607, 618, 618, 617, 647, 716, 769, 792)

    @Test
    fun `should transform measurements`() {
        assertEquals(transformedMeasurements, transformToSlidingMeasurements(measurements))
    }

    @Test
    fun `should measure 7 increases`() {
        assertEquals(7, countIncreases(measurements))
    }

    @Test
    fun `should transform measurements to smaller list`() {
        assertEquals(8, transformToSlidingMeasurements(measurements).size)
    }

    @Test
    fun `should measure 5 increases`() {
        assertEquals(5, countSlidingIncreases(measurements))
    }
}
