import kotlin.reflect.full.*

fun main() {
    // Check that Account is a superclass of Savings and Current
    val savings: Boolean = Savings::class.isSubclassOf(Account::class)
    val current: Boolean = Current::class.isSubclassOf(Account::class)

    // Get the properties declared in each class
    val accountProperties = Account::class.declaredMemberProperties
    val savingsProperties = Savings::class.declaredMemberProperties
    val currentProperties = Current::class.declaredMemberProperties

    // Check that each field has the correct name and type
    require (savingsProperties.any {
        it.name == "interestRate" && it.returnType == Double::class.createType() })
    { "'interestRate: Double' should be defined in Savings" }

    require (currentProperties.any {
        it.name == "debitCardNumber" && it.returnType == Long::class.createType() })
    { "'debitCardNumber: Long' should be defined in Current" }

    require (currentProperties.any {
        it.name == "pin" && it.returnType == Int::class.createType() })
    { "'pinNumber: Int' should be defined in Current" }

    require (accountProperties.any {
        it.name == "accountNumber" && it.returnType == Int::class.createType() })
    { "'accountNumber: Int' should be defined in Account" }

    require (accountProperties.any {
        it.name == "sortCode" && it.returnType == Int::class.createType() })
    { "'sortCode: Int' should be defined in Account" }

    require (accountProperties.any {
        it.name == "balancePence" && it.returnType == Long::class.createType() })
    { "'balancePence: Int' should be defined in Account" }

    if (savings && current) {
        print("The accounts are structured as follows:\n\n")
        print("\t   Account\t\n")
        print("\t     / \\\n")
        print("\t    /   \\\n")
        print("\t   /     \\\n")
        print("\t  /       \\\n")
        print("\tSavings  Current\n")
    } else {
        print("Account is not a superclass of Savings and Current")
    }
}
