package `5`

import java.util.StringJoiner

fun main() {
    while(true) {
        val (h, w) = readLine()!!.split(" ").map{ it.toInt() }
        if(h == 0 && w == 0) break
        val oddLine: String
        val evenLine: String
        if(w % 2 == 0){
            oddLine = "#.".repeat( w / 2)
            evenLine = ".#".repeat(w / 2)
        } else {
            oddLine = "#.".repeat( w / 2) + "#"
            evenLine = ".#".repeat(w / 2)  + "."
        }

        if(h % 2 == 0)
            repeat(h / 2) { println(oddLine + "\n" + evenLine) }
        else {
            repeat(h / 2) {
                println(oddLine + "\n" + evenLine)
            }
            println(oddLine)
        }
        println()
    }
}