package lesson4BankApplication.model.bank

import lesson4BankApplication.model.customer.Customer

object Bank {

    var loanList: MutableMap<Int, List<Loan>> = mutableMapOf()
    var customers: MutableMap<Int, Customer> = mutableMapOf()

}