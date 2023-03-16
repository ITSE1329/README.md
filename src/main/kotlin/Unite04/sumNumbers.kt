fun main() {

    print("Enter integer: ")

    val n: Int = 50
    var total = 0

    for (i in 1..n) total += i
    println("Sum of numbers between 1 and $n is $total")

}