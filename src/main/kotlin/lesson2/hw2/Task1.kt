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

/**
 * Функция предназначена для получения пользовательского ввода дробного числа.
 *
 * В этом коде мы создаем новый экземпляр Scanner с помощью Scanner(input).use,
 * чтобы ограничить его область видимости только внутри блока use.
 * После выполнения блока use, ресурс Scanner автоматически закрывается.
 *
 * Теперь при каждой итерации цикла будет создаваться новый сканер,
 * который будет автоматически закрываться после использования.
 *
 * @throws NumberFormatException и выводится сообщение о некорректном формате числа или вводе целого числа.
 *
 * @return введенное пользователем число при корректном вводе.
 */
fun getDoubleInput(): Double {
    var number = 0.0
    var isValidInput = false

    while (!isValidInput) {
        print("Введите дробное число: ")
        val input = readLine()

        try {
            Scanner(input).use { scanner ->
                number = scanner.nextDouble()
                val integerValue = number.toInt()
                if (number != integerValue.toDouble()) {
                    isValidInput = true
                } else {
                    throw NumberFormatException()
                }
            }
        } catch (e: NumberFormatException) {
            println("Некорректный формат числа или вы ввели целое число. Пожалуйста, введите дробное число.")
        }
    }

    return number
}