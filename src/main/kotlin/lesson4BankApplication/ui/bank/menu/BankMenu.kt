package lesson4BankApplication.ui


import lesson4BankApplication.ui.bank.menu.BankMenuActions


object BankMenu {
    private var bankMenuActions = BankMenuActions()
    fun menuForBank() {
        for (actions in BankMenuEnum.values()) {
            println(actions)
        }
        when (MainMenu.scan.nextInt()) {
            1 -> bankMenuActions.showCustomerList()
            2 -> bankMenuActions.showLoanList()
            3 -> bankMenuActions.showCreditCards()
            4 -> MainMenu.mainMenu()
            else -> menuForBank()
        }
    }

    enum class BankMenuEnum(private val key: Int, private val value: String) {
        SHOW_CUSTOMERS(key = 1, value = "Show Customers"),
        SHOW_LOANS(key = 2, value = "Show Loans"),
        SHOW_CREDIT_CARDS(key = 3, value = "Show Credit Cards"),
        BACK(key = 4, value = "Back");

        override fun toString(): String {
            return "$key. $value"
        }
    }
}

