package lesson5highorderfun

fun main() {
    val array = arrayOf(1, 2, 3, 4, 5)
    val result = array.map { it * 10 }
    val result2 = array.map { v -> v + 10 }
    val result3 = array.filter {  it < 3 }

    println("$result $result2 $result3")

}