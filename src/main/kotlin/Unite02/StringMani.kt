import java.util.*

fun main() {

    val fullname = "Elnaz Azami"
    val assignment = "Sring Manipulator"
    val date ="02/27/2023"
    val cityName = "Paris"

    println(fullname)
    println(assignment)
    println(date)
    println(cityName)
    println("Number of characters in the city name: ${cityName.length}")
    println("City name in all uppercase: ${cityName.uppercase(Locale.getDefault())}")
    println("City name in all lowercase: ${cityName.lowercase(Locale.getDefault())}")
    println("First character of the city name: ${cityName.first()}")
}