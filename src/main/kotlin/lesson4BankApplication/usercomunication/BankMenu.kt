package lesson4BankApplication.usercomunication

import lesson4BankApplication.action.calculator
import lesson4BankApplication.action.showCustomerList
import lesson4BankApplication.action.showLoanList

object BankMenu {

    fun menuForBank() {

        println("\n1. Show Customers")
        println("\n2. Show Loans")
        println("\n3. Back")

        when (CustomerMenu.scan.nextInt()) {
            1 -> showCustomerList()
            2 -> showLoanList()
            3 -> MainMenu.mainMenu()
        }
    }
}