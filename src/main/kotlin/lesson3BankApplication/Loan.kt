package lesson3BankApplication

import java.util.*

class Loan {

    var loanSum = 0
    var loanPercent = 0
    var loanTerm = 0
    var loanPayDay = 0

    fun loanGraphicMethod(loanSum: Int, loanPercent: Int, term: Int, payDay: Int) {

        var varkiGumar = loanSum
        var mnacord: Int
        var tokos: Int
        var mayrgumar: Int
        val month = 6
        mayrgumar = varkiGumar / term
        val calendar = Calendar.getInstance()
        calendar[Calendar.DATE] = payDay
        for (i in 0 until term) {
            calendar.add(Calendar.MONTH, 1)
            mnacord = varkiGumar - mayrgumar
            tokos = mnacord * loanPercent / 100
            if (i > 1) {
                tokos = varkiGumar * loanPercent / 100
            }
            varkiGumar -= mayrgumar
            if (mayrgumar > mnacord) {
                mayrgumar = mnacord
            }
            print(
                calendar[Calendar.YEAR]
                    .toString() + "-"
                        + calendar.getDisplayName(
                    Calendar.MONTH, Calendar.SHORT,
                    Locale.US
                ) + "-" + calendar[Calendar.DATE]
            )
            print(" mayr gumar - $mayrgumar")
            print(" tokos - $tokos")
            print(" mnacord - $mnacord")
            println(" ")
        }
        UserCommunicationClass.start()
    }

    override fun toString(): String {
        return "Loan(loanSum=$loanSum, loanPercent=$loanPercent, loanTerm=$loanTerm, loanPayDay=$loanPayDay)"
    }
}