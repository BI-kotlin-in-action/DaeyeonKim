
class Human(val sex: Int, val num: Int) {
    fun controlSwitch(switch: MutableList<Int>) {
        when (sex) {
            1 -> { // 남성
                // num인덱스 값은 num-1
                var i = 1
                var cur = num * i - 1
                while (cur < switch.size) {
                    switch[cur] = if (switch[cur] == 0) 1 else 0
                    i++
                    cur = num * i - 1
                }
            }
            2 -> { // 여성
                // num인덱스 값은 num-1
                var lcur = num - 1
                var rcur = num - 1
                while (lcur < switch.size && rcur >= 0) {
                    if (switch[lcur].equals(switch[rcur])) {
                        switch[lcur] = if (switch[lcur] == 0) 1 else 0
                        switch[rcur] = switch[lcur]
                        lcur++
                        rcur--
                    } else {
                        break
                    }
                }
            }
        }
    }
}

fun main(args: Array<String>) {
    val switchSize = readln().toInt()
    val switch = readln().split(" ").map { it.toInt() }.toMutableList()
    val humanSize = readln().toInt()
    val humans = mutableListOf<Human>()
    repeat(humanSize) {
        val human = readln().split(" ").map { it.toInt() }
        humans.add(Human(human[0], human[1]))
    }
    humans.forEach { it.controlSwitch(switch) }
    // 스위치 20개씩 출력
    for (i in 0 until switchSize) {
        print("${switch[i]} ")
        if (i % 20 == 19) {
            println()
        }
    }
}
