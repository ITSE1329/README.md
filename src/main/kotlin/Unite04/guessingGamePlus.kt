import kotlin.random.Random

fun main() {
    val secretNumber = Random.nextInt(1, 101)
    var guess: Int
    var guessCount = 0

    while (true) {
        println("Guess a number between 1 and 100: ")
        guess = readLine()?.toIntOrNull() ?: continue
        guessCount++

        when {
            guess < secretNumber -> println("Too low")
            guess > secretNumber -> println("Too high")
            else -> {
                println("You got it!")
                println("Number of guesses: $guessCount")
                break
            }
        }
    }
}