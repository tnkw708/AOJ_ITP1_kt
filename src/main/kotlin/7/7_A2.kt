package `7`

fun main() {
    while (true) {
        val (m, f, r) = readLine()!!.split(" ").map { it.toInt() }
        if (m == -1 && f == -1 && r == -1) break
        when {
            m == -1 || f == -1 -> println("F")
            m + f >= 80 -> println("A")
            m + f >= 65 -> println("B")
            m + f >= 50 -> println("C")
            m + f >= 30 && r >= 50 -> println("C")
            m + f >= 30 -> println("D")
            else -> println("F")
        }
    }
}