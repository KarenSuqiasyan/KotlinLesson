package lesson4BankApplication.usercomunication.bankmenu

import lesson4BankApplication.action.showCustomerList
import lesson4BankApplication.action.showLoanList
import lesson4BankApplication.usercomunication.customermenu.CustomerMenu
import lesson4BankApplication.usercomunication.MainMenu

object BankMenu {
    fun menuForBank() {
        for (actions in BankMenuEnum.values()) {
            println(actions)
        }
        when (CustomerMenu.scan.nextInt()) {
            1 -> showCustomerList()
            2 -> showLoanList()
            3 -> MainMenu.mainMenu()
        }
    }
}

enum class BankMenuEnum(private val key: Int, private val value: String) {
    SHOW_CUSTOMERS(key = 1, value = "Show Customers"),
    SHOW_LOANS(key = 2, value = "Show Loans"),
    BACK(key = 3, value = "Back");

    override fun toString(): String {
        return "$key. $value"
    }
}