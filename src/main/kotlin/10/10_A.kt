package `10`

import kotlin.math.sqrt

fun main() {
    val (x1, y1, x2, y2) = readLine()!!.split(" ").map { it.toDouble() }
    val distance = sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2))

    println(distance)
}