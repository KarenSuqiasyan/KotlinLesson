package lesson4BankApplication.ui.customer


import lesson4BankApplication.ui.MainMenu
import lesson4BankApplication.ui.bank.products.BankProductsMenu
import lesson4BankApplication.validation.Validation

object CustomerMenu {
    private val customerMenuActions = CustomerMenuActions()
    fun menuForCustomer() {
        for (actions in CustomerMenuEnum.values()) {
            println(actions)
        }
        when (Validation.validForMenu()) {
            1 -> customerMenuActions.registration()
            2 -> BankProductsMenu.menuForBankProducts()
            3 -> customerMenuActions.calculator()
            4 -> MainMenu.mainMenu()
            else -> menuForCustomer()
        }
    }

    enum class CustomerMenuEnum(private val key: Int, private val value: String) {
        REGISTRATION(key = 1, value = "Registration"),
        BANK(key = 2, value = "Bank"),
        CALCULATOR(key = 3, value = "Calculator"),
        BACK(key = 4, value = "Back");

        override fun toString(): String {
            return "$key. $value"
        }
    }
}

