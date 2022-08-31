package lesson4BankApplication.action


import lesson4BankApplication.model.bank.Bank
import lesson4BankApplication.usercomunication.bankmenu.BankMenu
import lesson4BankApplication.usercomunication.customermenu.CustomerMenu

fun calculator(): Int {
    println("sum: ")
    val sum = CustomerMenu.scan.nextInt()
    println("year: ")
    val year = CustomerMenu.scan.nextInt()
    println("percent: ")
    val percent = CustomerMenu.scan.nextInt()
    val monthPayment = ((sum * 0.57 * year * percent / 100 + sum) / year / 12).toInt()
    println("your month payment = : $monthPayment")
    CustomerMenu.menuForCustomer()
    return monthPayment
}

fun showCustomerList() {
    Bank.customers.forEach {
        println(it)
        if (it.equals(null)) {
            println("there is no customers yet")
        }
    }
    BankMenu.menuForBank()
}



