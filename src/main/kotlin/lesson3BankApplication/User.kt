package lesson3BankApplication

data class User(
    var id: Int,
    var name: String,
    var sName: String,
    var age: Int,
    var salary: Int,
    var loanList: MutableList<Loan> = mutableListOf()
)