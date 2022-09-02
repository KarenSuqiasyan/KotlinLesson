package lesson4BankApplication.model.bank.creditcard

data class CreditCard(var cardType: CreditCardEnum = CreditCardEnum.VISA_CLASSIC, var balance: Long = 0) {

}