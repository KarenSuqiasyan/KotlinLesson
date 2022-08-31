package lesson3BankApplication.model

import lesson3BankApplication.Loan

data class User(
    var id: Int,
    var name: String,
    var sName: String,
    var age: Int,
    var salary: Int,
    var loanList: MutableList<Loan> = mutableListOf()

)