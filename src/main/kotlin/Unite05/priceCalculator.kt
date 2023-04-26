fun main() {
    print("Enter the item's wholesale cost: ")
    val wholesaleCost = 5.00
    print("Enter the item's markup percentage: ")
    val markupPercentage = 100.00

    val retailPrice = calculateRetail(wholesaleCost, markupPercentage)
    println("The item's retail price is: $retailPrice")
}

fun calculateRetail(wholesaleCost: Double, markupPercentage: Double): Double {
    val markupDecimal = markupPercentage / 100.0
    return wholesaleCost * (1 + markupDecimal)
}
