package lesson4BankApplication.usercomunication.bankproducts

import lesson4BankApplication.action.getLoan
import lesson4BankApplication.usercomunication.customermenu.CustomerMenu

object BankProducts {

    fun menuForBankProducts() {
        for (actions in BankProductsEnum.values()) {
            println(actions)
        }
//        1. Get a Loan
//        2. Back

        when (CustomerMenu.scan.nextInt()) {
            1 -> getLoan()
            2 -> CustomerMenu.menuForCustomer()
        }
    }
}