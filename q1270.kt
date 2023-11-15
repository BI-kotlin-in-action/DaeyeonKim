
fun main(args: Array<String>) {
    val size = readln().toInt()

    repeat(size) {
        val inputs = readln().split(" ").map { it.toInt() }
        val numOfSoldiers = inputs[0]
        val soldiers = inputs.subList(1, inputs.size)
        val count = mutableMapOf<Int, Int>()
        soldiers.forEach { soldier ->
            if (count[soldier] == null) {
                count[soldier] = 0
            }
            count[soldier] = count.getValue(soldier) + 1
        }
        if (count.maxOf { it.value } > numOfSoldiers / 2) {
            print(count.maxBy { it.value }.key)
        } else {
            print("SYJKGW")
        }
    }
}
