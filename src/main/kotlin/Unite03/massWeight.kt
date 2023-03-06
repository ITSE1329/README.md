fun main() {
    val mass = 1
    val weight = mass * 9.8

    println(weight)
    if (weight > 1000) {
        println("$weight is too heavy")
    } else if (weight < 10) {
        println("$weight is too light")

    }
}