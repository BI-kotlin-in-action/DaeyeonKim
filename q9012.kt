
fun main(args: Array<String>) {
    val test = readln().toInt()

    repeat(test) {
        val input = readln()
        var balance = 0
        var pair = true

        for (i in input) {
            if (i == '(') {
                balance++
            } else {
                balance--
            }
            if (balance < 0) {
                pair = false
                break
            }
        }
        if (balance != 0) {
            pair = false
        }
        println(if (pair) "YES" else "NO")
    }
}
