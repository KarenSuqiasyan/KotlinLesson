package lesson4BankApplication.action


import lesson4BankApplication.model.bank.Bank
import lesson4BankApplication.usercomunication.bankmenu.BankMenu
import lesson4BankApplication.usercomunication.customermenu.CustomerMenu

fun calculator(): Int {
    print("sum: ")
    val sum = CustomerMenu.scan.nextInt()
    print("year: ")
    val year = CustomerMenu.scan.nextInt()
    print("percent: ")
    val percent = CustomerMenu.scan.nextInt()
    val monthPayment = ((sum * 0.57 * year * percent / 100 + sum) / year / 12).toInt()
    print("your month payment = : $monthPayment")
    CustomerMenu.menuForCustomer()
    return monthPayment
}

fun showCustomerList() {
    if (Bank.customers.isEmpty()) {
        println("there is no customers yet")
        BankMenu.menuForBank()
    }
    Bank.customers.forEach {
        println(it)
    }
}



