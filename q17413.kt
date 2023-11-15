
fun main(args: Array<String>) {
    val sentence = readln()
    var result = ""
    var isInTag = false
    var word = ""

    for (c in sentence) {
        if (c == '<' || c == '>') {
            result += word.reversed()
            result += c
            word = ""
            isInTag = !isInTag // 태그 안/밖을 바꿔줌
            continue
        }
        if (isInTag) { // tag 안일 때는 그냥 추가
            result += c
        } else { // 태그 안이 아닐 때는 단어를 뒤집어서 추가
            if (c == ' ') {
                result += word.reversed()
                result += c
                word = ""
            } else {
                word += c
            }
        }
    }
    result += word.reversed()
    print(result)
}
