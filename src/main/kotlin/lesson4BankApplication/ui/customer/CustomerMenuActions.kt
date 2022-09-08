package lesson4BankApplication.ui.customer

import lesson4BankApplication.model.bank.Bank
import lesson4BankApplication.model.customer.Customer
import lesson4BankApplication.model.customer.Passport
import lesson4BankApplication.ui.MainMenu
import lesson4BankApplication.validation.Validation

class CustomerMenuActions {

    fun registration() {

        print("\n name: ")
        val name = MainMenu.scan.next()
        print("\n surname: ")
        val sName = MainMenu.scan.next()
        var age: Int
        do {
            print("\n age: ")
            Validation.validForRegistration()
            age = MainMenu.scan.nextInt()
        } while (false)
        var salary: Int
        do {
            print("\n salary: ")
            Validation.validForRegistration()
            salary = MainMenu.scan.nextInt()
        } while (false)
        var id: Int
        do {
            print("\n id: ")
            Validation.validForRegistration()
            id = MainMenu.scan.nextInt()
        } while (false)
        for (value in Bank.customerList) {
            while (id == value.key) {
                println("wrong ID, there is a customer with this ID")
                print("enter correct ID")
                id = MainMenu.scan.nextInt()
            }
        }
        val passport = Passport(name = name, sName = sName, age = age, id = id)
        val customer = Customer(salary = salary, passport = passport)
        Bank.customerList[id] = customer
        println("registration completed")
        CustomerMenu.menuForCustomer()
    }

    fun calculator(): Int {
        print("sum: ")
        val sum = MainMenu.scan.nextInt()
        print("year: ")
        val year = MainMenu.scan.nextInt()
        print("percent: ")
        val percent = MainMenu.scan.nextInt()
        val monthPayment = ((sum * 0.57 * year * percent / 100 + sum) / year / 12).toInt()
        print("your month payment = : $monthPayment")
        CustomerMenu.menuForCustomer()
        return monthPayment
    }


}
