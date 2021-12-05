package day01

import parseInputToIntList
import readInput

fun main() {
//    val measurements = listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)

    val input = readInput("Day01")
    val measurements = parseInputToIntList(input)

    val count = countIncreases(measurements)

    println("Count: $count")

    val slidingCount = countSlidingIncreases(measurements)
    println("Count: $slidingCount")
}

enum class Measurement {
    INCREASED, DECREASED, NO_CHANGE
}

fun checkMeasurements(previous: Int, current: Int): Measurement {
    return when {
        previous < current -> Measurement.INCREASED
        previous > current -> Measurement.DECREASED
        else -> Measurement.NO_CHANGE
    }
}

fun analyzeMeasurements(measurements: List<Int>): List<Measurement> =
    List(measurements.size) {
            index -> if(index == 0) Measurement.NO_CHANGE else checkMeasurements(measurements[index-1], measurements[index])
    }

fun countIncreases(measurements: List<Int>): Int =
    analyzeMeasurements(measurements).count { it == Measurement.INCREASED }

// todo call countIncreases internally
fun countSlidingIncreases(measurements: List<Int>): Int = countIncreases(transformToSlidingMeasurements(measurements))

fun transformToSlidingMeasurements(measurements: List<Int>): List<Int> = List(measurements.size) {
        index -> if (index < measurements.size-2) measurements[index] + measurements[index + 1] + measurements[index + 2] else -1
}.filterNot{ it == -1 }
    // 0123456
    // 1234567