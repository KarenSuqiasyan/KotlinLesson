package lesson4BankApplication.usercomunication

import lesson4BankApplication.action.loan
import lesson4BankApplication.model.bank.Bank

fun goToBank() {

    println("we can offer you a credit")
    println("please wright your ID: ")
    val id: Int = CustomerMenu.scan.nextInt()
    val isCustomer = Bank.customers.containsKey(id)
    if (isCustomer) {
        val customer = Bank.customers[id]
        println("you are already our customer");if (customer != null) {
            loan(customer)
        }
    } else {
        println("you are not our customer")
        registration()
    }
}