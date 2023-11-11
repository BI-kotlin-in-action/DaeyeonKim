
fun main(args: Array<String>) {
    // 컴파일 시간 단축을 위한 코드 간소화
    val size = readln().toInt()
    var n = 1
    while (n < size) {
        n *= 2
    }
    n /= 2
    val result = if (n == 0) 1 else (size - n) * 2
    print(result)
}
