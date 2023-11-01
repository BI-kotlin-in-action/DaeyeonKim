fun main(args: Array<String>) {
    val size = readln().split(" ").map { it.toInt() }
    val n = readln().toInt() // 자른 횟수
    val y = sortedSetOf<Int>() // 가로 자른 위치
    val x = sortedSetOf<Int>() // 세로 자른 위치
    y.add(0)
    x.add(0)

    repeat(n) {
        var cut = readln().split(" ").map { it.toInt() }
        when (cut[0]) {
            0 -> y.add(cut[1])
            1 -> x.add(cut[1])
        }
    }
    y.add(size[1])
    x.add(size[0])

    var max = 0 // 사각형 최대 넓이
    var area = 0 // 사각형 넓이
    for (i in 0 until y.size - 1) {
        for (j in 0 until x.size - 1) {
            // 사각형 넓이 구하기
            var area = (y.elementAt(i + 1) - y.elementAt(i)) * (x.elementAt(j + 1) - x.elementAt(j))
            if (max < area) {
                max = area
            }
        }
    }
    println(max)
}
