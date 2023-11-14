
fun main(args: Array<String>) {
    val count = readln().toInt()
    val number = readln().toInt()
    val votes = readln().split(" ").map { it.toInt() }
    val countMap = mutableMapOf<Int, Int>()
    votes.forEach { vote ->
        if (countMap[vote] == null) { // 처음 들어온 후보
            if (countMap.size == count) { // 후보가 꽉 찼을 때
                countMap.remove(countMap.minBy { it.value }.key)
                countMap[vote] = 1
            } else {
                countMap[vote] = 1
            }
        } else { // 기존에 들어온 후보
            countMap[vote] = countMap.getValue(vote) + 1
        }
    }
    countMap.toSortedMap().forEach { print("${it.key} ") }
}
