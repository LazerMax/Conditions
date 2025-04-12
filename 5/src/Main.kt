fun main() {
    print("Введите три числа: ")
    val (a, b, c) = readln().split(" ").map { it.toInt() }

    val mid = if ((a==b) && (b==c)) "Ошибка"
    else if ((a in b..c) || (a in c..b)) a
    else if ((b in a..c) || (b in c..a)) b
    else if ((c in a..b) || (c in b..a)) c
    else "Системная ошибка"

    println("Среднее число: $mid")
}