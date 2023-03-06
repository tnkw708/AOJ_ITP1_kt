package `1`

fun main() {
    val inputSec = readLine()!!.toInt()
    val sec = inputSec % 60
    val h = inputSec / (60 * 60)
    val min = (inputSec / 60) - (h * 60)
    //以下の式のが綺麗
    // min = inputSec / 60 % 60
    println("""${h}:${min}:${sec}""")
}