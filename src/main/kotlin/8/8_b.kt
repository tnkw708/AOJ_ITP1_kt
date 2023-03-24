fun main() {
    while (true) {
        val str = readLine()!!
        if (str == "0") break
        println(str.map { it - '0' }.sum())
    }
}