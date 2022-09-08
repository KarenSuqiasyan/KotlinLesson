package lesson4BankApplication

import lesson4BankApplication.model.bank.Bank
import lesson4BankApplication.model.customer.Customer
import lesson4BankApplication.model.customer.Passport
import lesson4BankApplication.ui.MainMenu

fun main() {
    Bank.customerList[1] = Customer(200000, Passport(1, "Karen", "Sukiasyan", 29))
    Bank.customerList[2] = Customer(2000000, Passport(2, "Karo", "Hovhannisyan", 29))
    MainMenu.mainMenu()
}