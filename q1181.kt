
fun main(args: Array<String>) {
    val n = readLine()?.toInt()
    var words = ArrayList<String>()
    var word = ""
    repeat(n ?: 0) {
        word = readLine()?.toString() ?: ""
        words.add(word)
    }
    words = ArrayList(words.distinct())

    merge_sort(words, 0, words.size - 1)
    for (w in words) {
        println(w)
    }
}

fun merge_sort(words: ArrayList<String>, left: Int, right: Int) {
    val mid = (left + right) / 2

    if (left < right) {
        merge_sort(words, left, mid)
        merge_sort(words, mid + 1, right)
        merge(words, left, mid, right)
    }
}

fun merge(words: ArrayList<String>, left: Int, mid: Int, right: Int) {
    val mid = (left + right) / 2
    var i = left
    var j = mid + 1
    var k = 0
    var temp = ArrayList<String>()

    while (i <= mid && j <= right) {
        if (words[i].length < words[j].length) {
            temp.add(words[i++])
        } else if (words[i].length > words[j].length) {
            temp.add(words[j++])
        } else {
            if (words[i] < words[j]) {
                temp.add(words[i++])
            } else {
                temp.add(words[j++])
            }
        }
    }

    if (i > mid) {
        for (t in j..right) {
            temp.add(words[t])
        }
    } else {
        for (t in i..mid) {
            temp.add(words[t])
        }
    }
    for (t in left..right) {
        words[t] = temp[k++]
    }
}
