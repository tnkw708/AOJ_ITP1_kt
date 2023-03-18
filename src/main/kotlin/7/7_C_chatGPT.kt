fun main() {
    val (r, c) = readLine()!!.split(" ").map { it.toInt() }

    val table = List(r) { readLine()!!.split(" ").map { it.toInt() } }

    // 各行と列の合計
    val rowSums = table.map { it.sum() }
    val colSums = (0 until c).map { j -> table.sumBy { it[j] } }

    // 表全体の合計
    val totalSum = table.sumBy { it.sum() }

    // 新しい表を出力
    for (i in 0..r) {
        for (j in 0..c) {
            val value = when {
                i < r && j < c -> table[i][j]
                i < r && j == c -> rowSums[i]
                i == r && j < c -> colSums[j]
                else -> totalSum
            }
            print("$value ")
        }
        println()
    }
}
