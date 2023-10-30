fun main(args: Array<String>) {
    val size = readln().split(" ").map { it.toInt() }
    val n = readln().toInt() // 자른 횟수
    val y = mutableListOf<Int>() // 가로 자른 위치
    val x = mutableListOf<Int>() // 세로 자른 위치
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
    y.sort()
    x.sort()

    var max = 0
    for (i in 0 until y.size - 1) {
        for (j in 0 until x.size - 1) {
            // 사각형 넓이 구하기
            if (max < (y[i + 1] - y[i]) * (x[j + 1] - x[j])) {
                max = (y[i + 1] - y[i]) * (x[j + 1] - x[j])
            }
        }
    }
    println(max)
}
