
fun main(args: Array<String>) {
    var size: Int
    var num: Int
    var arr = ArrayList<Int>()

    size = readLine()?.toInt() ?: 0
    repeat(size) {
        num = readLine()?.toInt() ?: 0
        arr.add(num)
    }
    size = readLine()?.toInt() ?: 0
    repeat(size) {
        num = readLine()?.toInt() ?: 0
        when (num) {
            in arr -> println(1)
            else -> println(0)
        }
    }
}
