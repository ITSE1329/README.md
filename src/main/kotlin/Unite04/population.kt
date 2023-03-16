import kotlin.math.roundToInt

fun main() {
    val startingPopulation = readStartingPopulation()
    val averageDailyIncrease = readAverageDailyIncrease()
    val numberOfDays = readNumberOfDays()
    val finalPopulation = calculateFinalPopulation(startingPopulation, averageDailyIncrease, numberOfDays)
    displayPopulationGrowth(startingPopulation, averageDailyIncrease, numberOfDays, finalPopulation)
}

fun readStartingPopulation(): Int {
    var startingPopulation: Int
    do {
        print("Enter the starting population (minimum 2): ")
        startingPopulation = 4
    } while (startingPopulation < 2)
    return startingPopulation
}

fun readAverageDailyIncrease(): Double {
    var averageDailyIncrease: Double
    do {
        print("Enter the average daily population increase (as a percentage): ")
        averageDailyIncrease = 2.0
    } while (averageDailyIncrease < 0)
    return averageDailyIncrease
}

fun readNumberOfDays(): Int {
    var numberOfDays: Int
    do {
        print("Enter the number of days they will multiply (minimum 1): ")
        numberOfDays = 30
    } while (numberOfDays < 1)
    return numberOfDays
}

fun calculateFinalPopulation(startingPopulation: Int, averageDailyIncrease: Double, numberOfDays: Int): Double {
    var population = startingPopulation.toDouble()
    repeat(numberOfDays) {
        population += population * (averageDailyIncrease / 100)
    }
    return population
}

fun displayPopulationGrowth(startingPopulation: Int, averageDailyIncrease: Double, numberOfDays: Int, finalPopulation: Double) {
    println("Starting population: $startingPopulation")
    println("Average daily increase: $averageDailyIncrease%")
    println("Number of days: $numberOfDays")
    println("Final population: ${finalPopulation.roundToInt()}")
}
