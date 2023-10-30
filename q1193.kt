
fun main(args: Array<String>) {
    val n = readln().toInt()
    var denominator = 1 // 분모
    var numerator = 1 // 분자
    var set = 1 // 분모, 분자의 증가
    var direct = false // 분모가 증가(false), 감소(true)

    for (i in 1 until n) {
        when (direct) {
            true -> {
                if (numerator == set) {
                    set++
                    numerator = set
                    denominator = 1
                    direct = false
                } else {
                    numerator++
                    denominator--
                }
            }
            false -> {
                if (denominator == set) {
                    set++
                    denominator = set
                    numerator = 1
                    direct = true
                } else {
                    numerator--
                    denominator++
                }
            }
        }
    }
    print("$numerator/$denominator")
}
