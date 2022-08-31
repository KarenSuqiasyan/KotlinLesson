package lesson4BankApplication.usercomunication.bankmenu

import lesson4BankApplication.action.showCustomerList
import lesson4BankApplication.action.showLoanList
import lesson4BankApplication.usercomunication.customermenu.CustomerMenu
import lesson4BankApplication.usercomunication.mainmenu.MainMenu

object BankMenu {

    fun menuForBank() {


        for (actions in BankMenuEnum.values()) {
            println(actions)
//        1. Show Customers
//        2. Show Loans
//        3. Back
        }
        when (CustomerMenu.scan.nextInt()) {
            1 -> showCustomerList()
            2 -> showLoanList()
            3 -> MainMenu.mainMenu()
        }
    }
}