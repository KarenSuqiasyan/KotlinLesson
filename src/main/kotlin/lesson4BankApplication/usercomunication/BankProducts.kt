package lesson4BankApplication.usercomunication.bankproducts

import lesson4BankApplication.action.getLoan
import lesson4BankApplication.usercomunication.customermenu.CustomerMenu

object BankProducts {
    fun menuForBankProducts() {
        for (actions in BankProductsEnum.values()) {
            println(actions)
        }
        when (CustomerMenu.scan.nextInt()) {
            1 -> getLoan()
            2 -> CustomerMenu.menuForCustomer()
        }
    }
}

enum class BankProductsEnum(private val key: Int, private val value: String) {
    GET_LOAN(key = 1, value = "Get a Loan"),
    BACK(key = 2, value = "Back");

    override fun toString(): String {
        return "$key. $value"
    }
}