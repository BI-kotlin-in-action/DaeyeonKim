
fun fibonacci(n: Int): Pair<Int, Int> {
    val cache = IntArray(n + 1)
    cache[0] = 0
    cache[1] = 1
    for (i in 2..n) {
        cache[i] = cache[i - 1] + cache[i - 2]
    }
    return Pair(cache[n - 1], cache[n])
}

fun main(args: Array<String>) {
    val test = readln().toInt()
    repeat(test) {
        val n = readln().toInt()
        if (n == 0) {
            println("1 0")
        } else {
            println("${fibonacci(n).first} ${fibonacci(n).second}")
        }
    }
}
