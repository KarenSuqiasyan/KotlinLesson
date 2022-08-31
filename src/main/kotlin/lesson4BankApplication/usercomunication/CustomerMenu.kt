package lesson4BankApplication.usercomunication

import lesson4BankApplication.action.calculator
import lesson4BankApplication.action.showCustomerList
import java.util.*

object CustomerMenu {

    var scan = Scanner(System.`in`)

    fun menuForCustomer() {
        println("\n1. Registration")
        println("\n2. Bank")
        println("\n3. Calculator")
        println("\n4. Back")

        when (scan.nextInt()) {
            1 -> registration()
            2 -> goToBank()
            3 -> calculator()
            4 -> MainMenu.mainMenu()
        }
    }
}