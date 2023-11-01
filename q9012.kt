
fun main(args: Array<String>) {
    val test = readln().toInt()

    repeat(test) {
        val input = readln()
        var balance = 0

        for (i in input) {
            if (i == '(') {
                balance++
            } else {
                balance--
            }
            if (balance < 0) {
                break
            }
        }

        println(if (balance == 0) "YES" else "NO")
    }
}
