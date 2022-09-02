package lesson4BankApplication.model.bank.Loan

import java.util.*

class Graphic(var loanSum: Int, var loanPercent: Int, var term: Int, var payDay: Int) {

    fun loanGraphicMethod(): Graphic {
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
        return Graphic(loanSum, loanPercent, term, payDay)
    }
}