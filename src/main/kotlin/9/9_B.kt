package `9`

fun main() {
    while (true) {
        var cards = readLine().toString()
        if (cards == "-") break
        val times = readLine()!!.toInt()
        repeat(times) {
            val h = readLine()!!.toInt()
            val forwardCards = cards.substring(0, h)
            val afterwardCards = cards.substring(h, cards.length)
            cards = afterwardCards + forwardCards
        }
        println(cards)
    }
}