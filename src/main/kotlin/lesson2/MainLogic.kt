package lesson2

import java.util.*

class MainLogic {

    companion object {
        var userClass = UserClass()

        fun maxNumber(array: MutableList<Int>) {
            var largestElement = array[0]
            for (number in array) {
                if (largestElement < number)
                    largestElement = number
            }
            println("the largest element in array is : $largestElement")
            userClass.startMethod()
        }

        fun minNumber(array: MutableList<Int>) {
            var smallestElement = array[0]
            for (number in array) {
                if (smallestElement > number)
                    smallestElement = number
            }
            println("the smallest element in array is : $smallestElement")
            userClass.startMethod()
        }

        fun showList(array: MutableList<Int>) {
            println("this is the arrayList : $array")
            userClass.startMethod()
        }

        fun minToMaxSort(array: MutableList<Int>): MutableList<Int> {
            var bool = true
            while (bool) {
                bool = false
                for (i in 0 until array.size - 1) {
                    if (array[i] > array[i + 1]) {
                        val empty = array[i]
                        array[i] = array[i + 1]
                        array[i + 1] = empty

                        bool = true
                    }
                }
            }
            println(array)
            userClass.startMethod()
            return array
        }

        fun maxToMinSort(array: MutableList<Int>): MutableList<Int> {
            var bool = true
            while (bool) {
                bool = false
                for (i in 0 until array.size - 1) {
                    if (array[i] < array[i + 1]) {
                        val empty = array[i]
                        array[i] = array[i + 1]
                        array[i + 1] = empty
                        bool = true
                    }
                }
            }
            println(array)
            userClass.startMethod()
            return array
        }

        fun findTheCountOfNumber(array: MutableList<Int>): Int {
            println("please enter the number")
            val scan = Scanner(System.`in`)
            val number = scan.nextInt()
            var count = 0
            for (item in array) {
                if (item == number) {
                    count++
                }
            }
            println("number of $number in array is $count")
            userClass.startMethod()
            return count
        }

        fun findMostPopularNumber(array: MutableList<Int>) {

        }
    }
}

