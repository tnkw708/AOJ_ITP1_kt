package `5`

fun main() {
    while(true){
        val (h, w) = readLine()!!.split(" ").map { it.toInt() }
        if(h == 0 && w == 0) break
        val line = "#".repeat(w)
        repeat(h){ println(line) }
        println()
    }
}