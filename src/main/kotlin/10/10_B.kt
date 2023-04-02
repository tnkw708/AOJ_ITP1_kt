package `10`

import java.lang.Math.toRadians
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.sqrt

fun main() {
    val (a, b, c) = readLine()!!.split(" ").map { it.toDouble() }
    val rad = toRadians(c)
    val h = b * sin(rad)
    val s = a * h / 2
    val l = sqrt(a * a + b * b - 2 * a * b * cos(rad))

    println("$s ${a + b + l} $h")
}