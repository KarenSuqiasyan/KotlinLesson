package lesson4BankApplication.usercomunication.mainmenu

enum class MainMenuEnum(private val key: Int, private val value: String) {

    FOR_CUSTOMER(key = 1, value = "For Customer"),
    FOR_BANK_MANAGER(key = 2, value = "For Bank Manager"),
    EXIT(key = 3, value = "Exit");

    override fun toString(): String {
        return "$key. $value"
    }
}