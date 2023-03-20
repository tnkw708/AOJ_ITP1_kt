package `7`

fun main() {
    val (n, m, l) = readLine()!!.split(" ").map { it.toInt() }
    val matrix1 = Array(n) { IntArray(m) { 0 } }
    val matrix2 = Array(m) { IntArray(l) { 0 } }
    val matrixAns = Array(n) { LongArray(l) { 0 } }

    repeat(n) {
        matrix1[it] = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    }
    repeat(m) {
        matrix2[it] = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    }

    repeat(n) { i ->
        repeat(m) { j ->
            repeat(l) { k ->
                matrixAns[i][k] += matrix1[i][j].toLong() * matrix2[j][k].toLong()
            }
        }
    }

    matrixAns.forEach { row ->
        println(row.joinToString(" "))
    }
}