package lesson4BankApplication.ui.bank.products

import lesson4BankApplication.model.bank.Bank
import lesson4BankApplication.model.bank.creditcard.CreditCard
import lesson4BankApplication.model.bank.creditcard.CreditCardEnum
import lesson4BankApplication.model.customer.Customer
import lesson4BankApplication.ui.customer.CustomerMenu
import lesson4BankApplication.ui.MainMenu

class CreditCardActions {

    private lateinit var card: CreditCard
    private val cards = mutableListOf<CreditCard>()

    fun getCreditCard() {

        println("we can offer you a Credit Card")
        println("please wright your ID: ")
        val id: Int = MainMenu.scan.nextInt()
        val isCustomer = Bank.customerList.containsKey(id)
        if (isCustomer) {
            val customer = Bank.customerList[id]
            println("you are already our customer");if (customer != null) {
                createCreditCard(customer)
            }
        } else {
            println("you are not our customer")
            println("please registration first")
            CustomerMenu.menuForCustomer()
        }
    }

    private fun createCreditCard(customer: Customer) {
        for (actions in CreditCardEnum.values()) {
            println("${actions.key} $actions")
        }
        print("choose what type of Credit Card you want: ")
        when (MainMenu.scan.nextInt()) {
            1 -> card = CreditCard(CreditCardEnum.VISA_CLASSIC)
            2 -> card = CreditCard(CreditCardEnum.MASTERCARD_STANDARD)
            3 -> card = CreditCard(CreditCardEnum.VISA_INFINITE)
            else -> CustomerMenu.menuForCustomer()
        }
        cards.add(card)
        Bank.cardlist[customer.passport.id] = cards
        CustomerMenu.menuForCustomer()
    }
}