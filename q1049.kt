
fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val eachPrice = mutableListOf<Int>()
    val packagePrice = mutableListOf<Int>()
    repeat(m) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        packagePrice.add(a)
        eachPrice.add(b)
    }
    val eachPriceMin = eachPrice.min()
    val packagePriceMin = packagePrice.min()
    val onlyPackage = packagePriceMin * ((n / 6) + if (n % 6 == 0) 0 else 1)
    val onlyEach = eachPriceMin * n
    val mix = packagePriceMin * (n / 6) + eachPriceMin * (n % 6)
    val min = minOf(onlyPackage, onlyEach, mix)

    println(min)
}
