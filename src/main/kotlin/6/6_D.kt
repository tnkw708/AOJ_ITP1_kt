package `6`

fun main() {
    val (i, j) = readLine()!!.split(" ").map { it.toInt() }
    val a = Array(i) { IntArray(j) { 0 } }
    val b = IntArray(j) { 0 }

    repeat(i) { a[it] = readLine()!!.split(" ").map { it.toInt() }.toIntArray() }
    repeat(j) { b[it] += readLine()!!.toInt() }

    a.forEach { row ->
        var sum = 0
        row.forEachIndexed { index, i ->
            sum += i * b[index]
        }
        println(sum)
    }
}