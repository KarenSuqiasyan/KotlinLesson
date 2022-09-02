package lesson4BankApplication.ui.bank.products

import lesson4BankApplication.model.bank.Bank
import lesson4BankApplication.model.bank.Loan.Graphic
import lesson4BankApplication.model.bank.Loan.Loan
import lesson4BankApplication.model.customer.Customer
import lesson4BankApplication.ui.customer.CustomerMenu
import lesson4BankApplication.ui.MainMenu

class LoansActions {


    fun getLoan() {

        println("we can offer you a credit")
        println("please wright your ID: ")
        val id: Int = MainMenu.scan.nextInt()
        val isCustomer = Bank.customers.containsKey(id)
        if (isCustomer) {
            val customer = Bank.customers[id]
            println("you are already our customer");if (customer != null) {
                loan(customer)
            }
        } else {
            println("you are not our customer")
            println("please registration first")
            CustomerMenu.menuForCustomer()
        }
    }

    fun loan(customer: Customer) {
        println("wright the sum: ")
        val sum = MainMenu.scan.nextInt()
        println("wright the term in month: ")
        val term = MainMenu.scan.nextInt()
        val percent = if (sum > 200000) 12 else 14
        if (loanApprove(sum, term, customer.salary)) {
            val loan = Loan(loanSum = sum, loanPercent = percent, loanTerm = term)
            println("your loan is approved sum: $sum, percent: $percent, term: $term")
            println("enter what day u want to pay your loan")
            val payDay: Int = MainMenu.scan.nextInt()
            loan.loanPayDay = payDay
            loan.graphic =
                Graphic(loanPercent = percent, loanSum = sum, term = term, payDay = payDay).loanGraphicMethod()
            Bank.loanList[customer.passport.id] = listOf(loan)
            CustomerMenu.menuForCustomer()
        } else {
            CustomerMenu.menuForCustomer()
        }
    }

    private fun loanApprove(sum: Int, term: Int, salary: Int): Boolean {
        return if (sum > salary * 2 || term > 120) {
            println("your loan is rejected")
            false
        } else {
            true
        }
    }
}
