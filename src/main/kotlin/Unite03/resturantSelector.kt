fun main() {
    val choice = arrayOf("", "", "")

    println("Is anyone at your party vegetarian:")
    choice[0] = "yes"
    println("Is anyone at your party a vegan:")
    choice[1] = "yes"
    println("Is anyone at your party gluten free:")
    choice[2] = "yes"
    println("Here are your restaurent choices:")
    if (choice[0].equals("yes", ignoreCase = true) && choice[1].equals(
            "yes",
            ignoreCase = true
        ) && choice[2].equals("yes", ignoreCase = true)
    ) {
        println("Corner's cafe")
        println("Chef's kitchen")
    } else if (choice[0].equals("yes", ignoreCase = true) && choice[1].equals(
            "yes",
            ignoreCase = true
        ) && choice[2].equals("no", ignoreCase = true)
    ) {
        println("Corner's cafe")
        println("Chef's kitchen")
    } else if (choice[0].equals("yes", ignoreCase = true) && choice[1].equals(
            "no",
            ignoreCase = true
        ) && choice[2].equals("yes", ignoreCase = true)
    ) {
        println("Main Street pizza company")
        println("Corner's cafe")
        println("Chef's kitchen")
    } else if (choice[0].equals("no", ignoreCase = true) && choice[1].equals(
            "yes",
            ignoreCase = true
        ) && choice[2].equals("yes", ignoreCase = true)
    ) {
        println("Corner's cafe")
        println("Chef's kitchen")
    } else if (choice[0].equals("yes", ignoreCase = true) && choice[1].equals(
            "no",
            ignoreCase = true
        ) && choice[2].equals("no", ignoreCase = true)
    ) {
        println("Main Street pizza company")
        println("Corner's cafe")
        println("Mama's fine Italian")
        println("Chef's kitchen")
    } else if (choice[0].equals("no", ignoreCase = true) && choice[1].equals(
            "no",
            ignoreCase = true
        ) && choice[2].equals("yes", ignoreCase = true)
    ) {
        println("Main Street pizza company")
        println("Corner's cafe")
        println("Chef's kitchen")
    } else if (choice[0].equals("no", ignoreCase = true) && choice[1].equals(
            "yes",
            ignoreCase = true
        ) && choice[2].equals("no", ignoreCase = true)
    ) {
        println("Corner's cafe")
        println("Chef's kitchen")
    } else if (choice[0].equals("no", ignoreCase = true) && choice[1].equals(
            "no",
            ignoreCase = true
        ) && choice[2].equals("no", ignoreCase = true)
    ) {
        println("Joe's gourmet burgers")
        println("Main Street pizza company")
        println("Corner's cafe")
        println("Mama's fine Italian")
        println("Chef's kitchen")
    }
}
