package lesson4BankApplication.usercomunication

import lesson4BankApplication.action.getLoan

object BankProducts {

    fun menuForBankProducts() {
        println("\n1. Get a Loan")
        println("\n2. Back")

        when (CustomerMenu.scan.nextInt()) {
            1 -> getLoan()
            2 -> CustomerMenu.menuForCustomer()
        }
    }
}