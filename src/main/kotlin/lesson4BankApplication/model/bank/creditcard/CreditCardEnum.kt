package lesson4BankApplication.model.bank.creditcard

enum class CreditCardEnum(val key: Int, private val type: String, private val description: String) {

    VISA_CLASSIC(
        1,
        "VISA_CLASSIC",
        "Service fee: AMD 5,000 annually; "
    ),
    MASTERCARD_STANDARD(
        2,
        "Mastercard Standard",
        "Service fee:AMD 5,000 annually; "
    ),

    VISA_INFINITE(
        3,
        "Visa Infinite",
        "Service fee: AMD 10,000 monthly/ AMD 100,000 annually"
    );

    override fun toString(): String {
        return "$type. $description"
    }
}