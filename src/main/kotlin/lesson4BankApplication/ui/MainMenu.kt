package lesson4BankApplication.ui

import lesson4BankApplication.ui.customer.CustomerMenu
import lesson4BankApplication.validation.Validation
import java.util.*

object MainMenu {
    var scan = Scanner(System.`in`)
    fun mainMenu() {
        for (actions in MainMenuEnum.values()) {
            println(actions)
        }
        when (Validation.validForMenu()) {
            1 -> CustomerMenu.menuForCustomer()
            2 -> BankMenu.menuForBank()
            3 -> System.out
            else -> mainMenu()
        }
    }
}

enum class MainMenuEnum(private val key: Int, private val value: String) {
    FOR_CUSTOMER(key = 1, value = "For Customer"),
    FOR_BANK_MANAGER(key = 2, value = "For Bank Manager"),
    EXIT(key = 3, value = "Exit");

    override fun toString(): String {
        return "$key. $value"
    }
}