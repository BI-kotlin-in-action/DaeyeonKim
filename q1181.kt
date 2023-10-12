// sortedSet을 이용한 코드
fun main(args: Array<String>) {
    val n = readln().toInt()
    var words = mutableListOf<String>()
    var word = ""
    repeat(n ?: 0) {
        word = readln()
        words.add(word)
    }
    var setWords = words.toSortedSet(compareBy<String> { it.length }.thenBy { it })
    println(setWords)
}

// mutableList의 distinct를 이용하여 정렬을 제거한 코드

// fun main(args: Array<String>) {
//    val n = readln().toInt()
//    var words = mutableListOf<String>()
//    var word = ""
//    repeat(n ?: 0) {
//        word = readln()
//        words.add(word)
//    }
//    words = words.distinct().toMutableList()
//
//    merge_sort(words, 0, words.size - 1)
//    for (w in words) {
//        println(w)
//    }
// }
//
// fun merge_sort(words: MutableList<String>, left: Int, right: Int) {
//    val mid = (left + right) / 2
//
//    if (left < right) {
//        merge_sort(words, left, mid)
//        merge_sort(words, mid + 1, right)
//        merge(words, left, mid, right)
//    }
// }
//
// fun merge(words: MutableList<String>, left: Int, mid: Int, right: Int) {
//    val mid = (left + right) / 2
//    var i = left
//    var j = mid + 1
//    var k = 0
//    var temp = mutableListOf<String>()
//
//    while (i <= mid && j <= right) {
//        if (words[i].length < words[j].length) {
//            temp.add(words[i++])
//        } else if (words[i].length > words[j].length) {
//            temp.add(words[j++])
//        } else {
//            if (words[i] < words[j]) {
//                temp.add(words[i++])
//            } else {
//                temp.add(words[j++])
//            }
//        }
//    }
//
//    if (i > mid) {
//        for (t in j..right) {
//            temp.add(words[t])
//        }
//    } else {
//        for (t in i..mid) {
//            temp.add(words[t])
//        }
//    }
//    for (t in left..right) {
//        words[t] = temp[k++]
//    }
// }
