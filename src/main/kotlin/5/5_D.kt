package `5`

fun main() {
    val n = readLine()!!.toInt()
    for(i in 1..n) {
        var x = i

        if(x % 3 == 0) {
            print(" $i")
        continue
        }

        while(x != 0) {
            if(x % 10 == 3) {
                print(" $i")
                break
            }
            x /= 10
        }
    }
    println()
}