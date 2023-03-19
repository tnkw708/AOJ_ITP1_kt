package `8`

fun main() {
    val str = readLine()!!.map {
        if (it.isUpperCase()) it.lowercaseChar()
        else if (it.isLowerCase()) it.uppercaseChar()
        else it
    }
    str.forEach { print(it) }
    println()
}