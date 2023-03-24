fun main() {
    val alphabetArray = arrayOf(
        'a',
        'b',
        'c',
        'd',
        'e',
        'f',
        'g',
        'h',
        'i',
        'j',
        'k',
        'l',
        'm',
        'n',
        'o',
        'p',
        'q',
        'r',
        's',
        't',
        'u',
        'v',
        'w',
        'x',
        'y',
        'z'
    )
    val alphabetCountArray = IntArray(alphabetArray.size) { 0 }

    while (true) {
        val sentence = readLine() ?: break

        alphabetArray.forEachIndexed { index, alphabet ->
            // AOJのkotlinのversion古すぎぃ!
            alphabetCountArray[index] += sentence.count { char -> alphabet == char.toLowerCase() }
        }
    }

    repeat(alphabetArray.size) { index ->
        println("${alphabetArray[index]} : ${alphabetCountArray[index]}")
    }
}