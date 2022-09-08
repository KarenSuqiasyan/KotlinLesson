package lesson4BankApplication.model.bank.creditcard

import lesson4BankApplication.model.bank.Bank

data class CreditCard(var cardType: CreditCardEnum = CreditCardEnum.VISA_CLASSIC, var balance: Long = 0)


