

fun main() {

        val str1: String
        val str2: String
        val str3: String

        print("Enter first string: ")
        str1 = "Charlie"

        print("Enter second string: ")
        str2 = "Leslie"

        print("Enter third string: ")
        str3 = "Andy"



        if (str1.compareTo(str2) < 0 && str1.compareTo(str3) < 0) {

            println(str1)

            if (str2.compareTo(str3) < 0) {
                println(str2)
                println(str3)
            } else {
                println(str3)
                println(str2)
            }
        } else if (str2.compareTo(str1) < 0 && str2.compareTo(str3) < 0) {
            println(str2)

            if (str1.compareTo(str3) < 0) {
                println(str1)
                println(str3)
            } else {
                println(str3)
                println(str1)
            }
        } else {

            println(str3)

            if (str1.compareTo(str2) < 0) {
                println(str1)
                println(str2)
            } else {
                println(str2)
                println(str1)
            }
        }
    }
