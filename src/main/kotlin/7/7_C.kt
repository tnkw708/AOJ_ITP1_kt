package `7`

fun main() {
    val (r, c) = readLine()!!.split(" ").map { it.toInt() }
    var sum = 0
    var rowArray = IntArray(c) { 0 }
    repeat(r) {
        val columnArray = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
        var sumColumn = 0
        repeat(c) { index ->
            sumColumn += columnArray[index]
            sum += columnArray[index]
            rowArray[index] += columnArray[index]
            print("${columnArray[index]} ")
        }
        println("${sumColumn}")
    }

    repeat(c) {
        print("${rowArray[it]} ")
    }
    println("${sum}")
}