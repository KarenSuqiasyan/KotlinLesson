package lesson4BankApplication.ui.bank.bankmanager

import lesson4BankApplication.model.bank.Bank
import lesson4BankApplication.ui.BankMenu
import lesson4BankApplication.ui.MainMenu
import lesson4BankApplication.ui.customer.CustomerMenu

class BankMenuActions {

    fun showCustomerList() {
        if (Bank.customerList.isEmpty()) {
            println("there is no customers yet")
            BankMenu.menuForBank()
        }
        Bank.customerList.forEach {
            println(it)
        }
        BankMenu.menuForBank()
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
        if (Bank.cardlist.isEmpty()) {
            println("there is no cards yet")
            BankMenu.menuForBank()
        } else {
            Bank.cardlist.forEach {
                println(it)
            }
            BankMenu.menuForBank()
        }
    }

    fun searchByCustomer() {
        print("type ID of customer: ")
        val id: Int = MainMenu.scan.nextInt()
        val isCustomer = Bank.customerList.containsKey(id)
        if (isCustomer) {
            val customer = Bank.customerList[id]
            println(customer)
            if (Bank.cardlist.isEmpty()) {
                println("cards: ${Bank.cardlist[id].orEmpty()}")
            } else {
                print("cards: ")
                Bank.cardlist.forEach {
                    println(it)
                }
            }
            if (Bank.loanList.isEmpty()) {
                println("loans: ${Bank.loanList[id].orEmpty()}")
            } else {
                print("loans: ")
                Bank.loanList.forEach {
                    println(it)
                }
            }
        }
        CustomerMenu.menuForCustomer()
    }
}
