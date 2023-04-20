package `10`

import java.lang.Math.cbrt
import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val n = readLine()!!.toInt()
    val xList = readLine()!!.split(" ").map { it.toDouble() }
    val yList = readLine()!!.split(" ").map { it.toDouble() }

    for (p in 1..4) {
        var d = 0.0
        if (p in 1..3) {
            xList.forEachIndexed { index, x ->
                d += abs(x - yList[index]).pow(p.toDouble())
            }
        } else {
            repeat(n) {
                val dxy = abs(xList[it] - yList[it])
                d = kotlin.math.max(d, dxy)
            }
        }
        val distance = when (p) {
            1 -> d
            2 -> sqrt(d)
            3 -> cbrt(d)
            else -> d
        }
        println(distance)
    }
}