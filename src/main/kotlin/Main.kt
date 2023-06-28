import java.util.Scanner

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