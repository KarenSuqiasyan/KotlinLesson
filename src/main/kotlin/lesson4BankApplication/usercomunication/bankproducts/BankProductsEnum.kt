package lesson4BankApplication.usercomunication.bankproducts

enum class BankProductsEnum(private val key: Int, private val value: String) {

    GET_LOAN(key = 1, value = "Get a Loan"),
    BACK(key = 2, value = "Back");

    override fun toString(): String {
        return "$key. $value"
    }
}