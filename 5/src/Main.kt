fun main() {
    print("Введите первое число: ")
    val number1 = readln().toDoubleOrNull() ?: return println("Ошибка ввода первого числа.")

    print("Введите второе число: ")
    val number2 = readln().toDoubleOrNull() ?: return println("Ошибка ввода второго числа.")

    print("Введите третье число: ")
    val number3 = readln().toDoubleOrNull() ?: return println("Ошибка ввода третьего числа.")

    if (number1 == number2 && number2 == number3) {
        println("Ошибка")
    } else {
        val average = (number1 + number2 + number3) / 3
        println("Среднее значение: $average")
    }
}