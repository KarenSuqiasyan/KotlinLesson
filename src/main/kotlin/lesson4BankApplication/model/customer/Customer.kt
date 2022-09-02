package lesson4BankApplication.model.customer


data class Customer(
    var salary: Int,
    var passport: Passport,
    var balance: Int = 0
)