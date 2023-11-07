
fun main(args: Array<String>) {
    val table = arrayOf(
        charArrayOf('A', 'C', 'A', 'G'),
        charArrayOf('C', 'G', 'T', 'A'),
        charArrayOf('A', 'T', 'C', 'G'),
        charArrayOf('G', 'A', 'G', 'T'),
    )
    val keyMap = mapOf(
        'A' to 0,
        'C' to 1,
        'G' to 2,
        'T' to 3,
    )

    val length = readln().toInt()
    val dna = readln().toMutableList()
    for (i in length - 1 downTo 1) {
        val row = keyMap[dna[i]] ?: -1
        val column = keyMap[dna[i - 1]] ?: -1
        if (row == -1 || column == -1) {
            println("입력오류")
            return
        }
        dna[i - 1] = table[row][column]
    }
    println(dna[0])
}
