package lesson2.hw2

/**
 * Дан следующий код, исправьте его там, где требуется
 * (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
 *
 * @throws ArithmeticException Если происходит деление на ноль.
 *
 * @throws IndexOutOfBoundsException Если происходит выход за пределы массива.
 */

fun main(args: Array<String>) {
    try {
        val a = 90
        val b = 3
        println(a / b)
        printSum(23, 234)
        val abc = arrayOf(1, 2)
        abc[2] = 9
    } catch (ex: ArithmeticException) {
        println("Деление на ноль обработано, программа остановлена! ${ex.message}")
    } catch (ex: IndexOutOfBoundsException) {
        println("Массив выходит за пределы своего размера! ${ex.message}")
    } catch (ex: Exception) {
        println("Произошла ошибка: ${ex.message}")
    }
}

/**
 * Функция выполняет сложение двух чисел и выводит результат на печать.
 *
 * @param a Первое число для сложения.
 * @param b Второе число для сложения.
 * @return Сумма двух чисел.
 *
 * @throws NullPointerException: Если аргументы a или b равны null,
 * их сложение вызовет NullPointerException.
 * Чтобы избежать этого, необходимо убедиться,
 * что переданные значения не являются нулевыми.
 *
 * @throws ArithmeticException: Если тип данных Int
 * используется для представления целых чисел и
 * происходит переполнение при сложении a + b,
 * то может возникнуть ArithmeticException.
 * Например, если сумма a + b превышает максимальное значение,
 * которое можно представить типом Int.
 *
 * @throws NumberFormatException: Если значения аргументов a или b
 * не могут быть корректно преобразованы в тип Int,
 * то может возникнуть NumberFormatException.
 * Например, если аргументы содержат символы, отличные от цифр.
 */

fun printSum(a: Int?, b: Int?) {
    try {
        println(a!! + b!!)
    } catch (ex: NullPointerException) {
        println("Произошла ошибка NullPointerException: ${ex.message}")
    } catch (ex: ArithmeticException) {
        println("Произошла ошибка ArithmeticException: ${ex.message}")
    } catch (ex: NumberFormatException) {
        println("Произошла ошибка NumberFormatException: ${ex.message}")
    } catch (ex: Exception) {
        println("Произошла другая ошибка: ${ex.message}")
    }
}
