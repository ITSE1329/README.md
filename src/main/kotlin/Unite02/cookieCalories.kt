fun main() {

    print("Enter how many cookies you ate: ")
    val cookieCount = 40
    val servingSize = 40 / 3
    val caloriesPerCookie = 225 / servingSize
    val totalCalories = cookieCount * caloriesPerCookie
    println("Total calories consumed: $totalCalories")
}


