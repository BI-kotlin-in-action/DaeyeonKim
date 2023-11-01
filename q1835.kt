
fun main(args: Array<String>) {
    val n = readln().toInt()
    var cards = Array<Int>(n) { 0 }
    var count = 0
    var cur = 0

    for (i in 1..n) {
        count = 0
        while (count != i) {
            if (cards[cur % n] == 0) {
                count++
            }
            cur++
        }
        while (cards[cur % n] != 0) {
            cur++
        }
        cards[cur % n] = i
    }
    print(cards.joinToString(" "))
}
