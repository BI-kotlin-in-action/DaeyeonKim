class Country(val id: Int, val gold: Int, val silver: Int, val bronze: Int) {
    fun compare(other: Country): Int {
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
    var input = readln().split(" ")
    val n = input.get(0).toInt()
    var targetCountryId = input.get(1).toInt()
    var countries = mutableListOf<Country>()
    var id: Int
    var gold: Int
    var silver: Int
    var bronze: Int
    var targetRank = 0
    repeat(n) {
        input = readln().split(" ")
        id = input.get(0).toInt()
        gold = input.get(1).toInt()
        silver = input.get(2).toInt()
        bronze = input.get(3).toInt()
        countries.add(Country(id, gold, silver, bronze))
    }
    val target = countries.find { it.id == targetCountryId } ?: Country(0, 0, 0, 0)
    if (target.id == 0) {
        println("target not found")
        return
    }
    targetRank = countries.count { target.compare(it) == -1 }

    println(targetRank + 1)
}
