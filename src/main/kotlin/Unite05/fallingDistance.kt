fun fallingDistance(t: Int): Double {
    val g = 9.8
    val d = 0.5 * g * t * t
    return d
}

fun main() {
    for (t in 1..10) {
        val distance = fallingDistance(t)
        println("Distance fallen after $t seconds: $distance meters")
    }
}
