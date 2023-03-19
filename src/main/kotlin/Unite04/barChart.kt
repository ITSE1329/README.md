fun main() {
        val sales1: Int
        val sales2: Int
        val sales3: Int
        val sales4: Int
        val sales5: Int

        print("Enter today’s sales for stores 1: ")
        sales1 = 1000
        print("Enter today’s sales for stores 2: ")
        sales2 = 1200
        print("Enter today’s sales for stores 3: ")
        sales3 = 1800
        print("Enter today’s sales for stores 4: ")
        sales4 = 800
        print("Enter today’s sales for stores 5: ")
        sales5 = 1900
        println()
        println("Sales Bar Chart")
        for (i in 1..5) {

            if (i == 1) {
                bar(sales1)
            }
            if (i == 2) {
                bar(sales2)
            }
            if (i == 3) {
                bar(sales3)
            }
            if (i == 4) {
                bar(sales4)
            }
            if (i == 5) {
                bar(sales5)
            }
        }
    }

    fun bar(n: Int) {
        for (i in 0 until n / 100) {
            print("*")
        }
        println()
    }
