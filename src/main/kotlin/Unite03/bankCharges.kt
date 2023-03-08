fun main(args: Array<String>) {

    val number_of_check: Int
    var service_charge = 10.0

    print("Enter number of checks this month : ")
    number_of_check = 10
    service_charge += if (number_of_check > 0 && number_of_check < 20) number_of_check * 0.1 else if (number_of_check >= 20 && number_of_check <= 39) number_of_check * 0.08 else if (number_of_check >= 40 && number_of_check <= 59) number_of_check * 0.06 else number_of_check * 0.04
    System.out.printf("service charge for this month : $%.2f \n", service_charge)

}
