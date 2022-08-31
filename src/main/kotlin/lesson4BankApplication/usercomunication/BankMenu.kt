package lesson4BankApplication.usercomunication

import lesson4BankApplication.action.calculator
import lesson4BankApplication.action.showCustomerList

object BankMenu {

    fun menuForBank() {

        println("\n1. Show Customers")
        println("\n2. Back")

        when (CustomerMenu.scan.nextInt()) {
            1 -> showCustomerList()
            2 -> MainMenu.mainMenu()
        }
    }
}