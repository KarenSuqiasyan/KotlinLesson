package lesson4BankApplication.ui.customer


import lesson4BankApplication.ui.MainMenu
import lesson4BankApplication.ui.bank.products.BankProducts
import lesson4BankApplication.ui.customer.CustomerMenuActions.Companion.calculator
import lesson4BankApplication.ui.customer.CustomerMenuActions.Companion.registration

object CustomerMenu {
    fun menuForCustomer() {
        for (actions in CustomerMenuEnum.values()) {
            println(actions)
        }
        when (MainMenu.scan.nextInt()) {
            1 -> registration()
            2 -> BankProducts.menuForBankProducts()
            3 -> calculator()
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

