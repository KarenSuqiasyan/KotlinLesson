package lesson4BankApplication.model.bank.Loan

data class Loan(
    var loanSum: Int,
    var loanPercent: Int,
    var loanTerm: Int,
) {
    var loanPayDay: Int = 0
    lateinit var graphic: Graphic
    override fun toString(): String {
        return "Loan(loanSum=$loanSum, loanPercent=$loanPercent, loanTerm=$loanTerm, loanPayDay=$loanPayDay, graphic=$graphic)"
    }
}






