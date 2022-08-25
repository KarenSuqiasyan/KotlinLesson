package lesson3BankApplication

import lesson2.MainLogic
import java.util.*

object UserCommunicationClass {

    var scan = Scanner(System.`in`)
    private var bank = Bank()


    fun start() {
        bank.userGeneration()
        println("\n1. Registration")
        println("\n2. Bank")
        println("\n3. Calculator")
        println("\n4. Show UserList")
        println("\n5. Exit")


        val num = scan.nextInt()

        when (num) {
            1 -> bank.registration()
            2 -> bank.goToBank()
            3 -> bank.calculator()
            4 -> bank.showUserList()
            5 -> System.out
        }
    }
}



