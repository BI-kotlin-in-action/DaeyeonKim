

fun main(args: Array<String>) {
    val test = readln().toInt()
    repeat(test) {
        val (n, location) = readln().split(" ").map { it.toInt() }
        val importance = readln().split(" ").map { it.toInt() }
        val queue = importance.mapIndexed { index, i -> index to i }.toMutableList()
        var count = 0
        while (true) {
            val maxImportance = queue.maxBy { it.second }
            while (queue[0] != maxImportance) {
                queue.add(queue.removeAt(0))
            }
            count++
            if (queue[0].first == location) {
                println(count)
                break
            }
            queue.removeAt(0)
        }
    }
}
