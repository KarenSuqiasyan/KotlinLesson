package lesson5highorderfun


fun main() {

        addTwoNumbers(2, 7, object : MyInterface {   // Using Interface / OOPs way
            override fun execute(sum: Int) {
                println(sum)    // Body
            }
        })
}

fun addTwoNumbers(a: Int, b: Int, action: MyInterface) {    // Using Interface / Object Oriented Way
    val sum = a + b
    action.execute(sum)
}
interface MyInterface {
    fun execute(sum: Int)
}
