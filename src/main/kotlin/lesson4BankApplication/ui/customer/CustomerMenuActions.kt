package lesson4BankApplication.ui.customer

import lesson4BankApplication.model.bank.Bank
import lesson4BankApplication.model.customer.Customer
import lesson4BankApplication.model.customer.Passport
import lesson4BankApplication.ui.MainMenu

class CustomerMenuActions {

    companion object {
        fun registration() {

            print("\n name: ")
            val name = MainMenu.scan.next()
            print("\n surname: ")
            val sName = MainMenu.scan.next()
            var age: Int
            do {
                print("\n age: ")
                validation()
                age = MainMenu.scan.nextInt()
            } while (age < 0)
            var salary: Int
            do {
                print("\n salary: ")
                validation()
                salary = MainMenu.scan.nextInt()
            } while (salary < 0)
            var id: Int
            do {
                print("\n id: ")
                validation()
                id = MainMenu.scan.nextInt()
            } while (id < 0)
            for (value in Bank.customers) {
                while (id == value.key) {
                    println("wrong ID, there is a customer with this ID")
                    print("enter correct ID")
                    id = MainMenu.scan.nextInt()
                }
            }
            val passport = Passport(name = name, sName = sName, age = age, id = id)
            val customer = Customer(salary = salary, passport = passport)
            Bank.customers[id] = customer
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

        fun validation() {
            while (!MainMenu.scan.hasNextInt()) {
                val input: String = MainMenu.scan.next()
                println("$input is not a valid number")
                print("please enter the valid number: ")
            }
        }
    }
}