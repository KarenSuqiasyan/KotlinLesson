package lesson4BankApplication.usercomunication.mainmenu

import lesson4BankApplication.usercomunication.bankmenu.BankMenu
import lesson4BankApplication.usercomunication.customermenu.CustomerMenu
import lesson4BankApplication.usercomunication.customermenu.CustomerMenuEnum

object MainMenu {

    fun mainMenu() {


        for (actions in MainMenuEnum.values()) {
            println(actions)
//       1. For Customer
//       2. For Bank Manager
//       3. Exit
        }

        when (CustomerMenu.scan.nextInt()) {
            1 -> CustomerMenu.menuForCustomer()
            2 -> BankMenu.menuForBank()
            3 -> System.out
        }
    }
}