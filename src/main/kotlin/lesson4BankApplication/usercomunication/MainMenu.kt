package lesson4BankApplication.usercomunication

import lesson4BankApplication.usercomunication.bankmenu.BankMenu
import lesson4BankApplication.usercomunication.customermenu.CustomerMenu

object MainMenu {
    fun mainMenu() {
        for (actions in MainMenuEnum.values()) {
            println(actions)
        }
        when (CustomerMenu.scan.nextInt()) {
            1 -> CustomerMenu.menuForCustomer()
            2 -> BankMenu.menuForBank()
            3 -> System.out
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