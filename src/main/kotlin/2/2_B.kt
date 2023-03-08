package `2`

fun main() {
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }
    if(b in (a + 1) until c) println("Yes")
    else println("No")
}