fun main(args: Array<String>) {
    val size = readln().split(" ").map { it.toInt() }
    val n = readln().toInt() // 자른 횟수
    val y = sortedSetOf(0, size[1]) // 가로 자른 위치
    val x = sortedSetOf(0, size[0]) // 세로 자른 위치

    repeat(n) {
        val cut = readln().split(" ").map { it.toInt() }
        when (cut[0]) {
            0 -> y.add(cut[1])
            1 -> x.add(cut[1])
        }
    }
    var max = 0 // 사각형 최대 넓이

    for (i in 0 until y.size) {
        for (j in 0 until x.size - 1) {
            // 사각형 넓이 구하기
            val area = (y.elementAt(i) - y.elementAt(i - 1)) * (x.elementAt(j) - x.elementAt(j - 1))
            if (max < area) {
                max = area
            }
        }
    }
    println(max)
}
