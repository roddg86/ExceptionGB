package lesson3.hw3.utils.exception

/**
 * Класс определяет пользовательское исключение для некорректных аргументов.
 *
 * Он принимает сообщение в качестве параметра в своем конструкторе
 * и передает его в конструктор родительского класса IllegalArgumentException.
 */
class CustomIllegalArgumentException(message: String) : IllegalArgumentException(message)