
fun main(args: Array<String>) {
    var test = readln().toInt()
    var balance: Int
    var input: String
    var pair: Boolean

    repeat(test) {
        balance = 0
        pair = true
        input = readln()
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
