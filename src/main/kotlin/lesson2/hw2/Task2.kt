package lesson2.hw2

/**
 * Если необходимо, исправьте данный код
 * (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
 *
 * В данном коде отсутствует объявление и инициализация массива intArray.
 * Поэтому возникает ошибка компиляции, указывающая на отсутствие такого символа или переменной.
 *
 * Для исправления ошибки необходимо объявить и проинициализировать массив intArray
 *
 * @throws ArrayIndexOutOfBoundsException:
 * Если массив intArray не содержит элемента с индексом 8,
 * то при выполнении операции intArray[8] будет
 * выброшено исключение ArrayIndexOutOfBoundsException.
 *
 * @throws ArithmeticException:
 * Если переменная d имеет значение 0,
 * то при выполнении операции intArray[8] / d
 * будет выброшено исключение ArithmeticException из-за деления на ноль.
 */
fun main() {
    try {
        val d = 4
        val intArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val catchedRes1 = intArray[8] / d
        println("catchedRes1 = $catchedRes1")
    } catch (e: ArithmeticException) {
        println("Catching ArithmeticException: $e")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Catching ArrayIndexOutOfBoundsException: $e")
    }
}
