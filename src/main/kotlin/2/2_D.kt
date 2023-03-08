package `2`

fun main() {
    val (w, h, x, y, r) = readLine()!!.split(" ").map { it.toInt() }
    if((y - r) < 0 || (y + r) > h) { return println("No") }
    else if((x - r) < 0 || (x + r) > w) { return println("No") }
    else { println("Yes") }
}