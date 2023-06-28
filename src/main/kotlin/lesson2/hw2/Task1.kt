package lesson2.hw2
import java.util.Scanner


/**
 * Реализуйте метод, который запрашивает у пользователя
 * ввод дробного числа (типа float) или double,
 * и возвращает введенное значение.
 * Ввод текста вместо числа не должно приводить к падению приложения,
 * вместо этого, необходимо повторно
 * запросить у пользователя ввод данных.
 */

fun main() {
    val userInput = getDoubleInput()
    println("Введенное число: $userInput")
}

fun getDoubleInput(): Double {
    val scanner = Scanner(System.`in`)
    var number = 0.0
    var isValidInput = false

    while (!isValidInput) {
        print("Введите дробное число: ")
        val input = scanner.nextLine()

        try {
            number = input.toDouble()
            val integerValue = number.toInt()
            if (number != integerValue.toDouble()) {
                isValidInput = true
            } else {
                throw NumberFormatException()
            }
        } catch (e: NumberFormatException) {
            println("Некорректный формат числа или вы ввели целое число. Пожалуйста, введите дробное число.")
        }
    }
    return number
}