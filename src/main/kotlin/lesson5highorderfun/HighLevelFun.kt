package lesson5highorderfun

fun main() {

    // 1st version
    val test: String = "Hello" // is the same es code below

    val myLambda: (Int) -> Unit = { s: Int -> println(s) } // Lambda Expression [ Function ]
    addTwoNumbers(2, 7, myLambda)
    addTwoNumbers(2, 7, { s: Int -> println(s) })
    addTwoNumbers(2, 7) { s: Int -> println(s) }

    // 2nd version
    val myLambda2: (Int, Int) -> Int = { x: Int, y: Int -> x + y } // Lambda Expression [ Function ]

    addTwoNumbers2(2, 7, myLambda2)
    addTwoNumbers2(2, 7, { x: Int, y: Int -> x + y })
    addTwoNumbers2(2, 7) { x, y -> x + y }

    // 3rd version

    var result = 0

    addTwoNumbers3(2,7) { x, y -> result = x + y }
    println(result)
}

fun addTwoNumbers(a: Int, b: Int, action: (Int) -> Unit) {  // High Level Function with Lambda as Parameter
    val sum = a + b
    action(sum) // print(sum)
    // println(sum)  // Body
}

fun addTwoNumbers2(a: Int, b: Int, action: (Int, Int) -> Int) {  // High Level Function with Lambda as Parameter
    val result = action(a, b) // x + y = a + b = 2 + 7 = 9
    println(result)
}

fun addTwoNumbers3(a: Int, b: Int, action: (Int, Int) -> Unit) {  // High Level Function with Lambda as Parameter
    action(a, b) // result = x + y = a + b = 2 + 7 = 9
}


//why to use higher order functions ->
// because when you start to do Android programming,
// you will see a lot of higher order functions there
