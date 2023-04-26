fun main() {
    print("Enter the number of shares: ")
    val NS: Int = 300
    print("Enter the sale price per share: ")
    val SP: Double = 243.37
    print("Enter the sale commission: ")
    val SC: Double = 8.75
    print("Enter the purchase price per share: ")
    val PP: Double = 22.853
    print("Enter the purchase commission: ")
    val PC: Double = 8.75

    val profit: Double = ((NS * SP) - SC) - ((NS * PP) + PC)

    if (profit >= 0) {
        println("Profit: $$profit")
    } else {
        println("Loss: $$profit")
    }
}
