package `10`

import kotlin.math.sqrt

fun main() {
    while(true) {

        val n = readLine()!!.toDouble()
        if(n.toInt() == 0) break

        val dataset = readLine()!!.split(" ").map { it.toInt() }
        val average = dataset.fold(0.0) {avg, data -> avg + data / n }
        val variance = dataset.fold(0.0) { vnc, data -> vnc + (data - average) * (data - average) / n }
        val standard = sqrt(variance)

        println(standard)
    }
}