fun main() {
    print("Введите экспорт: ")
    val export = readln().toInt()

    print("Введите импорт: ")
    val import = readln().toInt()

    val balance = export - import

    if (balance > 0) {
        println("Ваша прибыль составила: $balance")
    } else {
        println("Ваши убытки составили: ${-balance}")
    }
}