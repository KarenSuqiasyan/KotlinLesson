package lesson4BankApplication.usercomunication.customermenu

enum class CustomerMenuEnum(private val key: Int, private val value: String) {

    REGISTRATION(key = 1, value = "Registration"),
    BANK(key = 2, value = "Bank"),
    CALCULATOR(key = 3, value = "Calculator"),
    BACK(key = 4, value = "Back");


    override fun toString(): String {
        return "$key. $value"
    }
}