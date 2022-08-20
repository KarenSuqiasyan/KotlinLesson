package lesson2

import java.util.*

class UserClass {

    private val dataMaker = DataMaker()
    private val integerLIst = dataMaker.arrayMaker()
    var scan = Scanner(System.`in`)

    fun startMethod() {
        println("hello you can choose what you want to do")

        println("1. find the the biggest number in Array")
        println("2. find the the smallest number in Array")
        println("3. show the Array")
        println("4. sort from minimum value to maximum value in Array")
        println("5. sort from maximum value to minimum value in Array")
        println("6. find the count of number that you input")

        var num: Int
        do {
            println("please enter the number of action")
            while (!scan.hasNextInt()) {
                println("That's not a number!")
                scan.next()
            }
            num = scan.nextInt()
        } while (num < 1 || num > 6)

        when (num) {
            1 -> MainLogic.maxNumber(integerLIst)
            2 -> MainLogic.minNumber(integerLIst)
            3 -> MainLogic.showList(integerLIst)
            4 -> MainLogic.minToMaxSort(integerLIst)
            5 -> MainLogic.maxToMinSort(integerLIst)
            6 -> MainLogic.findTheCountOfNumber(integerLIst)
        }
    }
}