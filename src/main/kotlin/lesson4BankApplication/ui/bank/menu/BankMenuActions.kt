package lesson4BankApplication.ui.bank.menu

import lesson4BankApplication.model.bank.Bank
import lesson4BankApplication.ui.BankMenu

class BankMenuActions {

    fun showCustomerList() {
        if (Bank.customers.isEmpty()) {
            println("there is no customers yet")
            BankMenu.menuForBank()
        }
        Bank.customers.forEach {
            println(it)
            BankMenu.menuForBank()
        }
    }

    fun showLoanList() {
        if (Bank.loanList.isEmpty()) {
            println("there is no loan yet")
            BankMenu.menuForBank()
        } else {
            Bank.loanList.forEach {
                println(it)
            }
            BankMenu.menuForBank()
        }
    }

    fun showCreditCards() {
        if (Bank.cards.isEmpty()) {
            println("there is no cards yet")
            BankMenu.menuForBank()
        } else {
            Bank.cards.forEach {
                println(it)
            }
            BankMenu.menuForBank()
        }
    }
}