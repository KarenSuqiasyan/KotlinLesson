package lesson4BankApplication

import lesson4BankApplication.model.bank.Bank
import lesson4BankApplication.model.customer.Customer
import lesson4BankApplication.model.customer.Passport
import lesson4BankApplication.ui.MainMenu

fun main() {
    Bank.customers[1] = Customer(100000, Passport(1, "Karen", "Sukiasyan", 29))
    MainMenu.mainMenu()
}