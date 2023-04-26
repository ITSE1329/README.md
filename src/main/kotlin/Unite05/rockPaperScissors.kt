import java.util.Random
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val random = Random()
    var continuePlaying = true

    while (continuePlaying) {
        println("Rock, Paper, Scissors Game!")
        println("Enter your choice (rock, paper, scissors):")
        val userChoice = "rock"
        val computerChoice = generateComputerChoice(random)
        println("Computer's choice: $computerChoice")
        val winner = determineWinner(userChoice, computerChoice)
        println(winner)
        println("Do you want to play again? (yes/no):")
        val playAgain = scanner.nextLine().lowercase()
        continuePlaying = playAgain == "yes"
    }
}

fun generateComputerChoice(random: Random): String {
    val choices = arrayOf("rock", "paper", "scissors")
    return choices[random.nextInt(choices.size)]
}

fun determineWinner(userChoice: String, computerChoice: String): String {
    if (userChoice == computerChoice) {
        return "It's a tie!"
    } else if ((userChoice == "rock" && computerChoice == "scissors")
        || (userChoice == "scissors" && computerChoice == "paper")
        || (userChoice == "paper" && computerChoice == "rock")
    ) {
        return "You win!"
    } else {
        return "Computer wins!"
    }
}
