package lesson4BankApplication.model.bank

data class Loan(
    var loanSum: Int,
    var loanPercent: Int,
    var loanTerm: Int,
) {
    var loanPayDay: Int = 0
}