fun main() {
//    val count = readLine()!!.toInt()
    readLine()

//    val nums = readLine()!!.split(" ").map(String::toLong).toMutableList().sorted()
    val nums = readLine()!!.split(" ").map(String::toLong)

//    println("""${nums[0]} ${nums[count-1]} ${nums.sum()}""")
    println("""${nums.minOrNull()} ${nums.maxOrNull()} ${nums.sum()}""")
}