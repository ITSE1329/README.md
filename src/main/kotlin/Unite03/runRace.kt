    fun main() {

        val r1: String
        val r2: String
        val r3: String
        val t1: Int
        val t2: Int
        val t3: Int

        println("Enter runner 1 name: ")
        r1 = "A"
        println("Enter runner 1 time in minutes: ")
        t1 = 15
        println("Enter runner 2 name: ")
        r2 = "B"
        println("Enter runner 2 time in minutes: ")
        t2 = 11
        println("Enter runner 3 name: ")
        r3 = "C"
        println("Enter runner 3 time in minutes: ")
        t3 = 12
        var x = 0
        if (t1 < t2 && t1 < t3) {
            println("$r1 ")
            if (t2 < t3) {
                println("$r2 ")
                x = 1
            } else {
                println("$r3 ")
            }
            if (x == 1) println("$r3 ") else println("$r2 ")
        }
        x = 0
        if (t2 < t1 && t2 < t3) {
            println("$r2 ")
            if (t1 < t3) {
                println("$r1 ")
                x = 1
            } else {
                println("$r3 ")
            }
            if (x == 1) println("$r3 ") else println("$r1 ")
        }
        x = 0
        if (t3 < t1 && t3 < t2) {
            println("$r3 ")
            if (t1 < t2) {
                println("$r1 ")
                x = 1
            } else {
                println("$r2 ")
            }
            if (x == 1) {
                println("$r2 ")
            } else println("$r1 ")
        }
    }

