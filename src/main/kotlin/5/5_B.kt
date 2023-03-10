package `5`

fun main() {
    while(true){
        val (h , w) = readLine()!!.split(" ").map { it.toInt() }
        if (h == 0 && w == 0) break
        val lineExceptMiddle = "#".repeat(w)
        val middleLine = ".".repeat(w - 2)

        println(lineExceptMiddle)
        repeat(h - 2) { println("#${middleLine}#") }
        println(lineExceptMiddle)
        println()
    }
}