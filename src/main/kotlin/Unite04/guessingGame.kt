import kotlin.random.Random

fun main() {
    println("Welcome to the number guessing game!")
    println("I'm thinking of a number between 1 and 100.")
    val answer = Random.nextInt(1, 101) // generate random number
    var guess: Int? = null // initialize guess variable to null
    var tries = 0 // initialize tries variable to 0

    while (guess != answer) {
        print("Enter your guess: ")
        guess = readLine()?.toIntOrNull()

        if (guess == null) {
            println("Invalid input, please enter a number.")
        } else if (guess < 1 || guess > 100) {
            println("Please enter a number between 1 and 100.")
        } else if (guess < answer) {
            println("Too low, try again!")
            tries++
        } else if (guess > answer) {
            println("Too high, try again!")
            tries++
        } else {
            tries++
            println("Congratulations, you guessed the number in $tries tries!")
        }
    }
}

