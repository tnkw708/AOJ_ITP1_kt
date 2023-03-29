package `9`

fun main() {
    val word = readLine()!!
    var count = 0
    while (true) {
        val sentence = readLine()!!
        if (sentence == "END_OF_TEXT") break

        // AOJ用にkotlin1.4のメソッド使ってる
        count += sentence.split(" ").count { it.toLowerCase() == word.toLowerCase() }
    }
    println(count)
}
