package lesson3BankApplication

import lesson3BankApplication.menu.UserCommunicationClass
import lesson3BankApplication.model.User

class Bank {

    var usersList = mutableListOf<User>()

    //    private var scan = Scanner(System.`in`)
    private var scan = UserCommunicationClass.scan


    fun registration() {
        println("\n name: ")
        val name = scan.next()
        println("\n surname: ")
        val sName = scan.next()
        var age: Int = 0
        do {
            println("\n age: ")
            while (!scan.hasNextInt()) {
                val input: String = scan.next()
                println("$input is not a valid number")
                println("please enter the valid number")
            }
            age = scan.nextInt()
        } while (age < 0)
        var salary: Int = 0
        do {
            println("\n salary: ")
            while (!scan.hasNextInt()) {
                val input: String = scan.next()
                println("$input is not a valid number")
                println("please enter the valid number")
            }
            salary = scan.nextInt()
        } while (salary < 0)
        var id: Int = 0
        do {
            println("\n id: ")
            while (!scan.hasNextInt()) {
                val input: String = scan.next()
                println("$input is not a valid number")
                println("please enter the valid number")
            }
            id = scan.nextInt()
        } while (id < 0)
        for (value in usersList) {
            while (id == value.id) {
                println("wrong ID, there is a user with this ID")
                println("enter correct ID")
                id = scan.nextInt()
            }
        }
        val user = User(name = name, sName = sName, age = age, salary = salary, id = id)
        usersList.add(user)
        UserCommunicationClass.start()
    }

    fun goToBank() {
        println("we can offer you a credit")
        println("please wright your ID: ")
        val id: Int = scan.nextInt()
        val user = usersList.find { it.id == id }
        if (user != null) {
            println("you are already our customer");loan(user, userList = usersList)
        } else {
            println("you are not our customer")
            registration()
        }

    }

    fun userGeneration() {
        for (item in usersList.size..10) {
            val user = User(
                name = " Name$item",
                sName = " Surname$item",
                age = (18..100).random(),
                salary = (100000..1000000).random(),
                id = usersList.size
            )
            usersList.add(user)
        }
    }

    fun calculator(): Int {
        println("sum: ")
        val sum = scan.nextInt()
        println("year: ")
        val year = scan.nextInt()
        println("percent: ")
        val percent = scan.nextInt()
        val monthPayment = ((sum * 0.57 * year * percent / 100 + sum) / year / 12).toInt()
        println("your month payment = : $monthPayment")
        UserCommunicationClass.start()
        return monthPayment
    }

    private fun loan(user: User, userList: MutableList<User>) {

        println("wright the sum: ")
        val sum = scan.nextInt()
        println("wright the term in month: ")
        val term = scan.nextInt()
        val percent = if (sum > 200000) 12 else 14
        val acra = Acra()
        if (acra.loanApprove(sum, term, user.salary)) {
            val loan = Loan()
            loan.loanSum = sum
            loan.loanPercent = percent
            loan.loanTerm = term
            println("congratulations u get loan " + loan.loanSum + " AMD")
            println("enter what day u want to pay your loan")
            val payDay: Int = scan.nextInt()
            loan.loanPayDay = payDay
            user.loanList.add(loan)
            for (value in userList) {
                for (i in 0 until value.loanList.size) {
                    println(
                        "Loan Sum - " + value.loanList[i]
                            .loanSum + " Loan percent - " + value.loanList[i]
                            .loanPercent + " Loan term in month - " + value.loanList[i].loanTerm
                    )
                    value.loanList[i].loanGraphicMethod(
                        value.loanList[i].loanSum,
                        value.loanList[i].loanPercent,
                        value.loanList[i].loanTerm,
                        value.loanList[i].loanPayDay
                    )
                    println(" ")
                }
            }
            UserCommunicationClass.start()
        } else {
            UserCommunicationClass.start()
        }
    }

    fun showUserList() {
        usersList.forEach {
            println(it)
        }
        UserCommunicationClass.start()
    }

    //    fun Int.numberValidation(num: Int): Int = run {
//        while (!scan.hasNextInt()) {
//            println("That's not a number!")
//            scan.next()
//        }
//        return this
//    }
//
//    private fun String.textValidation(text: String): String = run {
//        while (text != String()) {
//            println("please enter correct text")
//            scan.nextLine()
//        }
//        while (!scan.hasNextLine()) {
//            println("That's not a text!")
//            scan.next()
//        }
//        return text
//    }
}