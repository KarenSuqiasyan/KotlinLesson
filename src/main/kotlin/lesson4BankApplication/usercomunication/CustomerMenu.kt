package lesson4BankApplication.usercomunication.customermenu

import lesson4BankApplication.action.calculator
import lesson4BankApplication.usercomunication.bankmenu.BankMenuEnum
import lesson4BankApplication.usercomunication.mainmenu.MainMenu
import lesson4BankApplication.usercomunication.bankproducts.BankProducts
import lesson4BankApplication.usercomunication.registration
import java.util.*

object CustomerMenu {
    var scan = Scanner(System.`in`)
    fun menuForCustomer() {
        for (actions in CustomerMenuEnum.values()) {
            println(actions)
        }
        when (scan.nextInt()) {
            1 -> registration()
            2 -> BankProducts.menuForBankProducts()
            3 -> calculator()
            4 -> MainMenu.mainMenu()
        }
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