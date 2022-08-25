package lesson3BankApplication

class Acra {

    fun loanApprove(sum: Int, term: Int, salary: Int): Boolean {
        return if (sum > salary * 2) {
            println("your loan is rejected")
            false
        } else {
            true
        }
    }
}