package `9`

fun main() {
    val n = readLine()!!.toInt()
    var taroP = 0
    var hanakoP = 0

    repeat(n) {
        val (taroCard, hanakoCard) = readLine()!!.split(" ")

        if (taroCard > hanakoCard) taroP += 3
        else if (taroCard < hanakoCard) hanakoP += 3
        else {
            taroP++
            hanakoP++
        }
    }

    println("$taroP $hanakoP")
}