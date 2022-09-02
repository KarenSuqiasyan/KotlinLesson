package lesson4BankApplication.ui.bank.products

import lesson4BankApplication.ui.customer.CustomerMenu
import lesson4BankApplication.ui.MainMenu

object BankProducts {

    private val cashInCashOut = CashInCashOutActions()
    private val loansActions = LoansActions()
    private val creditCardActions = CreditCardActions()
    fun menuForBankProducts() {
        for (actions in BankProductsEnum.values()) {
            println(actions)
        }
        when (MainMenu.scan.nextInt()) {
            1 -> loansActions.getLoan()
            2 -> cashInCashOut.cashIn()
            3 -> cashInCashOut.cashOut()
            4 -> creditCardActions.getCreditCard()
            5 -> CustomerMenu.menuForCustomer()
            else -> menuForBankProducts()
        }
    }

    enum class BankProductsEnum(private val key: Int, private val value: String) {
        GET_LOAN(key = 1, value = "Get a Loan"),
        CASH_IN(key = 2, value = "Cash In"),
        CASH_OUT(key = 3, value = "Cash Out"),
        CREDIT_CARD(key = 4, value = "Credit Card"),
        BACK(key = 5, value = "Back");

        override fun toString(): String {
            return "$key. $value"
        }
    }
}

