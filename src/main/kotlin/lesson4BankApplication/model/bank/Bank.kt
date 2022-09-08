package lesson4BankApplication.model.bank

import lesson4BankApplication.model.bank.Loan.Loan
import lesson4BankApplication.model.bank.creditcard.CreditCard
import lesson4BankApplication.model.customer.Customer

object Bank {
    var loanList: MutableMap<Int, List<Loan>> = mutableMapOf()
    var customerList: MutableMap<Int, Customer> = mutableMapOf()
    var cardlist: MutableMap<Int, List<CreditCard>> = mutableMapOf()
}