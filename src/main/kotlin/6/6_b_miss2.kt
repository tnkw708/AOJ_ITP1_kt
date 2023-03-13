package `6`

fun main() {
    val n = readLine()!!.toInt()
    val trumpList = mutableListOf<String>()

    for (pic in listOf("S", "H", "C", "D"))
        (1..13).forEach { num -> trumpList.add("$pic $num") }

    for (i in 1..n)
        trumpList.remove(readLine())

    if (trumpList.size != 0) println(trumpList.joinToString("\n"))
}