package `6`

fun main() {
    readLine()
    println(readLine()!!.split(" ").map(String::toInt).reversed().joinToString(" "))
}