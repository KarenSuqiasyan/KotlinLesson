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
//        1. Registration
//        2. Bank
//        3. Calculator
//        4. Back
        }

        when (scan.nextInt()) {
            1 -> registration()
            2 -> BankProducts.menuForBankProducts()
            3 -> calculator()
            4 -> MainMenu.mainMenu()
        }
    }
}