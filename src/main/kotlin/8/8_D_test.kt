package `8`

fun main() {
    val sentence = readLine()!!
    val word = readLine()!!
    val ans = (sentence + sentence).contains(word)
    println(if (ans) "Yes" else "No")
}