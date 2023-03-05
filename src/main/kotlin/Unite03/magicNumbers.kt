
    fun main() {
        println("Enter a month ")

        val day: Int
        val month: Int
        val year: Int
        val magic: Int
        month = 2
        println("Enter a day ")
        day = 20
        println("Enter two-digit year ")
        year = 40
        println("The entered date is : $day/$month/$year")
        magic = day * month
        if (magic == year) println("Date $day/$month/$year is a MAGIC year !") else println("Date $day/$month/$year is not a MAGIC year !")
    }
