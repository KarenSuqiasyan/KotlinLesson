package lesson4BankApplication.usercomunication

import lesson4BankApplication.model.bank.Bank
import lesson4BankApplication.model.customer.Customer
import lesson4BankApplication.model.customer.Passport

fun registration() {

    println("\n name: ")
    val name = CustomerMenu.scan.next()
    println("\n surname: ")
    val sName = CustomerMenu.scan.next()
    var age: Int
    do {
        println("\n age: ")
        while (!CustomerMenu.scan.hasNextInt()) {
            val input: String = CustomerMenu.scan.next()
            println("$input is not a valid number")
            println("please enter the valid number")
        }
        age = CustomerMenu.scan.nextInt()
    } while (age < 0)
    var salary: Int
    do {
        println("\n salary: ")
        while (!CustomerMenu.scan.hasNextInt()) {
            val input: String = CustomerMenu.scan.next()
            println("$input is not a valid number")
            println("please enter the valid number")
        }
        salary = CustomerMenu.scan.nextInt()
    } while (salary < 0)
    var id: Int
    do {
        println("\n id: ")
        while (!CustomerMenu.scan.hasNextInt()) {
            val input: String = CustomerMenu.scan.next()
            println("$input is not a valid number")
            println("please enter the valid number")
        }
        id = CustomerMenu.scan.nextInt()
    } while (id < 0)
    for (value in Bank.customers) {
        while (id == value.key) {
            println("wrong ID, there is a customer with this ID")
            println("enter correct ID")
            id = CustomerMenu.scan.nextInt()
        }
    }
    val passport = Passport(name = name, sName = sName, age = age, id = id)
    val customer = Customer(salary = salary, passport)
    Bank.customers[id] = customer
    println("registration completed")
    CustomerMenu.menuForCustomer()
}

