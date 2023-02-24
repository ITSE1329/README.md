 fun main() {

    val longestRow = 8
    for (row in 1..longestRow) {
        var i = 2 * row - 1
        if (i > longestRow) i = 2 * (longestRow - row + 1) - 1
        for (j in 0 until (longestRow - i) / 2) print(" ")
        for (j in 0 until i) print("*")
        for (j in 0 until (longestRow - i) / 2) print(" ")
        println()
    }
}




