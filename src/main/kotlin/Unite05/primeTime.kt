// primeTime.kt

// Function to check if a number is divisible by another number
fun isNumberDivisible(number: Int, divisor: Int): Boolean {
    return number % divisor == 0
}

// Function to check if a number is prime
fun isPrime(number: Int): Boolean {
    // Numbers less than 0 are not considered prime
    if (number <= 0) {
        return false
    }

    // Check for divisors from 2 to the square root of the number
    for (i in 2..Math.sqrt(number.toDouble()).toInt()) {
        if (isNumberDivisible(number, i)) {
            return false // If a divisor is found, the number is not prime
        }
    }

    return true // If no divisors are found, the number is prime
}

fun main() {
    // Test cases
    println(isPrime(6)) // false
    println(isPrime(13)) // true
    println(isPrime(8893)) // true
}