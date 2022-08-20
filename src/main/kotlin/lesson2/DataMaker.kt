package lesson2

import java.util.Scanner
import kotlin.properties.Delegates
import kotlin.random.Random

class DataMaker {

    var numberOfElements = (0..20).random()

    fun arrayMaker(): MutableList<Int> {
        val integerList = mutableListOf<Int>()
        for (i in 1..numberOfElements) {
            val number = (0..30).random()
            integerList.add(number)
        }
        return integerList
    }
}