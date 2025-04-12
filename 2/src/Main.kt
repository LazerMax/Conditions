fun main() {
    println("Введите число:")
    val input = readlnOrNull()

    if (input != null && input.all { it.isDigit() }) {
        val age = input.toInt()
        if (age > 18){
            println("Вам уже всё можно")
        } else if (age == 18){
            println("Ура, Вам 18 лет!")
        }else{
            println("Вы ещё слишком молоды")
        }
    } else {
        println("Некорректные входные данные")
    }
}