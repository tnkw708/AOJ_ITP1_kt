package `4`

fun main() {
    val r = readLine()!!.toDouble()
    println("%.5f %.5f".format((r*r*Math.PI), (2 * Math.PI * r)))
}