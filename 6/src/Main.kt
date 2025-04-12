fun main() {
    print("Введите значение экспорта (в денежных единицах): ")
    val export = readln().toDoubleOrNull() ?: return println("Ошибка ввода значения экспорта.")

    print("Введите значение импорта (в денежных единицах): ")
    val import = readln().toDoubleOrNull() ?: return println("Ошибка ввода значения импорта.")

    val tradeBalance = export - import

    if (tradeBalance > 0) {
        val profit = tradeBalance * 0.1
        println("Положительное сальдо торгового баланса: $tradeBalance")
        println("Прибыль: $profit")
    } else if (tradeBalance < 0) {
        val loss = -tradeBalance * 0.05
        println("Отрицательное сальдо торгового баланса: $tradeBalance")
        println("Потери: $loss")
    } else {
        println("Сальдо торгового баланса равно нулю: $tradeBalance")
    }
}