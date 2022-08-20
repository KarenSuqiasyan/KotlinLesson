package lesson1

fun main() {
    println(getColor(2))
}

enum class Color(val code: Int, val colorCode: String) {
    RED(1, "#123456"),
    GREEN(2, "#128456"),
    BLUE(3, "#123956")
}

object SearchColor {
    private val colorsList = Color.values()
    private val colorMap: MutableMap<Int, Color> = mutableMapOf<Int, Color>()
    fun colorMapGenerator(): MutableMap<Int, Color> {
        for (item in colorsList) {
            colorMap[item.code] = item
        }
        return colorMap
    }
}

val map = SearchColor.colorMapGenerator()
fun getColor(code: Int): Color? = map[code]