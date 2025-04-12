fun main() {
    val number1 = 2
    val number2 = 6

    println("У вас есть числа: $number1 и $number2")
    println("1. Добавить")
    println("2. Отнять")
    println("0. Ничего")

    print("Выберите действие: ")
    val choice = readln().toIntOrNull()

    if (choice != null) {
        when (choice) {
            1 -> {
                val sum = number1 + number2
                println("Результат сложения: $sum")
            }
            2 -> {
                val difference = number1 - number2
                println("Результат вычитания: $difference")
            }
            0 -> {
                println("Действие не выбрано.")
            }
            else -> {
                println("Некорректный ввод.")
            }
        }
    } else {
        println("Некорректный ввод. Введите число.")
    }
}