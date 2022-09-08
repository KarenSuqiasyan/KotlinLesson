package lesson4BankApplication.ui.bank.products

import lesson4BankApplication.model.bank.Bank
import lesson4BankApplication.ui.customer.CustomerMenu
import lesson4BankApplication.ui.MainMenu

class CashInCashOutActions {

    fun cashIn() {
        println("please wright your ID: ")
        val id: Int = MainMenu.scan.nextInt()
        val isCustomer = Bank.customerList.containsKey(id)
        if (isCustomer) {
            val customer = Bank.customerList[id]
            println("you are already our customer");if (customer != null) {
                println("How much money do you want to deposit into your account?")
                print("The amount of money: ")
                val money = MainMenu.scan.nextInt()
                if (Bank.cardlist.containsKey(customer.passport.id)) {
                    println("in which balance you want to put money")
                    println("1. card")
                    println("2. customer balance")
                    when (MainMenu.scan.nextInt()) {
                        1 -> Bank.cardlist[customer.passport.id]?.forEach {
                            it.balance += money
                        }

                        2 -> customer.balance += money
                    }
                    CustomerMenu.menuForCustomer()
                } else {
                    customer.balance += money
                    println("Transaction completed successfully !!!")
                    println("Your account balance ${customer.balance}")
                    CustomerMenu.menuForCustomer()
                }
            }
        } else {
            println("you are not our customer")
            println("please registration first")
            CustomerMenu.menuForCustomer()
        }
    }

    fun cashOut() {
        println("please wright your ID: ")
        val id: Int = MainMenu.scan.nextInt()
        val isCustomer = Bank.customerList.containsKey(id)
        if (isCustomer) {
            val customer = Bank.customerList[id]
            println("you are already our customer");if (customer != null) {
                println("How much money do you want to withdraw from your account?")
                print("The amount of money: ")
                val money = MainMenu.scan.nextInt()
                if (money > customer.balance) {
                    println("Sorry you have no $money money in our balance")
                    BankProductsMenu.menuForBankProducts()
                } else {
                    customer.balance -= money
                    println("Transaction completed successfully !!!")
                    println("Your account balance ${customer.balance}")
                    CustomerMenu.menuForCustomer()
                }
            }
        } else {
            println("you are not our customer")
            println("please registration first")
            CustomerMenu.menuForCustomer()
        }
    }

}