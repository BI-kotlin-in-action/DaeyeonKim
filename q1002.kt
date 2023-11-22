import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

class Circle(val x: Int, val y: Int, val r: Int) {
    fun distance(other: Circle) =
        sqrt((x - other.x).toDouble().pow(2.0) + (y - other.y).toDouble().pow(2.0))
}

fun main(args: Array<String>) {
    val test = readln().toInt()
    repeat(test) {
        val inputs = readln().split(" ").map { it.toInt() }
        val circle1 = Circle(inputs[0], inputs[1], inputs[2])
        val circle2 = Circle(inputs[3], inputs[4], inputs[5])
        val distance = circle1.distance(circle2)
        val sumRadius = circle1.r + circle2.r
        val subRadius = abs(circle1.r - circle2.r)
        when {
            distance == 0.0 && circle1.r == circle2.r -> println(-1) // 두 원이 일치할 때
            distance == 0.0 && circle1.r != circle2.r -> println(0) // 중심이 같지만 반지름이 다를 때
            distance > sumRadius -> println(0) // 두 원이 서로 밖에서 만나지 않을 때
            distance < subRadius.toDouble() -> println(0) // 한 원이 다른 원을 포함할 때
            distance == sumRadius.toDouble() -> println(1) // 두 원이 외접할 때
            distance == subRadius.toDouble() -> println(1) // 두 원이 내접할 때
            distance < sumRadius -> println(2) // 두 원이 서로 다른 두 점에서 만날 때
            distance > subRadius.toDouble() -> println(2) // 두 원이 서로 다른 두 점에서 만날 때
        }
    }
}
