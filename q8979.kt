class Country(val id: Int, val gold: Int, val silver: Int, val bronze: Int) {
    operator fun compareTo(other: Country): Int {
        // 금메달 비교
        if (this.gold > other.gold) {
            return 1
        } else if (this.gold < other.gold) {
            return -1
        }
        // 은메달 비교
        if (this.silver > other.silver) {
            return 1
        } else if (this.silver < other.silver) {
            return -1
        }
        // 동메달 비교
        if (this.bronze > other.bronze) {
            return 1
        } else if (this.bronze < other.bronze) {
            return -1
        } else {
            return 0
        }
    }
}

fun main(args: Array<String>) {
    val (n, targetCountryId) = readln().split(" ").map { it.toInt() }
    val countries = mutableListOf<Country>()

    repeat(n) {
        val input = readln().split(" ")
        val id = input.get(0).toInt()
        val gold = input.get(1).toInt()
        val silver = input.get(2).toInt()
        val bronze = input.get(3).toInt()
        countries.add(Country(id, gold, silver, bronze))
    }
    val target = countries.find { it.id == targetCountryId } ?: Country(0, 0, 0, 0)
    if (target.id == 0) {
        println("target not found")
        return
    }
    val targetRank = countries.count { target > it }

    println(targetRank + 1)
}
