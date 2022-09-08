package lesson4BankApplication.ui


import lesson4BankApplication.ui.bank.bankmanager.BankMenuActions
import lesson4BankApplication.validation.Validation


object BankMenu {
    private var bankMenuActions = BankMenuActions()
    fun menuForBank() {
        for (actions in BankMenuEnum.values()) {
            println(actions)
        }
        when (Validation.validForMenu()) {
            1 -> bankMenuActions.showCustomerList()
            2 -> bankMenuActions.showLoanList()
            3 -> bankMenuActions.showCreditCards()
            4 -> bankMenuActions.searchByCustomer()
            5 -> MainMenu.mainMenu()
            else -> menuForBank()
        }
    }

    enum class BankMenuEnum(private val key: Int, private val value: String) {
        SHOW_CUSTOMERS(key = 1, value = "Show Customers"),
        SHOW_LOANS(key = 2, value = "Show Loans"),
        SHOW_CREDIT_CARDS(key = 3, value = "Show Credit Cards"),
        SEARCH_BY_CUSTOMER(key = 4, value = "Search by Customer"),
        BACK(key = 5, value = "Back");

        override fun toString(): String {
            return "$key. $value"
        }
    }
}

