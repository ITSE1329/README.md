fun main() {
    val options = arrayOf("rock", "paper", "scissors")
    val computerChoice = options.random()
    println("The computer has chosen its move. Enter your choice: rock, paper, or scissors")
    val userChoice = readLine()
    if (userChoice in options) {
        println("The computer chose $computerChoice")
        when {
            userChoice == computerChoice -> println("It's a tie!")
            userChoice == "rock" && computerChoice == "scissors" ||
                    userChoice == "paper" && computerChoice == "rock" ||
                    userChoice == "scissors" && computerChoice == "paper" -> println("You win!")
            else -> println("The computer wins!")
        }
    } else {
        println("Invalid input. Please try again.")
    }
}
