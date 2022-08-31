package lesson4BankApplication.usercomunication

import lesson4BankApplication.action.showCustomerList

object MainMenu {

    fun mainMenu() {

        println("\n1. For Customer")
        println("\n2. For Bank Manager")
        println("\n3. Exit")

        when (CustomerMenu.scan.nextInt()) {
            1 -> CustomerMenu.menuForCustomer()
            2 -> BankMenu.menuForBank()
            3 -> System.out
        }
    }
}