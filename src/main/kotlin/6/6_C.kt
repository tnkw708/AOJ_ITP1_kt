//package `6`

fun main() {
    val n = readLine()!!.toInt()
    val buildingArray = Array(4) { Array(3) { Array(10) { 0 } } }
    repeat(n) {
        val (b, f, r, v) = readLine()!!.split(" ").map { it.toInt() }
        buildingArray[b - 1][f - 1][r - 1] += v
    }

    buildingArray.forEachIndexed { index, floorArray ->
        floorArray.forEach { roomArray ->
            roomArray.forEach { print(" $it") }
            println()
        }
        if (index != 3) println("#".repeat(20))
    }
}