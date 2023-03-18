package `7`

fun main() {
    while (true) {
        var count = 0
        val (n, x) = readLine()!!.split(" ").map { it.toInt() }
        if (n == 0 && x == 0) break


        for (i in n downTo 3) {
            if (i >= x - 2) continue
            for (j in i - 1 downTo 2) {
                if (i + j >= x) continue
                for (k in j - 1 downTo 1) {
                    if (i + j + k > x) continue
                    if (i + j + k == x) count++
                }
            }
        }
        println(count)
    }
}