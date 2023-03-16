
    fun main() {

        val input: String
        val c: Char
        var i = 0
        var count = 0
        print("Enter a string: ")
        input = "salaria"
        print("Enter the character to count: ")
        'a'.also { c = it }
        while (i < input.length) {
            if (input[i] == c) count++
            i++
        }
        println("$c occurs $count times")
    }
