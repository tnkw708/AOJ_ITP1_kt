package `9`

fun main() {
    while (true) {
        val (m, f, r) = readLine()!!.split(" ").map { it.toInt() }
        if (m == -1 && f == -1 && r == -1) break
        if (m == -1 || f == -1) {
            println("F")
            continue
        }
        val sum = m + f
        if (sum >= 80) println("A")
        else if (sum >= 65) println("B")
        else if (sum >= 50) println("C")
        else if (sum >= 30 && r >= 50) println("C")
        else if (sum >= 30) println("D")
        else println("F")
    }
}