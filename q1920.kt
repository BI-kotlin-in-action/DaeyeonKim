
fun main(args: Array<String>) {
    var size: Int
    var num: Int
    var arr = mutableListOf<Int>()

    size = readln().toInt()
    repeat(size) {
        num = readln().toInt()
        arr.add(num)
    }
    size = readln().toInt()
    repeat(size) {
        num = readln().toInt()
        println(if (num in arr) 1 else 0)
    }
}
