package lesson4BankApplication.action

import lesson4BankApplication.model.bank.Bank
import lesson4BankApplication.model.bank.Loan
import lesson4BankApplication.model.customer.Customer
import lesson4BankApplication.usercomunication.CustomerMenu

fun loan(customer: Customer) {

    println("wright the sum: ")
    val sum = CustomerMenu.scan.nextInt()
    println("wright the term in month: ")
    val term = CustomerMenu.scan.nextInt()
    val percent = if (sum > 200000) 12 else 14
    if (loanApprove(sum, term, customer.salary)) {
        val loan = Loan(loanSum = sum, loanPercent = percent, loanTerm = term)
        println("your loan is approved sum: $sum, percent: $percent, term: $term")
        println("enter what day u want to pay your loan")
        val payDay: Int = CustomerMenu.scan.nextInt()
        loan.loanPayDay = payDay
        Bank.loanList[customer.passport.id] = listOf(loan)
        CustomerMenu.menuForCustomer()
    } else {
        println("your loan is rejected")
        CustomerMenu.menuForCustomer()
    }
}

fun loanApprove(sum: Int, term: Int, salary: Int): Boolean {
    return if (sum > salary * 2) {
        println("your loan is rejected")
        false
    } else {
        true
    }
}