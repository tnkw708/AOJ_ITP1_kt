package `4`

fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toDouble() }
    println("%d %d %.5f".format((a / b).toInt(), (a % b).toInt(), (a / b)))
}