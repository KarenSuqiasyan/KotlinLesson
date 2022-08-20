package lesson2

import java.util.*

class MainLogic {

    companion object {

        fun maxNumber(array: MutableList<Int>) {
            var largestElement = array[0]
            for (number in array) {
                if (largestElement < number)
                    largestElement = number
            }
            println("\nthe largest element in array is : $largestElement")
        }

        fun minNumber(array: MutableList<Int>) {
            var smallestElement = array[0]
            for (number in array) {
                if (smallestElement > number)
                    smallestElement = number
            }
            println("\nthe smallest element in array is : $smallestElement")
        }

        fun showList(array: MutableList<Int>) {
            println("\nthis is the arrayList : $array")
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
            println("the sorted Array from min -> max $array")
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
            println("the sorted Array from max -> min $array")
            return array
        }

        fun findTheCountOfNumber(array: MutableList<Int>): Int {
            println("\nplease enter the number")
            val scan = Scanner(System.`in`)
            val number = scan.nextInt()
            var count = 0
            for (item in array) {
                if (item == number) {
                    count++
                }
            }
            println("\nnumber of $number in array is $count")
            return count
        }

        fun findMostPopularNumber(array: MutableList<Int>) {

        }
    }
}

