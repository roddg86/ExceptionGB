package lesson3.hw3.utils.logger

import lesson3.hw3.utils.Constants
import java.io.IOException
import java.util.logging.FileHandler
import java.util.logging.Level
import java.util.logging.Logger
import java.util.logging.SimpleFormatter

/**
 * В конструкторе класса происходит инициализация объектов Logger и FileHandler.
 * Объект Logger используется для регистрации и записи сообщений лога,
 * а объект FileHandler отвечает за обработку файла, куда будут записываться сообщения.
 *
 * Блок init выполняет инициализацию объектов и других операций при создании экземпляра класса.
 * В блоке init создается экземпляр FileHandler с указанием имени файла "log.txt" и
 * флагом true, что означает, что сообщения будут добавляться в конец файла.
 * Затем устанавливается форматтер для FileHandler с помощью SimpleFormatter().
 * После этого FileHandler добавляется в Logger с помощью метода addHandler.
 *
 * Класс также предоставляет три метода для логирования различных типов сообщений:
 *
 * logInfo: Принимает строковое сообщение и записывает его в лог с уровнем INFO.
 * logWarning: Принимает строковое сообщение и записывает его в лог с уровнем WARNING.
 * logError: Принимает строковое сообщение и объект Throwable (необязательно) и записывает их в лог с уровнем SEVERE.
 *
 * Обработка исключений: В случае возникновения исключения типа IOException (ошибка ввода-вывода),
 * блок catch перехватывает исключение,
 * выводит сообщение об ошибке и стек вызовов в консоль с помощью println,
 * а затем повторно возбуждает исключение, передавая его дальше для обработки вышеуровневым кодом.
 */

class UserDataLogger {
    private val logger: Logger = Logger.getLogger(UserDataLogger::class.java.name)
    private val fileHandler: FileHandler

    init {
        try {
            // Создаем обработчик файла для логирования
            fileHandler = FileHandler("log.txt", true)
            fileHandler.formatter = SimpleFormatter()

            // Добавляем обработчик файла к логгеру
            logger.addHandler(fileHandler)
        } catch (e: IOException) {
            println(Constants.Message.LOG_ERROR)
            e.printStackTrace()
            throw e
        }
    }

    fun logInfo(message: String) {
        logger.log(Level.INFO, message)
    }

    fun logWarning(message: String) {
        logger.log(Level.WARNING, message)
    }

    fun logError(message: String, exception: Throwable? = null) {
        logger.log(Level.SEVERE, message, exception)
    }
}