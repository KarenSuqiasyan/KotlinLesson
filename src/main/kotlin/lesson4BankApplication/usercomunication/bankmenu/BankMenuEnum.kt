package lesson4BankApplication.usercomunication.bankmenu

enum class BankMenuEnum(private val key: Int, private val value: String) {

    SHOW_CUSTOMERS(key = 1, value = "Show Customers"),
    SHOW_LOANS(key = 2, value = "Show Loans"),
    BACK(key = 3, value = "Back");

    override fun toString(): String {
        return "$key. $value"
    }
}