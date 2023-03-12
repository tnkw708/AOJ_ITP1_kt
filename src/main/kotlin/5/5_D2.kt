package `5`

fun main() {
    val n = readLine()!!.toInt()
    (1..n).forEach{
        if(it % 3 == 0 || it.toString().contains("3")) print(" $it")
    }
    println()
}