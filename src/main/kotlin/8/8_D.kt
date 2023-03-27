package `8`

fun main() {
    val sentence = readLine()!!
    val length = sentence.length
    val word = readLine()!!

    for(i in 0 until length) {
        var middleSentence = sentence
        if (i > 0) middleSentence = sentence.substring(i) + sentence.substring(0, i)

        val ans = middleSentence.contains(word)
        if (ans) {
            println("Yes")
            return
        }
    }
    println("No")
}