package lesson4BankApplication.validation

import lesson4BankApplication.ui.MainMenu

class Validation {

    companion object {
        fun validForRegistration() {
            while (!MainMenu.scan.hasNextInt()) {
                val input: String = MainMenu.scan.next()
                println("$input is not a valid number")
                print("please enter the valid number: ")
            }
        }
        fun validForMenu(): Int {
            var scan: Int
            do {
                validForRegistration()
                scan = MainMenu.scan.nextInt()
            } while (false)
            return scan
        }
    }
}