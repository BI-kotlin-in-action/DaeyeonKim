
fun getScore(englishName: String, teamName: String): Int {
    val mergeName = englishName + teamName
    val countL = mergeName.count { it == 'l' || it == 'L' }
    val countO = mergeName.count { it == 'o' || it == 'O' }
    val countV = mergeName.count { it == 'v' || it == 'V' }
    val countE = mergeName.count { it == 'e' || it == 'E' }
    return ((countL + countO) * (countL + countV) * (countL + countE) * (countO + countV) * (countO + countE) * (countV + countE)) % 100
}

fun maxScoreOfTeam(englishName: String, teamNames: MutableList<String>): String {
    var maxScore = 0
    var maxTeamName = teamNames.get(0)
    var score = 0
    for (teamName in teamNames) {
        score = getScore(englishName, teamName)
        if (score == maxScore) {
            maxTeamName = if (maxTeamName < teamName) maxTeamName else teamName
        } else if (score > maxScore) {
            maxScore = score
            maxTeamName = teamName
        }
    }
    return maxTeamName
}

fun main(args: Array<String>) {
    var teamNames = mutableListOf<String>()
    val englishName = readln()
    val teamCount = readln().toInt()
    for (i in 0 until teamCount!!) {
        val teamName = readln()
        teamNames.add(teamName)
    }
    println(maxScoreOfTeam(englishName, teamNames))
}
