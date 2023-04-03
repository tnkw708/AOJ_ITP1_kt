package `9`

fun main() {
    val str = readLine()!!
    val q = readLine()!!.toInt()
    var output = str

    repeat(q) {
        val readLineList = readLine()!!.split(" ")
        val command = readLineList[0]
        val a = readLineList[1].toInt()
        val b = readLineList[2].toInt()

        when (command) {
            "replace" -> {
                val replacement = readLineList[3]
                output = output.replaceRange(a, b + 1, replacement)
            }

            "reverse" -> {
                val temp = output.reversed().substring(output.length - 1 - b, output.length - a)
                output = output.replaceRange(a, b + 1, temp)
            }

            "print" -> {
                println(output.substring(a, b + 1))
            }
        }
    }
}